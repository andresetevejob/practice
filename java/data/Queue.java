package com.willfaught.data;

public interface Queue<E> : Collection<E>
{
    void enqueue(E element);
    E dequeue();
}