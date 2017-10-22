package com.stusys.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.stusys.dao.ITbClsDao;
import com.stusys.entity.TbCls;
import com.stusys.service.ITbClsService;
/**
 * Maven聚合之班级服务接口实现类
 * @author linjiaming
 *
 */
@Repository("clsService")
@Transactional(propagation=Propagation.REQUIRED)
public class TbClsServiceImpl implements ITbClsService {
	
	//注入需要用到的TbCls类
	@Resource(name="clsDao")
	private ITbClsDao clsDao;
	@Override
	public boolean addTbCls(TbCls cls) {
		return clsDao.addTbCls(cls);
	}

	@Override
	public List findTbClsList() {
		// TODO Auto-generated method stub
		return clsDao.findTbClsList("from TbCls");
	}

	public void setClsDao(ITbClsDao clsDao) {
		this.clsDao = clsDao;
	}

}
