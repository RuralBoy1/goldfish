package com.goldfish.goldfish.dao;

import com.goldfish.goldfish.entity.CartInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartDao {
      public int insertCart(CartInfo cartInfo);
      public int deleteCart(String cartImage);
      public int deleteCart1(String cartUid);
      public List<CartInfo> selectCart(String cartUid);
}
