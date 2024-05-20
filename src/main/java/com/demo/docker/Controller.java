package com.demo.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
  @GetMapping("/hello-docker")
  public String helloDocker(){
    return "Welcome to docker world";
  }
}
