package com.sda.spring.beans;

import com.sda.spring.interfaces.BeanName;
import org.springframework.stereotype.Component;

@Component(value = "firstName")
public class FirstName implements BeanName {
  private String name;

  public FirstName() {
    this.name = "Vinod";
  }

  public String getName() {
    return this.name;
  }
}
