package com.stusys.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.stusys.entity.TbStu;
import com.stusys.service.ITbClsService;
import com.stusys.service.ITbStuService;

/**
 * Maven聚合之学生的控制类
 * @author linjiaming
 *
 */
@Controller("stuAction")
@Scope("prototype")
public class TbStuAction {
	//需要用到的学生类
	private TbStu stu;
	//需要用到的学生服务接口
	@Resource(name="stuService")
	private ITbStuService stuService;
	//需要用到的班级接口类
	@Resource(name="clsService")
	private ITbClsService clsService;
	//状态
	private int res;
	
	//去到添加学生的页面
	public String toAddTbStu(){
		//去到添加学生页面先查询出班级
		ActionContext.getContext().put("clsList", clsService.findTbClsList());
		return "toAddTbStu";
	}
	
	//执行添加学生
	public String doAddTbStu(){
		if(stuService.addTbStu(stu)){
			res=1;
		}else
		{
			res=-1;
		}
		return "doAddTbStu";
	}
	
	//查询学生信息
	public String findTbStuList(){
		ActionContext.getContext().put("stuList", stuService.findTbStuList());
		return "findTbStuList";
	}
	
	//去到修改学生的页面
	public String toUpdateTbStu(){
		//先查询出班级
		ActionContext.getContext().put("clsList", clsService.findTbClsList());
		//先查询出要修改学生的信息
		stu = stuService.getTbStuById(stu.getSno());
		return "toUpdateTbStu";
	}
	//执行修改
	public String doUpdateTbStu(){
		if(stuService.updateTbStu(stu)){
			res=1;
		}else{
			res=-1;
		}
		return "doUpdateTbStu";
	} 
	
	//删除学生
	public String doDeleteTbStu(){
		if(stuService.deleteTbStu(stu)){
			res=1;
		}else{
			res=-1;
		}
		return "doDeleteTbStu";
	}
	public TbStu getStu() {
		return stu;
	}
	public void setStu(TbStu stu) {
		this.stu = stu;
	}
	public int getRes() {
		return res;
	}
	public void setRes(int res) {
		this.res = res;
	}
	public void setStuService(ITbStuService stuService) {
		this.stuService = stuService;
	}
	public void setClsService(ITbClsService clsService) {
		this.clsService = clsService;
	}
	
	
}
