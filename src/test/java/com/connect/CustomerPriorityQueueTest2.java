/**
 * Project Name: SpringbootFeatures
 * File Name: CustomerPriorityQueueTest
 * Package Name: com.connect
 * Date: 2021/6/30 10:44
 * Copyright (c) 2021,All Rights Reserved.
 */
package com.connect;

import org.junit.jupiter.api.Test;

import java.util.*;
 /**
  * @author: 吕建亮
  * @description: PriorityQueue ，ArrayList ， 数组排序
  * @param:
  * @return:
  * create time: 2021/6/30 11:33
  */
public class CustomerPriorityQueueTest2 {

    static class E{
        int x ;
        int y ;
        int state ;
        int money ;
        public E(int x , int y , int state , int money){
            this.x  = x ;
            this.y = y ;
            this.state = state ;
            this.money = money ;
        }
    }

    @Test
    public   void test3() {
        PriorityQueue<E> q = new PriorityQueue<E>(1 , new Comparator<E>() {
            @Override
            public int compare(E a , E b) {
                return a.money - b.money ;
            }
        }) ;
        q.add(new E(1, 0, 0, 1)) ;
        q.add(new E(2, 0, 0, 3)) ;
        q.add(new E(3, 0, 0, 2)) ;
        q.add(new E(4, 0, 0, 5)) ;
        q.add(new E(5, 0, 0, 9)) ;
        while(! q.isEmpty()){
            System.out.println(q.poll().money) ;
        }

    }
    @Test
    public   void test2() {
        E[] q = new E[100]  ;
        q[0] = new E(1, 0, 0, 1) ;
        q[1] = new E(2, 0, 0, 3) ;
        q[2] = new E(3, 0, 0, 2) ;
        q[3] = new E(4, 0, 0, 5) ;
        q[4] = new E(5, 0, 0, 9) ;

        Arrays.sort(q, 0, 5, new Comparator<E>() {
            @Override
            public int compare(E a, E b) {
                return  a.money - b.money ;
            }
        }) ;

        for(int i = 0 ; i < 5  ; i++){
            System.out.println(q[i].money) ;
        }

    }

        @Test
    public   void test1() {
            ArrayList<E> q = new ArrayList<E>() ;
            q.add(new E(1, 0, 0, 1)) ;
            q.add(new E(2, 0, 0, 3)) ;
            q.add(new E(3, 0, 0, 2)) ;
            q.add(new E(4, 0, 0, 5)) ;
            q.add(new E(5, 0, 0, 9)) ;

            Collections.sort(q ,   new Comparator<E>() {
                        @Override
                        public int compare(E a , E b) {
                            return a.money - b.money ;
                        }
                    }
            ) ;

            for(E e : q){
                System.out.println(e.money) ;
            }
    }

    public static void main(String[] args) {
//        CustomerPriorityQueueTest.test1();
    }

}

