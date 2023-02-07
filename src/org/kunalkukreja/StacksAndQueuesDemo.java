package org.kunalkukreja;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StacksAndQueuesDemo {
    public static void main(String[] args) {
        // Create a stack.
        Stack<Integer> stack = new Stack<>();
        // Push elements into the stack.
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Remove from stack
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // Remove from stack and add it to a queue.
        Queue<Integer> queue = new LinkedList<>();
        queue.add(stack.pop());

        // Create deque.
        Deque<Integer> deque = new LinkedList<>();
        // Add elements to deque.
        deque.addLast(3);
        deque.addFirst(2);
        System.out.println(deque.removeFirst());
    }
}
