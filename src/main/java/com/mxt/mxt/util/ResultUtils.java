package com.mxt.mxt.util;

import com.mxt.mxt.pojo.Result;

/**
 * Created by Administrator on 2017/7/1.
 */
public class ResultUtils {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }

    public static Result error(ExceptionEnum exceptionEnum) {
        Result result = new Result();
        result.setCode(exceptionEnum.getCode());
        result.setMsg(exceptionEnum.getMsg());
        result.setData(null);
        return result;
    }

}
