package com.mxt.mxt.util;

import com.mxt.mxt.pojo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/7/1.
 */
@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = ActiveException.class)
    @ResponseBody
    public Result handleActiveException(ActiveException e) {
        return ResultUtils.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handleException() {
        return ResultUtils.error(ExceptionEnum.UNKNOW_ERROR);
    }

}
