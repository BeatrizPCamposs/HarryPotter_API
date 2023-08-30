using HarryPotterBooks.Data.Repositories;
using HarryPotterBooks.Model;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace HarryPotterBooks.Controller
{
    [Route("api/[controller]")]
    [ApiController]
    public class UserController : ControllerBase
    {
        private readonly IUserBookRepository _userbooksRepository;

        public UserController(IUserBookRepository userbooksRepository)
        {
            _userbooksRepository = userbooksRepository;
        }

        [HttpGet]
        public async Task<IActionResult> GetAllUsers()
        {
            return Ok(await _userbooksRepository.GetAllUsers());
        }

        [HttpPost]
        public async Task<IActionResult> InsertUser([FromBody] User user)
        {
            if (user == null)
                return BadRequest();

            if (!ModelState.IsValid)
                return BadRequest(ModelState);

            await _userbooksRepository.InsertUser(user);

            return NoContent();
        }

        [HttpPut]
        public async Task<IActionResult> UpdateUser([FromBody] User user)
        {
            if (user == null)
                return BadRequest();

            if (!ModelState.IsValid)
                return BadRequest(ModelState);

            await _userbooksRepository.UpdateUser(user);

            return NoContent();
        }
    }
}

