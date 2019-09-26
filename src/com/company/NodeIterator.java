package com.company;

import java.util.Iterator;
import java.util.Stack;

public class NodeIterator implements Iterator {
    private Stack<Node> stack = new Stack<>();
    private Node current;
    int index;

    public NodeIterator(Node node){
        if (current == null) {
            current = node;
        }
    }

    @Override
    public boolean hasNext() {
        return (current != null || !stack.isEmpty());    }

    @Override
    public Object next() {
        while (current != null) {
            stack.push(current);
            current = current.leftChild;
        }
        current = stack.pop();
        Node node = current;
        current = current.rightChild;

        return node.iData;
    }
}
