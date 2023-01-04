package com.jeanjacquesns.bookapi.book_microservice.tasks.services;

import com.jeanjacquesns.bookapi.book_microservice.tasks.dto.BookDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Jean Jacques N. Shimwa
 * @created 04-01-2023 - 12:26 PM
 */
@Service
public class BookService {
    public List<BookDTO> findAllBooks() {
        return null;
    }

    public BookDTO findBookById(Long bookId) {
        return null;
    }

    public BookDTO createBook(BookDTO bookDTO) {
        return null;
    }

    public void deleteBook(Long bookId) {
    }

    public BookDTO updateBook(BookDTO book, Long bookId) {
        return null;
    }
    public BookDTO updateBook(Map<String, String> updates, Long bookId) {
        return null;
    }
}
