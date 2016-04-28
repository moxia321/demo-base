package com.bx.base.web.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bx.base.domain.dao.DemoMapper;
import com.bx.base.domain.entity.Demo;
import com.bx.base.web.form.vo.DemoVo;
import com.bx.base.web.service.DemoInterface;


/**
 * demo服务实现
 * @author xuemei
 *
 */
@Service
public class DemoImpl implements DemoInterface {

	@Autowired
	private DemoMapper demoMapper;
	
	/**
	 * 据主键查
	 */
	public DemoVo getInfoById(Integer id) throws Exception{
		DemoVo demoVo = new DemoVo();
		Demo demo = demoMapper.getInfoById(id);
		BeanUtils.copyProperties(demo, demoVo);
		return demoVo;
	}
}
