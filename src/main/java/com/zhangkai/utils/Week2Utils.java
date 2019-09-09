/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Week2Utils.java 
 * @Prject: zhangkai-utils
 * @Package: com.zhangkai.utils 
 * @Description: TODO
 * @author: 张凯   
 * @date: 2019年9月9日 上午9:07:26 
 * @version: V1.0   
 */
package com.zhangkai.utils;

import java.util.regex.Pattern;

/** 
 * @ClassName: Week2Utils 
 * @Description: TODO
 * @author: 张凯
 * @date: 2019年9月9日 上午9:07:26  
 */
public class Week2Utils {
	
	
	
//	3.在工具包工程里添加一个字符串toHtml(String text)工具方法。思路是
//	(1)利用Html的<p>标签来保留文本的换行。
//	(2)Windows系统换行符是“\r\n”,Linux系统是“\n”，因此要将\n\r替换成一个\n。
//	(3)再将\n结尾的这行文本用<p></p>标签包起来。
//	(4)如果遇到单个\r字符要使用<br/>标签替换。
	/**
	 * 
	 * @Title: toHtml 
	 * @Description: TODO
	 * @param src
	 * @return
	 * @return: String
	 */
	public static String toHtml(String src) {
		
		String str = src.replaceAll(System.getProperty("line.separator"), "|")	;
		String[] split = str.split("\\|");
		String newStr="";
		for (String string2 : split) {
			newStr+="<p>"+string2+"</p>";
		}
		return newStr;
		
	}
	
//	(2)测试StringUtil工具类中的是否为中国地区手机号码isPhone()工具方法。传一个非法的手机号码测试不通过（4分）。传一次合法的手机号码，测试通过（4分）。
//	说明：如果自己的工具包工程没有该功能的工具方法，考试现在编写不扣分。如果有此功能的方法，但方法名不同不影响成绩。
	/**
	 * 
	 * @Title: isPhone 
	 * @Description:手机号的正则验证
	 * @param src
	 * @return
	 * @return: boolean
	 */
	public static boolean isPhone(String src) {
		//手机号的  正则验证
		String str ="1[34578]\\d{9}" ;
		return Pattern.matches(str, src);
		
	}
	
//	(3)测试StringUtil工具类中的是否为邮箱isEmail()工具方法。传一个非法的邮箱测试不通过（4分）。传一次合法的邮箱，测试通过（4分）。
//	说明：如果自己的工具包工程没有该功能的工具方法，考试现在编写不扣分。如果有此功能的方法，但方法名不同不影响成绩。
	public static boolean isEmail(String src){

		String str ="\\w+@\\w+\\.(com|cn)";
		
		return Pattern.matches(str, src);
			
	}
	

}
