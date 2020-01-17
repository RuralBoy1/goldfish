package com.goldfish.goldfish.entity;

public class CartInfo {
    private int cartId;
    private String cartName;
    private String cartImage;
    private int cartPrice;
    private String cartUid;

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getCartName() {
        return cartName;
    }

    public void setCartName(String cartName) {
        this.cartName = cartName;
    }

    public String getCartImage() {
        return cartImage;
    }

    public void setCartImage(String cartImage) {
        this.cartImage = cartImage;
    }

    public int getCartPrice() {
        return cartPrice;
    }

    public void setCartPrice(int cartPrice) {
        this.cartPrice = cartPrice;
    }

    public String getCartUid() {
        return cartUid;
    }

    public void setCartUid(String cartUid) {
        this.cartUid = cartUid;
    }
}
