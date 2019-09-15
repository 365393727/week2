/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: JunitParent.java 
 * @Prject: zhangkai-cms
 * @Package: com.zhangkai.service.impl 
 * @Description: TODO
 * @author: 张凯   
 * @date: 2019年9月10日 下午7:07:14 
 * @version: V1.0   
 */
package com.zhangkai.utils;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * @ClassName: JunitParent 
 * @Description: TODO
 * @author: 张凯
 * @date: 2019年9月10日 下午7:07:14  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class JunitParent {

}
