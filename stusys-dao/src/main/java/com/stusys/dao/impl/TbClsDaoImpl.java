package com.stusys.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stusys.dao.ITbClsDao;
import com.stusys.entity.TbCls;
/**
 * Maven聚合之班级Dao层接口实习类
 * @author linjiaming
 *
 */
@Repository("clsDao")
public class TbClsDaoImpl extends BaseDao implements ITbClsDao {

	@Override
	public boolean addTbCls(TbCls cls) {
		getSession().save(cls);
		return true;
	}

	@Override
	public List findTbClsList(String hql) {
		return getSession().createQuery(hql).list();
	}

}
