using HarryPotterBooks.Data.Repositories;
using HarryPotterBooks.Model;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace HarryPotterBooks.Controller
{
    [Route("api/[controller]")]
    [ApiController]
    public class BooksController : ControllerBase
    {
        private readonly IUserBookRepository _userbooksRepository;

        public BooksController(IUserBookRepository userbooksRepository)
        {
            _userbooksRepository = userbooksRepository;
        }

        [HttpGet]
        public async Task<IActionResult> GetAllBooks()
        {
            return Ok(await _userbooksRepository.GetAllBooks());
        }

        [HttpGet("{name}")]
        public async Task<IActionResult> GetAllBooks(string name)
        {
            return Ok(await _userbooksRepository.GetBookDetails(name));
        }

        [HttpPost]
        public async Task<IActionResult> InsertBook([FromBody] Books books)
        {
            if (books == null)
                return BadRequest();

            if (!ModelState.IsValid)
                return BadRequest(ModelState);

            await _userbooksRepository.InsertBook(books);

            return NoContent();
        }

    }
}
