package com.sda.spring;

import com.sda.spring.beans.MyBean;
import com.sda.spring.configuration.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
    applicationContext.register(ApplicationConfiguration.class);
    applicationContext.refresh();

    MyBean myBean = applicationContext.getBean(MyBean.class);
    System.out.println(myBean.sayHello());

    myBean.setName("John");
    System.out.println(myBean.sayHello());
  }
}
