using Dapper;
using HarryPotterBooks.Model;
using MySql.Data.MySqlClient;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Reflection.Metadata.BlobBuilder;

namespace HarryPotterBooks.Data.Repositories
{
    public class UserBooksRepository : IUserBookRepository
    {
        private readonly MySQLConfiguration _connectionString;
        public UserBooksRepository(MySQLConfiguration connectionString)
        {
            _connectionString = connectionString;
        }

        protected MySqlConnection dbConnection()
        {
            return new MySqlConnection(_connectionString.ConnectionString);
        }

        public async Task<IEnumerable<Books>> GetAllBooks()
        {
            var db = dbConnection();

            var sql = @"
                        SELECT * FROM tbBooks ";
            return await db.QueryAsync<Books>(sql, new { });
        }

        public async Task<IEnumerable<User>> GetAllUsers()
        {
            var db = dbConnection();

            var sql = @"
                        SELECT * FROM tbUser ";
            return await db.QueryAsync<User>(sql, new { });
        }

        public async Task<Books> GetBookDetails(string name)
        {
            var db = dbConnection();

            var sql = @"
                        SELECT * from tbBooks WHERE Titulo = @Name ";
            return await db.QueryFirstOrDefaultAsync<Books>(sql, new { Name = name });
        }

        public async Task<bool> InsertBook(Books books)
        {
            var db = dbConnection();

            var sql = @"
                        INSERT INTO tbBooks (Titulo, Sumario, Autor, Ano_lancamento, Ordem, Cover, NumPaginas)
                        values(@Titulo, @Sumario, @Autor, @Ano_lancamento, @Ordem, @Cover, @NumPaginas)
                            ";
            var result = await db.ExecuteAsync(sql, new { books.Titulo, books.Sumario, books.Autor, books.Ano_lancamento, books.Ordem, books.Cover, books.NumPaginas });

            return result > 0;
        }

        public async Task<bool> InsertUser(User user)
        {
            var db = dbConnection();

            var sql = @"
                        INSERT INTO tbUser (NameUser, Email, Senha)
                        values(@NameUser, @Email, @Senha)
                            "
            ;
            var result = await db.ExecuteAsync(sql, new { user.NameUser, user.Email, user.Senha });
            return result > 0;
        }

        public async Task<bool> UpdateUser(User user)
        {
            var db = dbConnection();

            var sql = @"
                        UPDATE tbUser 
                        SET NameUser = @NameUser,  Email = @Email, Senha = @Senha
                        WHERE IdUser = @IdUser
                            "
            ;
            var result = await db.ExecuteAsync(sql, new { user.IdUser, user.NameUser, user.Email, user.Senha });

            return result > 0;
        }
    }
}
