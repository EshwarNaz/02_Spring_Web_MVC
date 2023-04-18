package in.eshwar.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;

import in.eshwar.entity.BookEntity;
import in.eshwar.repo.BookRepository;

@Controller
public class BookController {
	@Autowired
	private BookRepository repo;

	/*
	 * @GetMapping("/book") public ModelAndView findBook(@RequestParam("id") Integer
	 * bookId) { ModelAndView mav = new ModelAndView(); Optional<BookEntity> book =
	 * repo.findById(bookId); if (book.isPresent()) { BookEntity Book = book.get();
	 * mav.addObject("book", Book); } System.out.println(mav); return mav;
	 * 
	 * }
	 */

	@GetMapping("/book")
	public String findBook(@RequestParam("id") Integer bookId, Model model) {
		Optional<BookEntity> findById = repo.findById(bookId);
		if (findById.isPresent()) {
			BookEntity Book = findById.get();
			model.addAttribute("book", Book);
		}
		return "index";

	}
}
