package com.jay.learningPractice.jvm.outofmemory;

/**
 * 虚拟机栈溢出测试类
 *
 * @author
 * @create 2018-06-27 16:16
 **/
public class StackOutofmemory {

    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        StackOutofmemory stackOutofmemory = new StackOutofmemory();
        try {
            stackOutofmemory.stackLeak();;
        }catch (Throwable e){
              System.out.println("stack length:" + stackOutofmemory.stackLength);
              throw  e;
        }
    }

}
