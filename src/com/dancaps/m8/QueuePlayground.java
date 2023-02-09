package com.dancaps.m8;

import java.util.*;

public class QueuePlayground {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Queued LL: " + q);
        q.remove();
        System.out.println("Queued LL: " + q);
        System.out.println("Queued LL: " + q.element());
        System.out.println("Queued LL: " + q.offer(4));
        System.out.println("Queued LL: " + q.peek());
        System.out.println("Queued LL: " + q);
        q.remove();
        System.out.println("Queued LL: " + q);
        System.out.println("Queued LL: " + q.size());

        Queue<Character> c = new PriorityQueue<>();
        c.add('a');
        c.add('z');
        System.out.println("Queued PQ: " + c);
        c.add('h');
        System.out.println("Queued PQ: " + c);
        c.remove();
        System.out.println("Queued PQ: " + c);
        c.remove();
        System.out.println("Queued PQ: " + c);
        c.add('b');
        c.add('R');
        c.add('k');
        System.out.println("Queued PQ: " + c);

        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            System.out.println("While iterator loop: " + iterator.next());
        }

        for (char i:
                c) {
            System.out.println("For Each Loop: " + i);
        }

    }
}
