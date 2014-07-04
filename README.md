Algorithms - Circular Array Queue
=================================

Circular Queue implementation that uses an Array.

It is written for Java 1.7.

Notes about this Circular Queue implementation:

- It is a first in first out (FIFO) fixed size buffer.
- Creates the illusion that it’s connected end-to-end.
- Each item on the queue is given a position number.
- Implementation uses two pointers, a front pointer and a rear pointer.
- Front pointer points to first element which is the head position.
- Dequeue (delete) operation increments the front pointer.
- Rear pointer points to the last element (rear position).
- Enqueue (insert) operation decrements the rear pointer.
- Constructor initializes the buffer size and sets the rear and front pointers to zero.
- Size of the queue is the difference between the rear position and the front position.


Circular Queue Implementation consists of the following methods:

- public int size();
- public boolean isEmpty();
- public boolean isFull();
- public void enqueue(Object obj);
- public Object dequeue();

