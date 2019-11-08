package org;

public interface Interface_Queue<E> {

    public void enter(E elm);

    public E leave();

    public boolean isEmpty();

    public int size();

    public void clear();
}
