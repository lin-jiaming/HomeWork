package com.stusys.convertion;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;
import com.stusys.util.DateFomatUtil;

/**
 * 日期转换器
 * @author linjiaming
 *
 */
public class DateConversion extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		if(arg1!=null&&arg1.length>0){
			if(arg1[0]!=null){
				return DateFomatUtil.StringToDate(arg1[0]);
			}
		}
		return null;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		return DateFomatUtil.DateToString((Date)arg1);
	}
	
}
