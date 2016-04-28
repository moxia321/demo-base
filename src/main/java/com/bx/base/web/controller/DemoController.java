package com.bx.base.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bx.base.Constants;
import com.bx.base.util.BaseUtil;
import com.bx.base.web.form.DemoForm;
import com.bx.base.web.form.vo.DemoVo;
import com.bx.base.web.service.DemoInterface;

/**
 * demo
 * @author xuemei
 *
 */
@Controller
@RequestMapping("demo/")
public class DemoController extends BaseController {
	
	/** 日志 */
	private static final Logger log = LogManager.getLogger(DemoController.class);
	
	@Autowired
	private DemoInterface demoInterface;
	
	@RequestMapping("index")
	public String index() {
		return "../index.jsp";
	}
	
	
	/**
	 * demo
	 */
	@RequestMapping("getInfo")
	public String getInfo(DemoForm demoForm, HttpServletRequest request, HttpServletResponse response){
		
 		Integer id = demoForm.getId();
 		
 		//参数检查
		if(BaseUtil.isEmpty(id)){
			outPrint(Constants.RETURN_STATE_FAIL, Constants.PARAM_VALIDATE_FAIL, id, response);
			return null;
		}
		
		DemoVo result = null;
		try{
			result = demoInterface.getInfoById(id);
		}catch(Exception e){
			log.error(e.getStackTrace());
		}
		
		outPrint(Constants.RETURN_STATE_SUCCESS, Constants.SYSYTEM_OK, result, response);
		return null;
	}
}
