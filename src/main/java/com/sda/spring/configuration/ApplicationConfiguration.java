package com.sda.spring.configuration;

import com.sda.spring.beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
  @Bean
  public MyBean myBean() {
    MyBean myBean = new MyBean();
    myBean.setName("Vinod");
    return myBean;
  }
}
