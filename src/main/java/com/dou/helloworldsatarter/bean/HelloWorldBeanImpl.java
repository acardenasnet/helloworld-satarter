package com.dou.helloworldsatarter.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorldBeanImpl implements HelloWorldBean {

  private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldBeanImpl.class);

  @Override
  public void sayHello() {
    LOGGER.info("Hello World");
  }
}
