package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
List<Item> getItems(String orderId);//通过订单id获得商品
void decreaseNumbers(List<Item> list);//在保存订单时减少商品库存

}
