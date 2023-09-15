package org.ooad.v1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo {
    Integer id;

    String title;

    String order_no;

    Integer user_id;

    Integer total_fee;

    String order_status;

}
