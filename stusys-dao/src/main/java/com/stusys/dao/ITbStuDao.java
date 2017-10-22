package com.stusys.dao;

import java.util.List;

import com.stusys.entity.TbStu;

/**
 * Maven聚合之学生Dao层接口
 * @author linjiaming
 *
 */
public interface ITbStuDao {
	//添加学生
	public boolean addTbStu(TbStu stu);
	//查询学生
	public List findTbStuList(String hql);
	//修改学生
	public boolean updateTbStu(TbStu stu);
	//删除学生
	public boolean deleteTbStu(TbStu stu);
	//根据学生Id查询信息
	public TbStu getTbStuById(int id);
}
