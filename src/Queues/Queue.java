package Queues;

public interface Queue
{
    // returns size of the queue
    public int size();
     
    public boolean isEmpty();
     
    public boolean isFull();
     
    // inserts item into the queue 
    public void enqueue(Object obj) throws QueueFullException;
     
    // removes item from the queue 
    public Object dequeue() throws QueueEmptyException; 
 
}
