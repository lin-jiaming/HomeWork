package com.stusys.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
/**
 * Maven聚合之班级控制类
 * @author linjiaming
 *
 */

import com.opensymphony.xwork2.ActionContext;
import com.stusys.entity.TbCls;
import com.stusys.service.ITbClsService;
@Controller("clsAction")
@Scope("prototype")
public class TbClsAction {
	//班级实体类
	private TbCls cls;
	//需要用到的clsService
	@Resource(name="clsService")
	private ITbClsService clsService;
	//状态
	private int res;
	public String addTbCls(){
		if(clsService.addTbCls(cls)){
			res=1;
		}else{
			res=-1;
		}
		return "doAddTbCls";
	}
	
	//查询班级信息
	public String findTbClsList(){
		ActionContext.getContext().put("clsList", clsService.findTbClsList());
		return "findTbClsList";
	}
	public TbCls getCls() {
		return cls;
	}
	public void setCls(TbCls cls) {
		this.cls = cls;
	}
	public int getRes() {
		return res;
	}
	public void setRes(int res) {
		this.res = res;
	}
	public void setClsService(ITbClsService clsService) {
		this.clsService = clsService;
	}
	
	
}
