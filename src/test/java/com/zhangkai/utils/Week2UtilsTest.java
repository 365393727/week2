/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Week2UtilsTest.java 
 * @Prject: zhangkai-utils
 * @Package: com.zhangkai.utils 
 * @Description: TODO
 * @author: 张凯   
 * @date: 2019年9月9日 上午9:08:11 
 * @version: V1.0   
 */
package com.zhangkai.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @ClassName: Week2UtilsTest 
 * @Description: TODO
 * @author: 张凯
 * @date: 2019年9月9日 上午9:08:11  
 */
public class Week2UtilsTest {

	/**
	 * Test method for {@link com.zhangkai.utils.Week2Utils#toHtml(java.lang.String)}.
	 */
	@Test
	public void testToHtml() {
		
	}

	/**
	 * Test method for {@link com.zhangkai.utils.Week2Utils#isPhone(java.lang.String)}.
	 */
	@Test
	public void testIsPhone() {
		String src ="15835039150";
		String s ="12345678910";
		boolean b = StringUtil.isPhone(s);
		System.out.println(b);
	}

	/**
	 * Test method for {@link com.zhangkai.utils.Week2Utils#isEmail(java.lang.String)}.
	 */
	@Test
	public void testIsEmail() {
		String src ="365393727@qq.com";
		String s ="12345678910";
		boolean b = StringUtil.isEmail(s);
		System.out.println(b);
		
	}

}
