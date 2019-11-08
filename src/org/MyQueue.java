package org;

import java.util.NoSuchElementException;

public class MyQueue<E> implements Interface_Queue<E> {

    private Element first;
    private Element last;
    private int count;

    public MyQueue() {
        first = last = null;
        count = 0;
    }

    @Override
    public void enter(E element) {
        if(count == 0) {
            //insert first element
            first = new Element();
            last = first;
            count = 1;
        } else {
            // insert element into non-empty queue
            last.next = new Element();
            last = last.next;
            count++;
        }
        last.elm = element;
        last.next = null;
    }

    @Override
    public E leave() throws NoSuchElementException {
        if(count <= 0){
            throw new NoSuchElementException();
        }
        Element ret = first;
        --count;
        first = first.next;
        if(first == null){
            last = null;
            count = 0;
        }
        return ret.elm;
    }

    @Override
    public boolean isEmpty() {
        if(count == 0){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void clear() {
        while(first != null){
            Element tmp = first;
            first = first.next;
            tmp.next = null;
        }
        first = last = null;
        count = 0;
    }

    public void printQueue(){
        Element tmp = first;
        for(int i = 0; i < count; i++){
            System.out.println(tmp.elm);
            tmp = tmp.next;
        }
    }

    class Element {
        public E elm;
        public Element next;
    }
}
