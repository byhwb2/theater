package com.woniuxy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.dao.StuMapper;
import com.woniuxy.pojo.Stu;
import com.woniuxy.service.IStuService;
@Service
public class StuServiceImpl implements IStuService {

	@Autowired
	private StuMapper stuMapper;
	public void save(Stu s) {
		// TODO Auto-generated method stub
		stuMapper.insert(s);
	}

	public void delete(int sid) {
		// TODO Auto-generated method stub
		stuMapper.deleteByPrimaryKey(sid);
	}

	public void update(Stu s) {
		// TODO Auto-generated method stub
		stuMapper.updateByPrimaryKey(s);
	}

	public List<Stu> findOne(int sid) {
		// TODO Auto-generated method stub
		List<Stu> list=new ArrayList<Stu>();
		Stu target = stuMapper.selectByPrimaryKey(sid);
		if(target==null) {
		}
		else list.add(target);
		
		return list;
	}

	public List<Stu> findAll() {
		// TODO Auto-generated method stub
		List<Stu> list = stuMapper.selectByExample(null);
		return list;
	}

}
