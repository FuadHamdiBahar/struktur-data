package com.belajar;

public class Main2 {

    public static void main(String[] args) {
        DoubleLinkedList dl = new DoubleLinkedList();
        dl.insertHead(10);
        dl.insertHead(0);
        dl.insertTail(20);
        dl.insertTail(30);
        dl.insertTail(40);
        dl.print();
        dl.deleteHead();
        dl.print();
        dl.deleteTail();
        dl.print();

    }
}