package org;

public class Main {

    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();

        // insert elements
        queue.enter("Element 1");
        queue.enter("Element 2");
        queue.enter("Element 3");
        queue.enter("Element 4");

        // output number of elements
        System.out.println("The Queue contains " + queue.size() + " elements");

        // remove the first element
        queue.leave();

        // print elements in queue
        queue.printQueue();

        // clear queue
        queue.clear();

        if(queue.isEmpty()){
            System.out.println("Queue is empty");
        }
    }
}
