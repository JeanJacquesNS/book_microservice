package com.jeanjacquesns.bookapi.book_microservice.tasks.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Jean Jacques N. Shimwa
 * @created 04-01-2023 - 12:27 PM
 */
@Getter
@Setter
public class BookDTO {
    private long id;
    private String title;
    private String author;
}
