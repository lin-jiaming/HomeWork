package com.stusys.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Maven聚合案例之班级类
 * @author linjiaming
 *
 */
@Entity
@Table(name="Tb_Cls")
public class TbCls {
	private int cno;
	private String cname;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public TbCls(int cno, String cname) {
		super();
		this.cno = cno;
		this.cname = cname;
	}
	public TbCls() {
		super();
	}
	
}
