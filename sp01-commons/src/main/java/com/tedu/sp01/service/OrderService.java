package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

public interface OrderService {
Order getOrder(String orderId);//通过订单id获取商品列表
void addOrder(Order order);
}
