package org.ooad.v1.service.itf;

public interface AliPayService {
    String tradeCreate(Integer payAmount, Integer userId);

    String queryOrder(String orderNo);

    void checkOrderStatus(String orderNo);

}
