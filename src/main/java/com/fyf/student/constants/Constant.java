package com.fyf.student.constants;

import java.time.format.DateTimeFormatter;

/**
 * @author fuyufan
 * @date 2020/11/26 17:59
 */
public interface Constant {
    /**
     * 系统序列化反序列化的时间格式
     */
    DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    String DEFAULT_PAGE_NUM = "0";

    String DEFAULT_PAGE_SIZE = "10";

    Integer CARD_STATUS_BIND = 1;

    Integer CARD_STATUS_UNBIND = 0;

    int EXCEL_MAX_DATA_ROW = 65535;

    String CACHE_CARD_DATA_KEY = "csmpuser:card:card_data";

    String RESIDENCE_PERMIT_RECORD_STATUS = "recordStatus";

    String RESIDENCE_PERMIT_RECORD_TIME = "recordTime";

    String RESIDENCE_PERMIT_BUSINESS_CODE = "businessCode";

    String FORM_DEFAULT_VALUE_TAG = "__current_user__";
}
