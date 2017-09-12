package com.em.utils;

/**
 * 用于分页的类
 * 
 * @author liuzhihu
 *
 */
public class BaseBean {
	private int start;// 起始记录

	private int length;// 每次查询的条数

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
