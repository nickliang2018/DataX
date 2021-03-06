package com.alibaba.datax.plugin.reader.mongodbjsonreader;

import com.alibaba.datax.common.spi.ErrorCode;

/**
 * Created by jianying.wcj on 2015/3/19 0019.
 */
public enum MongoDBJsonReaderErrorCode implements ErrorCode {

    ILLEGAL_VALUE("ILLEGAL_PARAMETER_VALUE","参数不合法"),
    ILLEGAL_ADDRESS("ILLEGAL_ADDRESS","不合法的Mongo地址"),
    UNEXCEPT_EXCEPTION("UNEXCEPT_EXCEPTION","未知异常");

    private final String code;

    private final String description;

    private MongoDBJsonReaderErrorCode(String code,String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

