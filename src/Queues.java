import java.util.*;

public class Queues {

    Queue<String> queue1 = new LinkedList<>();

    /// Sorts by priority
    Queue<Integer> queue2 = new PriorityQueue<>();

    /// can be used as lifo and fifo
    Deque<String> queue3 = new ArrayDeque<>();

    public void Exercicio() {

        ///  offer x add - when failing, offer returns null, add returns exception.

        queue1.offer("Joao");
        queue1.offer("Maria");

        System.out.println(queue1);

        System.out.println(queue1.peek());

        /// poll x remove, same when failing
        queue1.poll();

        System.out.println(queue1);

        System.out.println("working fine");

        queue2.offer(5);
        queue2.offer(3);
        queue2.offer(2);

        System.out.println(queue2);

        System.out.println(queue2.peek());

        /// poll x remove, same when failing
        queue2.poll();

        System.out.println(queue2);

        System.out.println("working fine");

        queue3.offer("Joao");
        queue3.offer("Maria");
        queue3.offer("Jose");

        System.out.println(queue3.peekFirst());
        System.out.println(queue3.peekLast());

        System.out.println(queue3);

        queue3.pollFirst();

        System.out.println(queue3);

        queue3.pollLast();

        System.out.println(queue3);


    }

}
