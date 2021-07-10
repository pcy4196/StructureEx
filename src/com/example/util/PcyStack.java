package com.example.util;

import java.util.ArrayList;

public class PcyStack<T> {
    private final ArrayList<T> stack = new ArrayList<>();

    // enqueue 구현
    public void push(T t) {
        stack.add(t);
    }

    // dequeue 구현
    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        // queue 와는 다르게 스택은 뒤에서부터 제거 필요
        return stack.remove(stack.size() - 1);
    }

    public static void main(String[] args) {
        PcyStack<String> ps = new PcyStack<String>();
        ps.push("1");
        ps.push("2");
        ps.push("3");
        ArrayList<String> stackList = ps.stack;
        stackList.stream().forEach(i -> System.out.println("ps["+i+"] : " + i));

        ps.pop();
        stackList.stream().forEach(i -> System.out.println("ps["+i+"] : " + i));
    }
}
