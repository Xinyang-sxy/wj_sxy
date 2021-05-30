package com.evan.wj.result;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: xinyang shen
 * \* Date: 2021/4/27
 * \* Time: 18:28
 * \* Description:
 * \
 */
public class Result {
    //响应码
    private int code;
    private String message;
    private Object result;

    Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.result = data;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}


