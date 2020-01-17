package com.goldfish.goldfish.service;

import com.goldfish.goldfish.dao.GoodsDao;
import com.goldfish.goldfish.entity.CartInfo;
import com.goldfish.goldfish.entity.GoodsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("goodsservice")
public class GoodsServiceimpl implements GoodsService {
    @Autowired
    private GoodsDao goodsdao;
    public List<GoodsInfo> selectGoods(int goodsStatus){
        return  goodsdao.selectGoods(goodsStatus);
    }
    public List<GoodsInfo> selectsellGoods(String uId) {return goodsdao.selectsellGoods(uId);}
    public List<GoodsInfo> selectbuyGoods(String bId) {return goodsdao.selectbuyGoods(bId);}
    public List<GoodsInfo> selectsortGoods(String goodsSort){
        return  goodsdao.selectsortGoods(goodsSort);
    }
    public List<GoodsInfo> selectuidGoods(String uId){
        return goodsdao.selectuidGoods(uId);
    }
    public List<GoodsInfo> selectidGoods(String goodsId) {
        return goodsdao.selectidGoods(goodsId);
    };
    public int insertGoods(GoodsInfo goodsinfo){
        return goodsdao.insertGoods(goodsinfo);
    }
    public int updateGoods(String bId,String bPhone,String bName,String bAddres,List<CartInfo> ci) {return goodsdao.updateGoods(bId,bPhone,bName,bAddres,ci);};
    public int deleteGoods(String goodsId){
        return goodsdao.deleteGoods(goodsId);
    }


}
