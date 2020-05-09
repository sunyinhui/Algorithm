package com.sunyinhui.data.structures.chapter01_linkedlist;

import java.util.ArrayList;

/**
 * @description: 链表
 * @author: yinhui.sun
 * @date: 2019-10-21 10:25
 */
public class Num_1_LinkedList<E> {

    private int size;

    private Node<E> first;


    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("world");

        for (String s : arrayList) {
            if ("world".equals(s)) {
                arrayList.remove(s);
            }
        }


    }


    /**
     * 节点 内部类
     */
    private static class Node<E> {
        E  elementE;
        Node<E> next;
        public Node(E elementE, Node<E> next) {
            this.elementE = elementE;
            this.next = next;
        }
    }
}



