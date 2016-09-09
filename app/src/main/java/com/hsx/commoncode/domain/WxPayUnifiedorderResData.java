package com.hsx.commoncode.domain;

/**
 * Created by Doraemon
 * Date: 16/9/9
 * Time: 09:30
 * Summary:微信下订单成功之后的结果
 * https://pay.weixin.qq.com/wiki/doc/api/app/app.php?chapter=9_1
 */
public class WxPayUnifiedorderResData {
    /**
     * 业务结果:SUCCESS/FAIL
     */
    private String result_code;
    /**
     * 微信返回的签名
     */
    private String sign;
    /**
     * 调用接口提交的商户号
     */
    private String mch_id;
    /**
     * 微信生成的预支付回话标识，用于后续接口调用中使用，该值有效期为2小时
     */
    private String prepay_id;
    /**
     * 返回信息，如非空，为错误原因
     * 签名失败
     * 参数格式校验错误
     */
    private String return_msg;
    /**
     * 调用接口提交的应用ID
     */
    private String appid;
    /**
     * 微信返回的随机字符串
     */
    private String nonce_str;
    /**
     * SUCCESS/FAIL
     * 此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断
     */
    private String return_code;
    /**
     * 调用接口提交的交易类型，取值如下：JSAPI，NATIVE，APP
     */
    private String trade_type;


    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getPrepay_id() {
        return prepay_id;
    }

    public void setPrepay_id(String prepay_id) {
        this.prepay_id = prepay_id;
    }

    public String getReturn_msg() {
        return return_msg;
    }

    public void setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }
}
