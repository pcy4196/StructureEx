package com.example.structure;

import com.example.util.PcyQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Ch02Queue {

    // 큐 구조
    // 줄을 서는 행위와 유사
    // 가장 먼저 넣은 데이터를 가장 먼저 꺼낼 수 있는 구조
    // - 음식점에서 가장 먼저 줄을 선 사람이 제일 먼저 음식점에 입장하는 것과 동일
    // - FIFO(First-In, First-Out) 또는 LILO(Last-In, Last-Out) 방식으로 스택과 꺼내는 순서가 반대
    public static void main(String[] args) {

        // Enqueue: 큐에 데이터를 넣는 기능
        // Dequeue: 큐에서 데이터를 꺼내는 기능

        // JAVA 에서는 기본적으로 java.util 패키지에 Queue 클래스를 제공
        // - Enqueue 에 해당하는 기능으로 Queue 클래스에서는 add(value) 또는 offer(value) 메서드를 제공함
        // - Dequeue 에 해당하는 기능으로 Queue 클래스에서는 poll() 또는 remove() 메서드를 제공함
        // java.util 패키지에 있는 LinkedList 클래스를 사용
        // 자료형 매개변수를 넣어서, 큐에 들어갈 데이터의 타입을 지정해야 함
        Queue<Integer> queueInt = new LinkedList<Integer>(); // Integer 형 queue 선언
        Queue<String> queueStr = new LinkedList<String>(); // String 형 queue 선언

        // 데이터 추가는 add(value) 또는 offer(value) 를 사용함
        queueInt.add(1);
        queueInt.offer(2);
        // 출력에 true 라고 출력되는 부분은 offer() 메서드가 리턴한 값으로,
        // 셀의 맨 마지막에 함수를 넣을 경우, 변수가 변수값이 출력되는 것처럼 함수는 함수 리턴값이 출력되는 것임

        // Queue 인스턴스를 출력하면, 해당 큐에 들어 있는 아이템 리스트가 출력됨
        System.out.println(queueInt);

        // poll() 은 큐의 첫 번째 값 반환, 해당 값은 큐에서 삭제
        queueInt.poll();
        System.out.println(queueInt);

        // poll() 과 마찬가지로, 첫 번째 값 반환하고, 해당 값은 큐에서 삭제
        queueInt.remove();
        System.out.println(queueInt);

        /*
        [연습해보기]
        - JAVA ArrayList 클래스를 활용해서 큐를 다루는 enqueue, dequeue 기능 구현해보기
        - dequeue 기능 호출 시, 큐에 데이터가 없을 경우, null 을 리턴하도록 함
        - 다양한 데이터 타입을 다룰 수 있도록, Java Genric 타입 문법을 활용해보기
        */
        PcyQueue<String> pq = new PcyQueue<String>();
        pq.main(new String[0]);
    }
}
