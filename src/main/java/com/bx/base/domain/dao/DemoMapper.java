package com.bx.base.domain.dao;

import com.bx.base.domain.entity.Demo;

/**
 * demo处理
 * @author xuemei
 *
 */
public interface DemoMapper extends Mapper<Demo> {

	/**
	 * 根据用户主键查询数据
	 *
	 * @param id
	 * @return
	 */
	Demo getInfoById(Integer id);
	
}
