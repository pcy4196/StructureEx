package com.example.util;

import java.util.ArrayList;

public class PcyQueue<T> {
    private final ArrayList<T> queue = new ArrayList<>();

    // enqueue 구현
    public void enqueue(T t) {
        queue.add(t);
    }

    // dequeue 구현
    public T dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    public static void main(String[] args) {
        PcyQueue<String> pq = new PcyQueue<String>();
        pq.enqueue("1");
        pq.enqueue("2");
        pq.enqueue("3");
        System.out.println("pq -- 1 : " + pq.dequeue());
        System.out.println("pq -- 2 : " + pq.dequeue());
        System.out.println("pq -- 3 : " + pq.dequeue());
    }
}
