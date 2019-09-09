/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DataUtils.java 
 * @Prject: zhangkai-utils
 * @Package: com.zhangkai.utils 
 * @Description: TODO
 * @author: 张凯   
 * @date: 2019年9月5日 上午10:37:41 
 * @version: V1.0   
 */
package com.zhangkai.utils;

import java.util.Calendar;
import java.util.Date;

/** 
 * @ClassName: DataUtils 
 * @Description: 计算年龄
 * @author: 张凯
 * @date: 2019年9月5日 上午10:37:41  
 */
public class DataUtils {
	
	//1995-02-28
	//2019-09-28
	public static int sumDate(Date src) {
		
		Calendar c = Calendar.getInstance();
		
		c.setTime(src);
		
		int i = c.get(Calendar.YEAR);
		System.out.println("你的生日"+i);
		
		Calendar date = Calendar.getInstance();
		date.setTime(new Date());
	
		int d = date.get(Calendar.YEAR);
		System.out.println("当前的年"+d);
		int c1 = date.get(Calendar.YEAR)-c.get(Calendar.YEAR);
		return c1;
	}

}
