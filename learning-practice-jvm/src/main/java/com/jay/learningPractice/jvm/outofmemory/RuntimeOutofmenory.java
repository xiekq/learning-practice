package com.jay.learningPractice.jvm.outofmemory;

import java.util.ArrayList;
import java.util.List;

/**
 * 方法区常量池内存溢出测试类
 *
 * @author
 * @create 2018-06-27 16:42
 **/
public class RuntimeOutofmenory {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true){
            list.add(String.valueOf(i++).intern());
        }
    }

}
