package com.goldfish.goldfish.entity;

public class GoodsInfo {
    private String goodsId;
    private String uId;
    private String goodsImage;
    private String goodsRemark;
    private String goodsName;
    private String goodsSort;
    private float goodsPrice;
    private int goosStatus;

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }



    public String getGoodsRemark() {
        return goodsRemark;
    }

    public void setGoodsRemark(String goodsRemark) {
        this.goodsRemark = goodsRemark;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsSort() {
        return goodsSort;
    }

    public void setGoodsSort(String goodsSort) {
        this.goodsSort = goodsSort;
    }

    public float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoosStatus() {
        return goosStatus;
    }

    public void setGoosStatus(int goosStatus) {
        this.goosStatus = goosStatus;
    }
}
