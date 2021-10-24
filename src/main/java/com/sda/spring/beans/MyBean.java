package com.sda.spring.beans;

import lombok.Setter;

@Setter
public class MyBean {
  private String name;

  public String sayHello() {
    return "Hello! " + name;
  }
}
