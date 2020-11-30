package com.fyf.student.model;

import com.fyf.student.enums.ResponseCodeEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author fuyufan
 * @date 2020/11/27 15:09
 */
@NoArgsConstructor
@Getter
public class ResultModel<T> {
    private int errcode;
    private String errmsg;
    private T data;

    public ResultModel(ResponseCodeEnum resCode) {
        this.errcode = resCode.getCode();
        this.errmsg = resCode.getDesc();
    }

    public ResultModel(ResponseCodeEnum resCode, T data) {
        this.errcode = resCode.getCode();
        this.errmsg = resCode.getDesc();
        this.data = data;
    }

    public ResultModel(ResponseCodeEnum resCode, String customMsg) {
        this.errcode = resCode.getCode();
        this.errmsg = customMsg;
    }
}
