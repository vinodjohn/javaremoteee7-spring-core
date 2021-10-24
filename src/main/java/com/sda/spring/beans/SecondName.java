package com.sda.spring.beans;

import com.sda.spring.interfaces.BeanName;
import org.springframework.stereotype.Component;

@Component(value = "secondName")
public class SecondName implements BeanName {
  private String name;

  public SecondName() {
    this.name = "John";
  }

  public String getName() {
    return this.name;
  }
}
