package com.em.dao;

import java.util.List;
import java.util.Map;

/**
 * 权限变更的与数据库交互
 * 
 * @author liuzhihu
 *
 */
public interface AnthorityDao {

	/**
	 * 获取权限菜单
	 * 
	 * @param roleId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public List<Map> getMenuList(Integer roleId);

}
