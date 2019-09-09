/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtilTest.java 
 * @Prject: zhangkai-utils
 * @Package: com.zhangkai.utils 
 * @Description: TODO
 * @author: 张凯   
 * @date: 2019年9月5日 下午4:18:50 
 * @version: V1.0   
 */
package com.zhangkai.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/** 
 * @ClassName: DateUtilTest 
 * @Description: 日期的  测试类
 * @author: 张凯
 * @date: 2019年9月5日 下午4:18:50  
 */
public class DateUtilTest {

	/**
	 * Test method for {@link com.zhangkai.utils.DateUtil#getDateByInitMonth(java.util.Date)}.
	 */
	@Test
	public void testGetDateByInitMonth() {
		
		Calendar c = Calendar.getInstance();
		// 2019 - 2- 28
		c.set(2019, 3, 28);
		
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = df.format(date);
		
		System.out.println(string);
		
	}

	/**
	 * Test method for {@link com.zhangkai.utils.DateUtil#getDateByFullMonth(java.util.Date)}.
	 */
	@Test
	public void testGetDateByFullMonth() {
		
		Calendar c = Calendar.getInstance();
		// 2019 - 2- 28
		c.set(2019, 3, 28);
		
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = df.format(date);
		
		System.out.println(string);
		
	}

}
