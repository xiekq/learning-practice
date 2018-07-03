package com.hooray.learningPractice.jvm.outofmemory;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆内存溢出测试类
 *
 * @author
 * @create 2018-06-27 15:36
 **/
public class HeapOutofmemory {


    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());
        }
    }

}
