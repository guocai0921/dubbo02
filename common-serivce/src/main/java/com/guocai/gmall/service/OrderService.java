package com.guocai.gmall.service;

import java.util.List;

import com.guocai.gmall.bean.UserAddress;


public interface OrderService {

    /**
     * 初始化订单
     *
     * @param userId
     */
    public List<UserAddress> initOrder(String userId);

}
