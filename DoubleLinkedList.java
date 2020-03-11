package com.belajar;

class DoubleLinkedList {
    Node2 head;
    Node2 tail;

    void insertHead(int v) {
        if (head == null) {
            head = new Node2(v);
            return;
        }
        if (tail == null) {
            Node2 newNode = new Node2(v);
            newNode.next = head;
            head.prev = newNode;
            tail = head;
            head = newNode;
            return;
        }
        Node2 newNode = new Node2(v);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void insertTail(int v) {
        if (head != null) {
            Node2 newNode = new Node2(v);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            insertHead(v);
        }
    }

    void deleteHead() {
        if (head == null) {
            System.out.println("Empty List");
        }
        head = head.next;
        head.prev = null;
    }

    void deleteTail() {
        if (tail == null) {
            System.out.println("Head is Tail");
        }
        tail = tail.prev;
        tail.next = null;

    }

    void print() {
        System.out.println("head :" + head.value);
        System.out.println("tail :" + tail.value);
        Node2 temp = head;
        System.out.printf("null -> ");
        while (temp.next != null) {
            System.out.printf("<- %s -> ", temp.value);
            temp = temp.next;
        }
        System.out.printf("<- %s -> null\n", temp.value);
    }
}