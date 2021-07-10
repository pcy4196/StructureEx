package com.example.structure;

import com.example.util.PcyStack;

import java.util.Stack;

public class Ch03Stack {

    // 스택 구조
    // 스택은 LIFO(Last In, Fisrt Out) 또는 FILO(First In, Last Out) 데이터 관리 방식을 따름

    // LIFO: 마지막에 넣은 데이터를 가장 먼저 추출하는 데이터 관리 정책
    // FILO: 처음에 넣은 데이터를 가장 마지막에 추출하는 데이터 관리 정책

    // 대표적인 스택의 활용
    //  - 컴퓨터 내부의 프로세스 구조의 함수 동작 방식 + [재귀용법]
    // 주요 기능
    //  - push(): 데이터를 스택에 넣기
    //  - pop(): 데이터를 스택에서 꺼내기
    public static void main(String[] args) {

        // 장점
        //  - 구조가 단순해서, 구현이 쉽다.
        //  - 데이터 저장/읽기 속도가 빠르다.
        // 단점 (일반적인 스택 구현시)
        //  - 데이터 최대 갯수를 미리 정해야 한다. ** 중요포인트
        //  - 저장 공간의 낭비가 발생할 수 있음
        //    미리 최대 갯수만큼 저장 공간을 확보해야 함
        // ** 보통 배열 구조를 활용해서 구현하는 것이 일반적임

        // 자료형 매개변수를 넣어서, 스택에 들어갈 데이터의 타입을 지정해야 함
        Stack<Integer> stackInt = new Stack<Integer>(); // Integer 형 스택 선언

        stackInt.push(1);     // Stack 에 1 추가
        stackInt.push(2);     // Stack 에 2 추가
        stackInt.push(3);     // Stack 에 3 추가 (출력에 나온 부분은 push() 성공시, 해당 아이템을 리턴해주기 때문임)

        System.out.println(stackInt);

        stackInt.pop();

        System.out.println(stackInt);

        /*
        연습해보기

            - JAVA ArrayList 클래스를 활용해서 스택을 다루는 push, pop 기능 구현해보기
            - pop 기능 호출 시, 스택에 데이터가 없을 경우, null 을 리턴하도록 함
            - 다양한 데이터 타입을 다룰 수 있도록, Java Genric 타입 문법을 활용해보기
        */
        PcyStack<String> pq = new PcyStack<String>();
        PcyStack.main(new String[]{"0"});
    }
}
