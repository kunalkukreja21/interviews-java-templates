package org.kunalkukreja;

import java.util.AbstractMap;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Deque<Map.Entry<Integer, Integer>> dq = new LinkedList<>();
        dq.add(new AbstractMap.SimpleEntry<>(3, 3));
    }
}
