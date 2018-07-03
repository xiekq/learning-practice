package com.hooray.learningPractice.jvm.gc;

import org.omg.CORBA.ULongLongSeqHelper;

/**
 * 引用计数GC测试类
 *
 * @author xiekeqing
 * @create 2018-06-28 10:21
 **/
public class ReferenceCountingGC {

    public Object instance = null;

    private static final int _1MB =1024* 1024;

    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();
    }

}
