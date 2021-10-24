package com.sda.spring.beans;

import com.sda.spring.interfaces.Book;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component(value = "comicBook")
public class ComicBook implements Book {
  private String title;
  private String author;
  private BigDecimal price;

  public ComicBook() {
    this.title = "Avengers";
    this.author = "Marvel";
    this.price = BigDecimal.TEN;
  }

  @Override
  public String getTitle() {
    return this.title;
  }

  @Override
  public String getAuthor() {
    return this.author;
  }

  @Override
  public BigDecimal getPrice() {
    return this.price;
  }
}
