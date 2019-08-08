package com.ying.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@ResponseBody
public class TestMain {
    public static void main(String[] args) {
        SpringApplication.run(TestMain.class, args);
    }



    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
