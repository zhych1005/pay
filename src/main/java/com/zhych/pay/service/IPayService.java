package com.zhych.pay.service;

import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;
import com.zhych.pay.pojo.PayInfo;

import java.math.BigDecimal;

public interface IPayService {
    /**
     * 创建/发起支付
     */
    PayResponse create(String orderId, BigDecimal amount, BestPayTypeEnum bestPayTypeEnum);

    /**
     * 异步通知的处理
     * @param notifyData
     */
    String asyncNotify(String notifyData);

    /**
     * 查询支付记录（通过订单号查询）
     * @param orderId
     * @return
     */
    PayInfo queryByOrderId(String orderId);
}
