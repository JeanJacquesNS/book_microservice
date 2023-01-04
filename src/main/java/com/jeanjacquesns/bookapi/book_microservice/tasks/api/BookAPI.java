package com.jeanjacquesns.bookapi.book_microservice.tasks.api;

import com.jeanjacquesns.bookapi.book_microservice.tasks.dto.BookDTO;
import com.jeanjacquesns.bookapi.book_microservice.tasks.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author Jean Jacques N. Shimwa
 * @created 04-01-2023 - 12:26 PM
 */
@RestController
@RequestMapping("/books")
public class BookAPI {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookDTO> findAllBooks() {
        return bookService.findAllBooks();
    }

    @GetMapping("/{bookId}")
    public BookDTO findBook(@PathVariable Long bookId) {
        return bookService.findBookById(bookId);
    }

    @PostMapping
    public BookDTO createBook(@RequestBody BookDTO bookDTO) {
        return bookService.createBook(bookDTO);
    }

    @DeleteMapping("/{bookId}")
    public void deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
    }

    @PutMapping("/{bookId}")
    public BookDTO updateBook(@RequestBody BookDTO book, @PathVariable Long bookId) {
        return bookService.updateBook(book, bookId);
    }

    @PatchMapping("/{bookId}")
    public BookDTO updateBook(
            @RequestBody Map<String, String> updates,
            @PathVariable Long bookId) {
        return bookService.updateBook(updates, bookId);
    }
}
