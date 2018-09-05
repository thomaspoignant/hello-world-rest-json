package com.tpoi.HelloWorldRest.controller;

import com.tpoi.HelloWorldRest.bean.HelloWorld;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
  @RequestMapping("/")
  public HelloWorld helloWolrd() {
    return new HelloWorld();
  }
}
