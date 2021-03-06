package com.zhh.v1;

/**
 * @author zhh
 * @description 商品接口
 * @date 2020-02-04 22:47
 */
public interface IGoods {

    /**
     * 获取商品ID
     */
    Integer getId();

    /**
     * 获取商品名称
     */
    String getName();

    /**
     * 获取商品价格
     */
    Double getPrice();
}
