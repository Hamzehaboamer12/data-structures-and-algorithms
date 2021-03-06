package stackandqueue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    private Queue<Integer> queue;
    private stack<Integer> stack;
    private PseudoQueue<Integer> pq;





    @Test void testStackPush() {
        stack = new stack<Integer>();
        stack.push(5);
        assertEquals("Top -> {5} -> Null", stack.toString());
        assertEquals(1, stack.getSize());
        stack.push(6);
        stack.push(7);
        stack.push(8);
        assertEquals("Top -> {8} -> {7} -> {6} -> {5} -> Null", stack.toString());
        assertEquals(4, stack.getSize());
    }

    @Test void testStackPop() {
        stack = new stack<Integer>();
        stack.push(5);
        stack.push(6);
        stack.push(7);

        assertEquals(7, stack.pop());
        assertEquals(2, stack.getSize());


        assertEquals(6, stack.pop());
        assertEquals(1, stack.getSize());

        assertEquals(5, stack.pop());
        assertEquals(0, stack.getSize());
    }

    @Test void testStackPeek() throws Exception {
        stack = new stack<Integer>();
        stack.push(5);
        stack.push(6);
        assertEquals(6, stack.peek());
    }


    @Test void testQueueEnqueue() {
        queue = new Queue<>();
        queue.enqueue(1);
        assertEquals("Front <- {1} back -> Null", queue.toString());
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals("Front <- {1} <- {2} <- {3} back -> Null", queue.toString());

    }

    @Test void testQueueDequeue() throws Exception {
        queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.dequeue());
        queue.enqueue(3);
        assertEquals("Front <- {2} <- {3} back -> Null", queue.toString());
    }

    @Test void testQueuePeek() throws Exception {
        queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.peek());

        // isEmpty Test
        assertEquals(false, queue.isEmpty());
        queue.dequeue();
        queue.dequeue();
        assertEquals(true, queue.isEmpty());
    }
    @Test void testEnqueue(){
        pq = new PseudoQueue<Integer>();
        pq.enqueue(1);
        pq.enqueue(2);
        pq.enqueue(3);
        assertEquals("Top -> {1} -> {2} -> {3} -> Null", pq.toString());

    }

    @Test void testDequeue(){
        pq = new PseudoQueue<Integer>();
        pq.enqueue(1);
        pq.enqueue(2);
        pq.enqueue(3);
        pq.dequeue();
//        System.out.println(pq.toString());
        assertEquals("Top -> {2} -> {3} -> Null", pq.toString());
        pq.dequeue();
        pq.dequeue();
        assertEquals("Your List Is Empty", pq.toString());
    }
}
