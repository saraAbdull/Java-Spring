package com.kharashi.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/human")

public class helloHuman {

	@RequestMapping("")
    public String index(@RequestParam(value="fname", required=false) String fn,@RequestParam(value="lname", required=false) String ln){
        if(fn == null && ln==null)
        	return "Hello Human!";
        else if(fn == null)
        	return "Hello "+ln+"!";
        else if(ln == null)
        	return "Hello "+fn+"!";
        else
        	return "Hello "+fn+" "+ln+"!";
        	
    }
}
