package org.ooad.v1.service.itf;

import org.ooad.v1.entity.OrderInfo;

import java.util.List;

public interface OrderInfoService{

    OrderInfo createOrderByProductId(int payAmount, int userId);

    public List<OrderInfo> getNoPayOrderList();
}

