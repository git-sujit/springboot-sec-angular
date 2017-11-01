package com.sks.learn.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UiController {

	@RequestMapping("/resource")
	public Map<String, Object> home(@PathVariable String msg){
		Map<String,Object> model = new HashMap<String,Object>();
	    model.put("uuid", UUID.randomUUID().toString());
	    model.put("content", msg);
	    return model;
	}
}
