using HarryPotterBooks.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HarryPotterBooks.Data.Repositories
{
    public interface IUserBookRepository
    {
        Task<IEnumerable<User>> GetAllUsers();
        Task<bool> InsertUser(User user);
        Task<bool> UpdateUser(User user);

        Task<IEnumerable<Books>> GetAllBooks();
        Task<Books> GetBookDetails(string name);
        Task<bool> InsertBook(Books books);
    }
}
