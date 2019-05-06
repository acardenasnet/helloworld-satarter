package com.dou.helloworldsatarter.conf;

import com.dou.helloworldsatarter.bean.HelloWorldBean;
import com.dou.helloworldsatarter.bean.HelloWorldBeanImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldAutoConfiguration {

  @Bean
  @ConditionalOnMissingBean
  public HelloWorldBean helloWorldBean() {
    return new HelloWorldBeanImpl();
  }

}
