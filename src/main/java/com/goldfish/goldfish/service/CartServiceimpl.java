package com.goldfish.goldfish.service;

import com.goldfish.goldfish.dao.CartDao;
import com.goldfish.goldfish.entity.CartInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cartservice")
public class CartServiceimpl implements CartService {
    @Autowired
    CartDao cartdao;
    public int insertCart(CartInfo cartInfo){
        return cartdao.insertCart(cartInfo);
    }
    public int deleteCart(String cartImage){
        return cartdao.deleteCart(cartImage);
    }
    public int deleteCart1(String cartUid) {return  cartdao.deleteCart1(cartUid); };
    public List<CartInfo> selectCart(String cartUid){
        return cartdao.selectCart(cartUid);
    }

}
