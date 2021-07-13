package com.example.util;

public class SingleLinkedList<T> {
    public Node<T> head = null;

    public class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    // 링크드리스트 중간에 추가
    public void addNodeInside(T data, T preData) {
        Node<T> searchedNode = this.search(preData);

        if(searchedNode == null) {
            this.addNode(data);
        } else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<T>(data);
            searchedNode.next.next = nextNode;
        }
    }

    public Node<T> search(T preData) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == preData) {
                    return node;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    public boolean delNode(T data) {
        if (this.head == null) {
            return false;
        } else {
            Node<T> node = this.head;
            if (node.data == data) {
                this.head = this.head.next;
                return true;
            } else {
                while (node.next != null) {
                    if (node.next.data == data) {
                        node.next = node.next.next;
                        return true;
                    } else {
                        node = node.next;
                    }
                }
                return false;
            }
        }
    }
}

