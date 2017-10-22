package com.stusys.entity;
/**
 * Maven聚合之学生类
 * @author linjiaming
 *
 */

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Tb_Stu")
public class TbStu implements Serializable {
	private int sno;
	private String sname;
	private int sage;
	private int ssex;
	private Date sintime;
	//多个学生对应一个班级
	private TbCls cls;
	
	@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.LAZY)
	@JoinColumn(name="scno")
	public TbCls getCls() {
		return cls;
	}
	public void setCls(TbCls cls) {
		this.cls = cls;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public int getSsex() {
		return ssex;
	}
	public void setSsex(int ssex) {
		this.ssex = ssex;
	}
	@Temporal(TemporalType.DATE)
	public Date getSintime() {
		return sintime;
	}
	public void setSintime(Date sintime) {
		this.sintime = sintime;
	}
	public TbStu(int sno, String sname, int sage, int ssex, Date sintime) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sage = sage;
		this.ssex = ssex;
		this.sintime = sintime;
	}
	public TbStu() {
		super();
	}
	
	
}
