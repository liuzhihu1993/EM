package com.em.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.em.dao.AnthorityDao;
import com.em.service.AnthorityService;

/**
 * 
 * @author liuzhihu
 *
 */
@Service
@Transactional
public class AnthorityServiceImpl implements AnthorityService {

	@Autowired
	AnthorityDao anthorityDao;

	@SuppressWarnings("rawtypes")
	public List<Map> getMenuList(Integer roleId) {

		return anthorityDao.getMenuList(roleId);
	}

}
