package com.belajar;

/*
1. insert di head
2. insert di tail
3. insert di tengah
4. delete di head,tail,tengah
5. Search         dan di node ke berapa
6. cetak
7. mencari data terbesar dalam list
8. mencari jumlah/ sum dalam list
*abstract
*/

public class SingleLinkedList2 {

    Node2 head;

    public void insertHead(int v) {

        if (head == null) {
            head = new Node2(v);
        } else {
            Node2 newnode = new Node2(v);
            newnode.next = head;
            head = newnode;
        }

    }

    public void insertTail(int v) {
        Node2 temp = head;
        if (head == null) {
            head = new Node2(v);
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        Node2 newNode = new Node2(v);
        temp.next = newNode;
    }

    void print() {
        Node2 temp = head;
        while (temp.next != null) {
            System.out.printf("%s->", temp.value);
            temp = temp.next;
        }
        System.out.printf("%s->null \n", temp.value);

    }

    public void deleteHead() {
        if (head != null) {
            head = head.next;
        }
    }

    void deleteTail() {
        Node2 temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void sum() {
        Node2 temp = head;
        int sum = 0;

        while (temp.next != null) {
            sum += temp.value;
            temp = temp.next;
        }

        sum += temp.value;
        System.out.println(sum);
    }

    int getMax() {
        Node2 temp = head;
        int max = head.value;
        while (temp.next != null) {
            if (temp.value > max) {
                max = temp.value;
            }
            temp = temp.next;
        }
        if (temp.value > max) {
            max = temp.value;
        }
        return max;
    }

    void search(int v) {
        Node2 temp = head;
        int node = 0;
        while (temp.next != null) {
            if (temp.value == v) {
                System.out.println(node);
                return;
            }
            node++;
            temp = temp.next;
        }
        if (temp.value == v) {
            System.out.println(node);
            return;
        }
        System.out.println("data tidak ditemukan");
    }
}
