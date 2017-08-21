package com.wurq.base.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * Created by chuan.he on 2017/6/26.
 * 实体父类，所有继承该类的子类实体
 * 所有参数get、set方法都要补全
 * 不然fastJson无法成功解析
 */

public class BaseMapper extends SerializableMapper {
    private String message           = "";             //信息
    private String code              = "";             //状态码
    private String sign              = "";             //签名
    private boolean serResult ;                        //服务端是否返回
    private boolean success;                           //请求结果布尔值

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public boolean isSerResult() {
        return serResult;
    }

    public void setSerResult(boolean serResult) {
        this.serResult = serResult;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        String groupModelConvert = JSON.toJSONString(this,
                SerializerFeature.WriteNullListAsEmpty,
                SerializerFeature.WriteNullStringAsEmpty,
                SerializerFeature.WriteNonStringKeyAsString);
        return groupModelConvert;
    }
}
