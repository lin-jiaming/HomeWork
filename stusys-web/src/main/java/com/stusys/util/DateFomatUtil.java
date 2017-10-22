package com.stusys.util;
/**
 * 自定义日期转换格式
 * @author linjiaming
 *
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFomatUtil {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	// 日期转字符串
	public static String DateToString(Date date) {
		return sdf.format(date);
	}

	// 字符串转日期
	public static Date StringToDate(String date) {
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
