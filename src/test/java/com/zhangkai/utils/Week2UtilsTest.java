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
		String src="字符串转换成html文本，如果遇到\\n换行换符，则要将这一段文本使用标签\\n。" + 
				"包起来。如果遇到两个在一起按上面处理。\\n\\r”如果只遇到一个则替换成标签。" + 
				"使用场景：网页文本框传到后台的字符串就可能就会回车换行。";
		String string = Week2Utils.toHtml(src);
		System.out.println(string);
	}

	/**
	 * Test method for {@link com.zhangkai.utils.Week2Utils#isPhone(java.lang.String)}.
	 */
	@Test
	public void testIsPhone() {
		String src ="15835039150";
		String s ="12345678910";
		boolean b = Week2Utils.isPhone(src);
		System.out.println(b);
	}

	/**
	 * Test method for {@link com.zhangkai.utils.Week2Utils#isEmail(java.lang.String)}.
	 */
	@Test
	public void testIsEmail() {
		String src ="365393727@qq.com";
		String s ="12345678910";
		boolean b = Week2Utils.isEmail(src);
		System.out.println(b);
		
	}

}
