package org.ooad.v1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ooad.v1.entity.OrderInfo;

import java.util.List;

@Mapper
public interface OrderInfoMapper {

    void insertOrderInfo(OrderInfo orderInfo);

    List<OrderInfo> selectNoPayOrderInfo();

    List<OrderInfo> selectOrderInfoByOrderNo(String order_no);

    void updateStatusByOrderNo(String order_no);
}
