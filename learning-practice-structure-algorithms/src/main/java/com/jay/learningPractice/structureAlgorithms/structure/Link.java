package com.jay.learningPractice.structureAlgorithms.structure;

/**
 * 链表接口，学习实战，主要包含链表的插入、删除、查找方法
 *
 * @author crm
 * @version 1.0
 * @date 2019/5/27 17:36
 */
public interface Link<E> {


    /**
     * 在链表尾部插入元素
     *
     * @param e
     */
    boolean add(E e);

    /**
     * 在指定位置插入元素
     *
     * @param index
     * @param e
     */
    boolean add(int index, E e);

    /**
     * 删除指定的元素
     *
     * @param e
     * @return
     */
    boolean remove(E e);

    /**
     * 查找某个元素
     *
     * @param e
     * @return
     */
    E find(E e);

    /**
     * 获取头部节点元素
     *
     * @return
     */
    E getHeader();

    /**
     * 获取尾部元素
     *
     * @return
     */
    E getTair();

}
