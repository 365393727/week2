/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Week2Test.java 
 * @Prject: zhangkai-utils
 * @Package: com.zhangkai.test 
 * @Description: TODO
 * @author: 张凯   
 * @date: 2019年9月9日 上午8:49:02 
 * @version: V1.0   
 */
package com.zhangkai.test;

import org.junit.Test;

import com.zhangkai.utils.StringUtil;

/** 
 * @ClassName: Week2Test 
 * @Description: TODO
 * @author: 张凯
 * @date: 2019年9月9日 上午8:49:02  
 */
public class Week2Test {

//	(2)测试StringUtil工具类中的是否为中国地区手机号码isPhone()工具方法。传一个非法的手机号码测试不通过（4分）。传一次合法的手机号码，测试通过（4分）。
//	说明：如果自己的工具包工程没有该功能的工具方法，考试现在编写不扣分。如果有此功能的方法，但方法名不同不影响成绩。	
	/**
	 * 
	 * @Title: test1 
	 * @Description:测试手机号公具体
	 * @return: void
	 */
	@Test
	public void test1() {
		String src ="15835039150";
		String s ="12345678910";
		boolean b = StringUtil.isPhone(s);
		System.out.println(b);
		
	}
//	(3)测试StringUtil工具类中的是否为邮箱isEmail()工具方法。传一个非法的邮箱测试不通过（4分）。传一次合法的邮箱，测试通过（4分）。
//	说明：如果自己的工具包工程没有该功能的工具方法，考试现在编写不扣分。如果有此功能的方法，但方法名不同不影响成绩。
	/**
	 * 
	 * @Title: test2 
	 * @Description:测试邮箱公具体
	 * @return: void
	 */
	@Test
	public void test2() {
		String src ="365393727@qq.com";
		String s ="12345678910";
		boolean b = StringUtil.isEmail(s);
		System.out.println(b);
		
	}
	
}
