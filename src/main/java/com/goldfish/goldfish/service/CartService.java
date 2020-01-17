package com.goldfish.goldfish.service;

import com.goldfish.goldfish.entity.CartInfo;

import java.util.List;

public interface CartService {
    public int insertCart(CartInfo cartInfo);
    public int deleteCart(String cartImage);
    public int deleteCart1(String cartUid);
    public List<CartInfo> selectCart(String cartUid);
}
