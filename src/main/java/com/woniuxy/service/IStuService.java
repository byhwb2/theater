package com.woniuxy.service;

import java.util.List;

import com.woniuxy.pojo.Stu;

public interface IStuService {

	void save(Stu s);
	void delete(int sid);
	void update (Stu s);
	List<Stu> findOne(int sid);
	List<Stu> findAll();
	
}
