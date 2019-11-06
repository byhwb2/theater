package com.woniuxy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.pojo.Stu;
import com.woniuxy.service.IStuService;

@RestController
@RequestMapping("stus")
public class StuController {
	
	@Autowired
	private IStuService service;
	
	@GetMapping
	public void save(Stu s) {
		System.out.println("DeptController.save():" + s);
		
		service.save(s);
	}

}
