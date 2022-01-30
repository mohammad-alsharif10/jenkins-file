package com.ci.jenkinsfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/demo")
@RestController
public class JenkinsFileApplication {

   public static void main(String[] args) {
      SpringApplication.run(JenkinsFileApplication.class, args);
   }

   @GetMapping("/jenkins")
   public String helloWorld() {
      return "Hello Jenkins";
   }

}
