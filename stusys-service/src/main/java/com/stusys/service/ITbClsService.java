package com.stusys.service;

import java.util.List;

import com.stusys.entity.TbCls;

/**
 * Maven聚合之班级服务接口类
 * @author linjiaming
 *
 */
public interface ITbClsService {
	//添加班级
	public boolean addTbCls(TbCls cls);
	//查询班级
	public List findTbClsList();
}
