package com.hooray.learningPractice.structureAlgorithms.structure;

import com.hooray.learningPractice.structureAlgorithms.structure.SinglyLink.Node;

/**
 * TODO
 *
 * @author crm
 * @version 1.0
 * @date 2019/5/9 11:26
 */
public class SinglyLinkListTest {

    public static void main(String[] args) {
        SinglyLink<String> singlyLinkList = new SinglyLink();

        //插入节点
        for(int i = 0;i<9;i++){
            singlyLinkList.add("node-"+i);
        }

        //获取头部节点
        String header = singlyLinkList.getHeader();
        System.out.println("header: "+header);

        //获取尾部节点
        String tair = singlyLinkList.getTair();
        System.out.println("tair: "+tair);

//        singlyLinkList.forEach(s->{
//            System.out.println(s);
//        });
//
//        //取出头部节点
//        singlyLinkList.pullHeader();

        //从头部遍历查找首次出现的节点
        System.out.println(singlyLinkList.find("node-5"));

        //删除某个节点
        singlyLinkList.remove("node-5");

        System.out.println(singlyLinkList.find("node-5"));
    }

}
