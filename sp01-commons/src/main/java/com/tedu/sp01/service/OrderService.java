package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

public interface OrderService {
Order getOrder(String orderId);//ͨ������id��ȡ��Ʒ�б�
void addOrder(Order order);
}