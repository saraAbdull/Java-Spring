package com.kharashi.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {

	@RequestMapping("/{d}")
    public String dojo(@PathVariable("d") String d){
    	return "The " + d + " is awesome!" ;
    }
	@RequestMapping("/{b}/")
    public String showLesson(@PathVariable("b") String b){
    	return b+ "is located in Southern California" ;
    }
}
