package com.sda.spring.beans;

import com.sda.spring.interfaces.BeanName;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Setter
@Component
public class MyBean {
  private BeanName name;

  public MyBean(@Qualifier("firstName") BeanName name) {
    this.name = name;
  }

  public String sayHello() {
    return "Hello! " + name.getName();
  }
}
