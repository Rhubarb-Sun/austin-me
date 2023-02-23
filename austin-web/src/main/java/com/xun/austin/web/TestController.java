package com.xun.austin.web;

import org.springframework.web.bind.annotation.*;

/**
 * @author: sunxun
 * @date: 2/23/23 10:41 AM
 * @description:
 */

@RestController
public class TestController {

    @GetMapping(value = "/test/{id}")
    private String test(@PathVariable String id) {
        System.out.println("com.xun.austin.web.TestController.test");
        return "你的id是" + id;
    }
}
