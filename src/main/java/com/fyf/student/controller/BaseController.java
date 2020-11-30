package com.fyf.student.controller;

import com.fyf.student.constants.Constant;
import com.fyf.student.enums.ResponseCodeEnum;
import com.fyf.student.model.PageModel;
import com.fyf.student.model.ResultModel;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * @author fuyufan
 * @date 2020/11/27 15:06
 */
@Slf4j
@Scope
public class BaseController implements Constant {

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private HttpServletRequest request;

    protected ResultModel success() {
        return new ResultModel(ResponseCodeEnum.OK);
    }

    protected ResultModel success(Object data) {
        return new ResultModel(ResponseCodeEnum.OK, data);
    }

    protected ResultModel<T> success(T data) {
        return new ResultModel(ResponseCodeEnum.OK, data);
    }

    protected ResultModel success(Page page) {
        return new ResultModel(ResponseCodeEnum.OK, new PageModel<Page>(page));
    }

    protected ResultModel success(PageModel pageResult) {
        if (pageResult.getItems() == null) {
            pageResult.setItems(new ArrayList());
        }
        return new ResultModel(ResponseCodeEnum.OK, pageResult);
    }
}
