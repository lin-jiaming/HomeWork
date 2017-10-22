package com.stusys.dao;

import java.util.List;

import com.stusys.entity.TbCls;

/**
 * Maven聚合之班级Dao层接口类
 * @author linjiaming
 *
 */
public interface ITbClsDao {
	//添加班级
	public boolean addTbCls(TbCls cls);
	//查询班级
	public List findTbClsList(String hql);
}
