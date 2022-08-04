package com.belajar.belajar.controller;

import com.belajar.belajar.model.TestBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v1/test")
public class TestBeansController {

    @Autowired // Depedency injection
    TestBeans testBeans;

    @RequestMapping(value = {"/hello", "/hello/"})
    @ResponseBody
    public String hello() {
        return testBeans.appSaya();
    }
}
