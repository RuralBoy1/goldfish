package com.goldfish.goldfish.service;

import com.goldfish.goldfish.entity.CartInfo;
import com.goldfish.goldfish.entity.GoodsInfo;

import java.util.List;

public interface GoodsService {
    public List<GoodsInfo> selectGoods(int goodsStatus);
    public List<GoodsInfo> selectsortGoods(String goodsSort);
    public List<GoodsInfo> selectuidGoods(String uId);
    public List<GoodsInfo> selectidGoods(String goodsId);
    public List<GoodsInfo> selectsellGoods(String uId);
    public List<GoodsInfo> selectbuyGoods(String bId);
    public int insertGoods(GoodsInfo goodsinfo);
    public int updateGoods(String bId,String bPhone,String bName,String bAddres,List<CartInfo> ci);
    public int deleteGoods(String goodsId);


}
