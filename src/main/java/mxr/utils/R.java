/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package mxr.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import mxr.enums.EnumHttpCode;

import java.io.Serializable;
/**
 * 返回数据
 *
 * @author Mark sunlightcs@gmail.com
 */

/**
 * 响应信息主体
 *
 * @author ruoyi
 */
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class R<T> implements Serializable{
    private static final long serialVersionUID = 1L;
    private Integer code;
    private String msg;
    private T data;

    public R() {
        this.code = EnumHttpCode.SUCCESS.getCode();
        this.msg = EnumHttpCode.SUCCESS.getMsg();
    }

    public static R okResult() {
        R result = new R();
        return result;
    }

    public static R okResult(Object data) {
        R result = setHttpCodeEnum(EnumHttpCode.SUCCESS, EnumHttpCode.SUCCESS.getMsg());
        if (data != null) {
            result.setData(data);
        }
        return result;
    }

    public static R okResult(EnumHttpCode s,Object data) {
        R result = setHttpCodeEnum(s, s.getMsg());
        if (data != null) {
            result.setData(data);
        }
        return result;
    }

    public static R errorResult(int code, String msg) {
        R result = new R();
        return result.error(code, msg);
    }

    public static R errorResult(EnumHttpCode enums) {
        return setHttpCodeEnum(enums, enums.getMsg());
    }

    public static R errorResult(EnumHttpCode enums, String msg) {
        return setHttpCodeEnum(enums, msg);
    }
    public static R errorResult(Object data) {
        R result = setHttpCodeEnum(EnumHttpCode.FAIL, EnumHttpCode.FAIL.getMsg());
        if (data != null) {
            result.setData(data);
        }
        return result;
    }

    public static R errorResult(String message) {
        return setHttpCodeEnum(EnumHttpCode.FAIL,message);
    }

    private static R setHttpCodeEnum(EnumHttpCode enums, String msg) {
        R result = new R();
        return result.ok(enums.getCode(), null, msg);
    }

    public R<?> error(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        return this;
    }

    private R<?> ok(Integer code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
        return this;
    }
}
