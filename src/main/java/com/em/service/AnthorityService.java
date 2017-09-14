package com.em.service;

import java.util.List;
import java.util.Map;

/***
 * 获取菜单的业务类
 * 
 * @author liuzhihu
 *
 */
public interface AnthorityService {

	/**
	 * 获取权限菜单
	 * 
	 * @param roleId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public List<Map> getMenuList(Integer roleId);
}
