using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HarryPotterBooks.Model
{
    public class Books
    {
        public int IdBooks { get; set; }
        public string Titulo { get; set; }
        public string Sumario { get; set; }
        public string Autor { get; set; }
        public int Ano_lancamento { get; set; }
        public int Ordem { get; set; }
        public string Cover { get; set; }
        public int NumPaginas { get; set; }
    }
}
