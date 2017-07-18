package com.minstone.springmvcrestful.manager.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/test")
public class TestController {
	@RequestMapping(value="/test",produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Object testRequestParam(@RequestParam(value="id") Integer id,
            @RequestParam(value="name")String name){
        System.out.println(id+" "+name);
        JSONObject json = new JSONObject();
        json.put("test", "test");
        json.put("total", 123);
        return json;
    }    
}
