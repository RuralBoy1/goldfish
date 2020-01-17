package com.goldfish.goldfish.dao;
import com.goldfish.goldfish.entity.CartInfo;
import org.apache.ibatis.annotations.Param;
import com.goldfish.goldfish.entity.GoodsInfo;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsDao {
    public List<GoodsInfo> selectGoods(int goodsStatus);
    public List<GoodsInfo> selectsortGoods(String goodsSort);
    public List<GoodsInfo> selectuidGoods(String uId);
    public List<GoodsInfo> selectsellGoods(String uId);
    public List<GoodsInfo> selectbuyGoods(String bId);
    public List<GoodsInfo> selectidGoods(String goodsId);
    public int insertGoods(GoodsInfo goodsinfo);
    public int updateGoods( @Param(value = "bId") String bId,@Param(value = "bPhone") String bPhone,@Param(value = "bName")String bName,@Param(value = "bAddres")String bAddres,@Param(value = "ci")List<CartInfo> ci);
    public int deleteGoods(String goodsId);
    public void insertGoods1(String uId);

}
