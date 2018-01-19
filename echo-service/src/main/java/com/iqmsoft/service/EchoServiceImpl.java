package com.iqmsoft.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EchoServiceImpl {

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    public String echo(@RequestParam("msg") String msg) {
        return "world: " + msg;
    }
}
