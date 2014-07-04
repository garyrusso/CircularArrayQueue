package Queues;

public class CircularArrayQueue implements Queue
{
    private static final int capacity = 5;
    private Object[] Q;
    private final int N; // capacity
    
    private int front = 0;
    private int rear  = 0;
 
    public CircularArrayQueue()
    {
        this(capacity);
    }

    public CircularArrayQueue(int capacity)
    {
        N = capacity;
        Q = new Object[N];
    }

    public int size()
    {
        if(rear > front)
            return rear - front;
        
        return N - front + rear;
    }

	public boolean isEmpty()
	{
        return (rear == front) ? true : false;
	}

	public boolean isFull()
	{
        int diff = rear - front;
        
        if(diff == -1 || diff == (N -1))
            return true;
        
        return false;
	}

	public void enqueue(Object obj) throws QueueFullException
	{
        if(isFull())
        {
            throw new QueueFullException("Queue is Full.");
        }
        else
        {
            Q[rear] = obj;
            rear = (rear + 1) % N;
        }
	}

	public Object dequeue() throws QueueEmptyException
	{
        Object item;
        
        if(isEmpty())
        {
            throw new QueueEmptyException("Queue is Empty.");
        }
        else
        {
            item = Q[front];
            Q[front] = null;
            
            front = (front + 1) % N;
        }
        
       return item;
	}
}

