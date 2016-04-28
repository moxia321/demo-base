package com.bx.base.web.form.validator;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.bx.base.util.BaseUtil;



/**
 * 不为空验证
 */
public class NotValueValidator implements ConstraintValidator<NotValue, Object> {

	public void initialize(NotValue constraintAnnotation) {
	}

	public boolean isValid(Object value, ConstraintValidatorContext context) {
		if (value != null) {
			return BaseUtil.isEmpty(value.toString().replaceAll("　", "").trim());
		}

		return false;
	}

}
