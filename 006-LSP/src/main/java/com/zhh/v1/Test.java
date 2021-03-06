package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-04 23:57
 */
public class Test {

    public static void main(String[] args) {
        IGoods iGoods = new FoodDiscount(1, "巧克力", 9.9);

        FoodDiscount foodDiscount = (FoodDiscount) iGoods;

        String msg = String.format("商品ID: %s, 商品名称: %s, 商品原价: %s, 商品折后价: %s",
                foodDiscount.getId(), foodDiscount.getName(), foodDiscount.getPrice(), foodDiscount.getDiscountPrice());

        System.out.println(msg);
    }
}
