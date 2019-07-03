package com.hooray.learningPractice.structureAlgorithms.structure;

import java.util.function.Consumer;

/**
 * 单向链表
 *
 * @author jay
 * @version 1.0
 * @date 2019/5/8 23:15
 */
public class SinglyLink<E> implements Link<E> {

    private Node<E> header;
    private Node<E> tair;

    @Override
    public boolean add(E e) {
        Node node = new Node(e, null);
        if (header == null) {
            header = node;
        }
        if (tair != null) {
            tair.setNext(node);
        }
        tair = node;
        return true;
    }

    @Override
    public boolean add(int index, E e) {
        return true;
    }

//    public void forEach(Consumer<Object> action) {
//        Node temp = header;
//        while (temp != null) {
//            action.accept(temp.getItem());
//            temp = temp.next;
//        }
//    }

//    public Node pullHeader() {
//        if (header == null) {
//            return null;
//        }
//        Node I = header;
//        //头部节点为尾节点
//        if (header.getNext() == null) {
//            header = null;
//            tair = null;
//        }
//        header = I.next;
//
//        return I;
//    }

    @Override
    public E find(E e) {
        Node temp = header;
        while (temp != null) {
            if (temp.getItem().equals(e)) {
                return (E) temp.getItem();
            }
            temp = temp.next;
        }
        return null;
    }

    @Override
    public boolean remove(E e) {
        //遍历临时节点
        Node temp = header;
        //前置节点
        Node pre = null;
        while (temp != null) {
            if (temp.getItem().equals(e)) {
                if (pre == null) {

                }
                //查找到的节点为头部节点,且不只一个节点
                //则将查找到的下一节点设置为头部节点并返回
                if (pre == null && temp.getNext() != null) {
                    header = temp.next;
                }
            }
            pre = temp;
            temp = temp.next;
        }
        return true;
    }

    protected class Node<E> {
        E item;
        Node next;

        public Node() {
        }

        public Node(E item) {
            this.item = item;
        }

        public Node(E item, Node next) {
            this.item = item;
            this.next = next;
        }

        public E getItem() {
            return item;
        }

        public void setItem(E item) {
            this.item = item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public E getHeader() {
        if (null != header) {
            return header.getItem();
        }
        return null;
    }


    public E getTair() {
        if (null != tair) {
            return tair.getItem();
        }
        return null;
    }

}
