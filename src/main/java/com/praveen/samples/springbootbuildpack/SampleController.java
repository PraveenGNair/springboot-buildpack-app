package com.praveen.samples.springbootbuildpack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

  @GetMapping("/")
  public String sayHello() {
    return "Welcome to Spring Boot Docker support app";
  }

}
