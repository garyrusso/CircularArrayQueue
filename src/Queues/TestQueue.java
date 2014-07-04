package Queues;

public class TestQueue
{
    public static void main(String[] args)
    {
    	int queueSize = 10;

        String numbers[] = new String[queueSize];
        
        for (int i = 0 ; i < numbers.length ; i++ )
        	numbers[i] = String.format("%02d", ((int)(Math.random()*100)));
    	
        Queue queue = new CircularArrayQueue(queueSize+1);
        
        // Fill the Circular Queue
        for (String number : numbers)
        	queue.enqueue(number);
        
        System.out.println("Queue Size: " + queue.size());
        
        String var = "";
        
        var = (String) queue.dequeue();
        
        System.out.println("Dequeue: " + var + " : new queue size: " + queue.size());
        
        queue.enqueue(var);
        System.out.println("Re-enqueue: " + var + " : new queue size: " + queue.size());
        
        // Clear the Circular Queue
        while (queue.size() > 1)
            System.out.println("Dequeue: " + queue.dequeue() + " : New queue Size: " + queue.size());

        System.out.println("Final Queue Size: " + queue.size());
    }
}

