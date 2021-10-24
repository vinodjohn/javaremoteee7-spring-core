package com.sda.spring.beans;

import lombok.Setter;
import org.springframework.stereotype.Service;

@Setter
@Service("myBean")
public class MyBean {
  private String name;

  public String sayHello(){
    return "Hello! " + name;
  }
}
