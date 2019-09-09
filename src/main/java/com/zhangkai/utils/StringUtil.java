/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StringUtil.java 
 * @Prject: zhangkai-utils
 * @Package: com.zhangkai.utils 
 * @Description: TODO
 * @author: 张凯   
 * @date: 2019年9月6日 上午9:01:49 
 * @version: V1.0   
 */
package com.zhangkai.utils;

import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.regex.Pattern;

/** 
 * @ClassName: StringUtil 
 * @Description: 字符串工具类
 * @author: 张凯
 * @date: 2019年9月6日 上午9:01:49  
 */
public class StringUtil {
	
	
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public static boolean hasLength(String src){
		
		return null!=src&&src.length()>0;
	//TODO 实现代码
	}
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	public static boolean hasText(String src){
		return null!=src&&src.trim().length()>0;
	//TODO 实现代码
	}
	
	
	
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
	
	
	
	
	
	
	//方法3：判断是否为手机号码 (5分)
	/**
	 * 
	 * @Title: isMobile 
	 * @Description: 判断是否为手机号码 (5分)
	 * @param src
	 * @return
	 * @return: boolean
	 */
	public static boolean isMobile(String src){
	    String str ="1[34578]\\d{9}" ;
		return Pattern.matches(str, src);
	}
		//方法4：判断是否为邮箱 (5分) 
	/**
	 * 
	 * @Title: isEmail 
	 * @Description: //方法4：判断是否为邮箱 (5分) 
	 * @param src
	 * @return
	 * @return: boolean
	 */
//	public static boolean isEmail(String src){
//
//		String str ="\\w+@\\w+\\.(com|cn)";
//		
//		return Pattern.matches(str, src);
//			
//	}
//		方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
		/**
		 * 
		 * @Title: reverse 
		 * @Description: 反转字符串
		 * @param src
		 * @return
		 * @return: String
		 */
		public static String reverse(String src){
			
		   StringBuilder sb = new StringBuilder(src);
			return sb.reverse().toString();
		}
		/**
		 * 
		 * @Title: toHtml 
		 * @Description: 来的字符转成 html 文本，遇到“\n”符时，要用<p></p>将这一段
字符包起来。 
		 * @param src
		 * @return
		 * @return: String
		 */
		public static String Html(String src){
//			StringBuffer string = new StringBuffer(src);
//			
//			string.insert(0,"<p>");
//			
//			string.append("</p>");
//			String str = src.replaceAll(System.getProperty("line.separator"), "</p><p>")	;
//			
			String str = src.replaceAll(System.getProperty("line.separator"), "|")	;
			String[] split = str.split("\\|");
			String newStr="";
			for (String string2 : split) {
				newStr+="<p>"+string2+"</p>";
			}
			return newStr;
			
		}
			
		
		/*
		* 方法：生成唯一标签名，处理步骤：
		* 1、全部变成小写；
		* 2、清空两边的空格，把中间所有的空格替换成“-”；
		* 3、使用URLEncoder.encode()编码
		* 最后返回处理的结果。
		* 举例“Spring MVC”处理后为“spring-mvc”，“Spring Mvc”处理后也为“spring-mvc”
		*/
		public static String toUniqueTerm(String str) {
			 return str.toLowerCase().replaceAll(" ", "-");
		}
	
	
	/**
	 *
	 * @Title: randomChineseString 
	 * @Description: 返回一个中文字符
	 * @return
	 * @return: String
	 */
		
	public static String getRandomString() {
		String str = null;
		int highPos, lowPos;
		Random random = new Random();
		highPos = (176 + Math.abs(random.nextInt(39)));// 区码，0xA0打头，从第16区开始，即0xB0=11*16=176,16~55一级汉字，56~87二级汉字
		random = new Random();
		lowPos = 161 + Math.abs(random.nextInt(94));// 位码，0xA0打头，范围第1~94列

		byte[] bArr = new byte[2];

		bArr[0] = (new Integer(highPos)).byteValue();
		bArr[1] = (new Integer(lowPos)).byteValue();
		try {
			str = new String(bArr, "GB2312"); // 区位码组合成汉字
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;
	}
	/**
	 * 
	 * @Title: getRandomString 
	 * @Description: 返回随机的中国字
	 * @return
	 * @return: String
	 */
	public static String randomChineseString() {

		Random r = new Random();
		// 40869 汉子最后一个编码 19968:第一个编码
		int x = r.nextInt(40869 - 19968 + 1) + 19968;
		String str = (char) x + "";
		try {
			// 返回简单中文
			if (str.equals(new String(str.getBytes("GB2312"), "GB2312"))) {
				return str;
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return randomChineseString();
	}
	
	//方法3：返回参数length个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内，例如“
//	中呀被”(5分)
	/**
	 * 
	 * @Title: randomChineseString 
	 * @Description: //方法3：返回参数length个中文汉字字符串，
	 * 字符集必须在GB2312(相当于中文简体)范围内，例如“
//	中呀被”(5分)
	 * @param length
	 * @return
	 * @return: String
	 */
	public static String randomChineseString(int length){
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(randomChineseString());
		}
		return sb.toString();
	//TODO 实现代码
	}
	//方法4：返回中文姓名，必须以真实姓开头，百家姓在“六、附百家姓”里，
//	名使用1-2个随机汉字(8分)，内部调用randomChineseString()方法(3分)。
//	返回示例：“刘呀被”、“欧阳及为”
	public static String generateChineseName(){
		
		//姓名 =  
		String[] str = {"赵","钱","孙","李","周","吴","郑","王","冯","陈","楮","卫","蒋","沈","韩","杨",
				"朱","秦","尤","许","何","吕","施","张","孔","曹","严","华","金","魏","陶","姜","戚","谢",
				"邹","喻","柏","水","窦","章","云","苏","潘","葛","奚","范","彭","郎","鲁","韦","昌","马",
				"苗","凤","花","方","俞","任","袁","柳","酆","鲍","史","唐","费","廉","岑","薛","雷",
				"贺","倪","汤","滕","殷","罗","毕","郝","邬","安","常","乐","于","时","傅","皮","卞","齐",
				"康","伍","余","元","卜","顾","孟","平","黄","和","穆","萧","尹","姚","邵","湛","汪","祁",
				"毛","禹","狄","米","贝","明","臧","计","伏","成","戴","谈","宋","茅","庞","熊","纪","舒",
				"屈","项","祝","董","梁","杜","阮","蓝","闽","席","季","麻","强","贾","路","娄","危","江",
				"童","颜","郭","梅","盛","林","刁","锺","徐","丘","骆","高","夏","蔡","田","樊","胡",
				"凌","霍","虞","万","支","柯","昝","管","卢","莫","经","房","裘","缪","干","解","应","宗",
				"丁","宣","贲","邓","郁","单","杭","洪","包","诸","左","石","崔","吉","钮","龚","程","嵇","邢"
				,"滑","裴","陆","荣","翁","荀","羊","於","惠","甄","麹","家","封","芮","羿","储","靳","汲","邴",
				"糜","松","井","段","富","巫","乌","焦","巴","弓","牧","隗","山","谷","车","侯","宓","蓬","全","郗"
				,"班","仰","秋","仲","伊","宫","宁","仇","栾","暴","甘","斜","厉","戎","祖","武","符","刘","景","詹"
				,"束","龙","叶","幸","司","韶","郜","黎","蓟","薄","印","宿","白","怀","蒲","邰","从","鄂","索","咸","籍"
				,"赖","卓","蔺","屠","蒙","池","乔","阴","郁","胥","能","苍","双","闻","莘","党","翟","谭","贡","劳","逄",
				"姬","申","扶","堵","冉","宰","郦","雍","郤","璩","桑","桂","濮","牛","寿","通","边","扈","燕","冀","郏",
				"浦","尚","农","温","别","庄","晏","柴","瞿","阎","充","慕","连","茹","习","宦","艾","鱼","容","向","古","易",
				"慎","戈","廖","庾","终","暨","居","衡","步","都","耿","满","弘","匡","国","文","寇","广","禄","阙","东","欧"
				,"殳","沃","利","蔚","越","夔","隆","师","巩","厍","聂","晁","勾","敖","融","冷","訾","辛","阚","那","简",
				"饶","空","曾","毋","沙","乜","养","鞠","须","丰","巢","关","蒯","相","查","后","荆","红","游","竺","权","逑","盖","益","桓","公","晋","楚","阎","法","汝","鄢","涂","钦","岳","帅","缑","亢","况","后","有","琴","商","牟","佘","佴","伯","赏","墨","哈","谯","笪","年","爱","阳","佟","万俟","司马","上官","欧阳","夏侯","诸葛","闻人","东方","赫连","皇甫","尉迟","公羊","澹台","公冶","宗政","濮阳","淳于","单于","太叔","申屠","公孙","仲孙","轩辕","令狐","锺离","宇文","长孙","慕容","鲜于","闾丘","司徒","司空","丌官","司寇","仉","督","子车","颛孙","端木","巫马","公西","漆雕","乐正","壤驷","公良","拓拔","夹谷","宰父","谷梁","段干","百里","东郭","南门","呼延","归","海","羊舌","微生","梁丘","左丘","东门","西门","南宫"};	
			
		Random r = new Random();
		
		int nextInt = r.nextInt(str.length-1);
		
		String name= str[nextInt];
		 //随机真假
		  if(r.nextBoolean()) {//如果返回真则返回带两个字符的中文
			 name += randomChineseString(2); 
		  }else {//返回一个中文 字符
			  name += randomChineseString();
		  }

			return name;
		}
	//TODO 实现代码
	}
	


