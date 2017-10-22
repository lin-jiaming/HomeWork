package com.stusys.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stusys.dao.ITbStuDao;
import com.stusys.entity.TbStu;
@Repository("stuDao")
public class TbStuDaoImpl extends BaseDao implements ITbStuDao {

	@Override
	public boolean addTbStu(TbStu stu) {
		try {
			getSession().save(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List findTbStuList(String hql) {
		return getSession().createQuery(hql).list();
	}

	@Override
	public boolean updateTbStu(TbStu stu) {
		try {
			getSession().update(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteTbStu(TbStu stu) {
		try {
			getSession().delete(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public TbStu getTbStuById(int id) {
		return getSession().get(TbStu.class, id);
	}

}
