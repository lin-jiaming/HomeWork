package com.stusys.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.stusys.dao.ITbStuDao;
import com.stusys.entity.TbStu;
import com.stusys.service.ITbStuService;
@Repository("stuService")
@Transactional(propagation=Propagation.REQUIRED)
public class TbStuServiceImpl implements ITbStuService {
	//注入需要用到的stuDao接口
	@Resource(name="stuDao")
	private ITbStuDao stuDao;
	
	@Override
	public boolean addTbStu(TbStu stu) {
		return stuDao.addTbStu(stu);
	}

	@Override
	public List findTbStuList() {
		return stuDao.findTbStuList("from TbStu s left join s.cls ");
	}

	@Override
	public boolean updateTbStu(TbStu stu) {
		return stuDao.updateTbStu(stu);
	}

	@Override
	public boolean deleteTbStu(TbStu stu) {
		return stuDao.deleteTbStu(stu);
	}

	@Override
	public TbStu getTbStuById(int id) {
		return stuDao.getTbStuById(id);
	}

	public void setStuDao(ITbStuDao stuDao) {
		this.stuDao = stuDao;
	}
	

}
