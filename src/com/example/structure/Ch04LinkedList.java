package com.example.structure;

import com.example.util.DoubleLinkedList;
import com.example.util.SingleLinkedList;

public class Ch04LinkedList {

    // 1. 링크드 리스트 (Linked List) 구조
    // 연결 리스트라고도 함
    // 배열은 순차적으로 연결된 공간에 데이터를 나열하는 데이터 구조
    // 링크드 리스트는 떨어진 곳에 존재하는 데이터를 화살표로 연결해서 관리하는 데이터 구조

    // 링크드 리스트 기본 구조와 용어
    //  - 노드(Node): 데이터 저장 단위 (데이터값, 포인터) 로 구성
    //  - 포인터 (pointer): 각 노드 안에서, 다음이나 이전의 노드와의 연결 정보를 가지고 있는 공간

    // 링크드 리스트의 장단점 (전통적인 C언어에서의 배열과 링크드 리스트)
    // - 장점
    // 미리 데이터 공간을 미리 할당하지 않아도 됨
    // 배열은 미리 데이터 공간을 할당 해야 함
    // - 단점
    // 연결을 위한 별도 데이터 공간이 필요하므로, 저장공간 효율이 높지 않음
    // 연결 정보를 찾는 시간이 필요하므로 접근 속도가 느림
    // 중간 데이터 삭제시, 앞뒤 데이터의 연결을 재구성해야 하는 부가적인 작업 필요
    public static void main(String[] args) {
        // 1. 링크드 리스트 선언 및 print
        SingleLinkedList<String> pcyLinkedList = new SingleLinkedList<String>();
        pcyLinkedList.addNode("1");
        pcyLinkedList.addNode("2");
        pcyLinkedList.addNode("3");
        pcyLinkedList.printAll();

        // 2. 링크드 리스트 선언 및 print, 중간에 선언
        SingleLinkedList<String> pcyLinkedList1 = new SingleLinkedList<String>();
        pcyLinkedList1.addNode("1");
        pcyLinkedList1.addNode("2");
        pcyLinkedList1.addNode("3");

        pcyLinkedList1.printAll();
        System.out.println("-------------------------------------");

        pcyLinkedList1.addNodeInside("5", "1");
        pcyLinkedList1.printAll();
        System.out.println("-------------------------------------");

        pcyLinkedList1.addNodeInside("7", "20");
        pcyLinkedList1.printAll();
        System.out.println("-------------------------------------");

        // 2. 링크드 리스트 선언 및 print, 삭제
        SingleLinkedList<Integer> pcyLinkedList2 = new SingleLinkedList<Integer>();
        pcyLinkedList2.addNode(1);
        pcyLinkedList2.addNode(2);
        pcyLinkedList2.addNode(3);

        pcyLinkedList2.printAll();
        System.out.println("-------------------------------------");

        System.out.println(pcyLinkedList2.delNode(1));
        pcyLinkedList2.printAll();
        System.out.println("-------------------------------------");

        // 다양한 링크드 리스트 구조: 더블 링크드 리스트(Doubly linked list)
        // 더블 링크드 리스트(Doubly linked list) 기본 구조
        // - 이중 연결 리스트라고도 함
        // - 장점: 양방향으로 연결되어 있어서 노드 탐색이 양쪽으로 모두 가능
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();
        doubleLinkedList.addNode(2);
        doubleLinkedList.addNode(3);
        doubleLinkedList.addNode(4);
        doubleLinkedList.addNode(5);
        doubleLinkedList.addNode(6);
        doubleLinkedList.printAll();

        System.out.println("-------------------------------------");
        System.out.println("searchFromHead : " + doubleLinkedList.searchFromHead(2));
        System.out.println("searchFromTail : " + doubleLinkedList.searchFromTail(3));
        System.out.println("searchFromHead : " + doubleLinkedList.searchFromHead(7));

        // - 데이터를 임의 노드 앞에 노드를 추가하는 메서드 추가하기
        System.out.println("-------------------------------------");
        doubleLinkedList.insertToFront(3, 1);
        doubleLinkedList.printAll();

        System.out.println("-------------------------------------");
        doubleLinkedList.insertToFront(4, 0);
        doubleLinkedList.printAll();

        System.out.println("-------------------------------------");
        doubleLinkedList.addNode(8);
        doubleLinkedList.printAll();
    }

}
