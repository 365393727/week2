/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: FileUtilTest.java 
 * @Prject: zhangkai-utils
 * @Package: com.zhangkai.utils 
 * @Description: TODO
 * @author: 张凯   
 * @date: 2019年9月5日 下午4:59:04 
 * @version: V1.0   
 */
package com.zhangkai.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

/** 
 * @ClassName: FileUtilTest 
 * @Description: TODO
 * @author: 张凯
 * @date: 2019年9月5日 下午4:59:04  
 */
public class FileUtilTest {

	/**
	 * Test method for {@link com.zhangkai.utils.FileUtil#getExtendName(java.lang.String)}.
	 */
	@Test
	public void testGetExtendName() {

		String file="abc.doc";
		
		String name = FileUtil.getExtendName(file);
		
		System.out.println(name);
		
	}

	/**
	 * Test method for {@link com.zhangkai.utils.FileUtil#getTempDirectory()}.
	 */
	@Test
	public void testGetTempDirectory() {

		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}

	/**
	 * Test method for {@link com.zhangkai.utils.FileUtil#getUserDirectory()}.
	 */
	@Test
	public void testGetUserDirectory() {

		File file = FileUtil.getUserDirectory();
		
		System.out.println(file);
	}

}
