package com.stusys.service;

import java.util.List;

import com.stusys.entity.TbStu;

/**
 * Maven聚合之学生的服务接口类
 * @author linjiaming
 *
 */
public interface ITbStuService {
	//添加学生
		public boolean addTbStu(TbStu stu);
		//查询学生
		public List findTbStuList();
		//修改学生
		public boolean updateTbStu(TbStu stu);
		//删除学生
		public boolean deleteTbStu(TbStu stu);
		//根据学生Id查询信息
		public TbStu getTbStuById(int id);
}
