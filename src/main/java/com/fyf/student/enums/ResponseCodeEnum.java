package com.fyf.student.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author fuyufan
 * @date 2020/11/26 17:57
 */
@AllArgsConstructor
@Getter
public enum ResponseCodeEnum {
    OK(200, "ok"),
    NO_DATA(300, "ok"),
    SYSTEM_EXCEPTION(70, "系统异常"), USER_OPERATE_ERROR(71, "用户操作错误"),
    USERNAME_OR_PWD_ERROR(72, "用户名或密码错误"), TOKEN_INVALID(73, "登录令牌无效"), HEALTH_CARD_EXCEPTION(74, "微信健康卡服务异常"),
    THRID_API_EXCEPTION(80, "第三方接口调用失败"),
    ORDER_NOT_EXISTS(81, "该订单号不存在!"),
    TIF_CALL_FAILED(91, "统一认证接口调用失败!");

    private int code;
    private String desc;
}
