package com.iqmsoft.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@FeignClient("echo-service")
public interface EchoService {

    @RequestMapping(method = RequestMethod.GET, value = "/world")
    @ResponseBody
    String echo(@RequestParam("msg") String msg);
}
