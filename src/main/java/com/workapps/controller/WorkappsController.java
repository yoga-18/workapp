package com.workapps.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/work")
public class WorkappsController {
	public String getWork() {
		return "Hello";
	}

}
