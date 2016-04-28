package com.bx.base.web.service;

import com.bx.base.web.form.vo.DemoVo;

/**
 * demo服务
 * @author xuemei
 *
 */
public interface DemoInterface{

	/**
	 * 据主键查
	 * @param uid
	 * @return
	 */
	public DemoVo getInfoById(Integer id) throws Exception;
}
