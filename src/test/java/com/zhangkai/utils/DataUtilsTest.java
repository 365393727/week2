/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DataUtilsTest.java 
 * @Prject: zhangkai-utils
 * @Package: com.zhangkai.utils 
 * @Description: TODO
 * @author: 张凯   
 * @date: 2019年9月5日 上午10:48:30 
 * @version: V1.0   
 */
package com.zhangkai.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Test;

/** 
 * @ClassName: DataUtilsTest 
 * @Description: 计算你的岁数的测试类
 * @author: 张凯
 * @date: 2019年9月5日 上午10:48:30  
 */
public class DataUtilsTest {

	/**
	 * Test method for {@link com.zhangkai.utils.DataUtils#sumDate(java.util.Date)}.
	 */
	@Test
	public void testSumDate() {

		Calendar c = Calendar.getInstance();
		c.set(1965, 1, 28);
		
		int date = DataUtils.sumDate(c.getTime());
		System.out.println("你的岁数"+date);
	
	}

}
