package com.sda.spring.beans;

import com.sda.spring.interfaces.Book;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Setter
@Component
public class BookBean {
    private Book book;

    public BookBean(@Qualifier("comicBook") Book book) {
      this.book = book;
    }

    public String getBookDetails() {
      return "Book title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price:" + book.getPrice().toString();
    }
}
