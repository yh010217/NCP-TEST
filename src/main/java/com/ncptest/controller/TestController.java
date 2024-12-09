package com.ncptest.controller;

import com.ncptest.domain.TestTable1;
import com.ncptest.service.TestTable1Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TestController {
    private final TestTable1Service service;
    @GetMapping("/postgres")
    public List<TestTable1> testTable1List(){
        return service.getList();
    }
    @GetMapping("/hello")
    public String home(){
        return "Hello, World NCP";
    }
    @GetMapping("/hello/docker")
    public String helloDocker(){
        return "Hello, World Docker";
    }
}
