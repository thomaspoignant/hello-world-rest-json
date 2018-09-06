package com.tpoi.HelloWorldRest.controller;

import com.tpoi.HelloWorldRest.bean.HelloWorld;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
  @RequestMapping("/")
  @CrossOrigin
  public HelloWorld helloWorld() {
    return new HelloWorld();
  }
}
