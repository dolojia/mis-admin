package com.dolojia.admin.manage.validator;

import com.dolojia.admin.common.exception.RRException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;


/**
* 描述: hibernate-validator校验工具类
* 作者: dolojia
* 修改日期: 2018/9/9 下午2:00
* E-mail: dolojia@gmail.com
**/
public class ValidatorUtils {
    private static Validator validator;

    static {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    /**
     * 校验对象
     * @param object        待校验对象
     * @param groups        待校验的组
     * @throws RRException  校验不通过，则报RRException异常
     */
    public static void validateEntity(Object object, Class<?>... groups)
            throws RRException {
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(object, groups);
        if (!constraintViolations.isEmpty()) {
        	ConstraintViolation<Object> constraint = (ConstraintViolation<Object>)constraintViolations.iterator().next();
            throw new RRException(constraint.getMessage());
        }
    }
}
