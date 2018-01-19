package com.iqmsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.iqmsoft.service.EchoService;


@RestController
public class GatewayController {

    @Autowired
    private EchoService echoService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String test(@RequestParam("msg") String msg) {

        return "hello " + echoService.echo(msg);
    }
}
