package com.mxt.mxt.util;

/**
 * Created by Administrator on 2017/7/1.
 */
public class ActiveException extends RuntimeException {


    private Integer code;

    public ActiveException(ExceptionEnum exceptionEnum){
        super(exceptionEnum.getMsg());
        this.code = exceptionEnum.getCode();
    }

    public ActiveException(Integer code, String msg){
        super(msg);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
