package com.hooray.learningPractice.jdkcharacter.lambda;

import java.util.Comparator;

/**
 * lambda实践类
 *
 * @author
 * @create 2018-05-10 18:08
 **/
public class lambdaPractice {

    public static void main(String[] args) {
        System.out.println("测试无参数，无返回值 ");
        Runnable r1 = () -> System.out.println("hello lambda");
        r1.run();

        //测试有一个参数且无返回值
//        (String) -> System.out.print(x);

        System.out.println("测试有参数，有返回值,多行代码 ");
        Comparator<Integer> c1 = (x,y)->{
            System.out.println(Integer.compare(x, y)+"函数式接口");
            return Integer.compare(x,y);
        };
        c1.compare(4,1);

        System.out.println("测试有参数，有返回值，一行代码 ");
        Comparator<Integer> c2 = (x,y)-> Integer.compare(x,y);
        System.out.println(c2.compare(4,1));

    }

}
