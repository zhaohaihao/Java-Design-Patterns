package com.zhh.v2;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-05 20:40
 */
public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        person.buyGood(new Coke());
        person.buyGood(new Crisps());
    }
}
