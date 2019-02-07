package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue
{

    public static void main(String[] args)
    {
        SimpleQueue queue = new SimpleQueue();
        queue.run();
    }

    public void run()
    {
        Queue <String> myQueue = new LinkedList <>();
        myQueue.add("One");
        myQueue.add("Two");
        myQueue.add("Three");
        myQueue.add("Four");
        myQueue.add("Five");

        System.out.println(myQueue);

        /*
        //removes 1
        String remove1 = myQueue.remove();
        System.out.println(remove1);
        System.out.println(myQueue);
        //removes 2
        String remove2 = myQueue.remove();
        System.out.println(remove2);
        System.out.println(myQueue);
        //removes 3
        String remove3 = myQueue.remove();
        System.out.println(remove3);
        System.out.println(myQueue);
        //removes 4
        String remove4 = myQueue.remove();
        System.out.println(remove4);
        System.out.println(myQueue);
        //removes 5
        String remove5 = myQueue.remove();
        System.out.println(remove5);
        System.out.println(myQueue);
        //nothing left to remove.
        String removeError = myQueue.remove();
        System.out.println(removeError);
        System.out.println(myQueue);
        */

        /*
        //removes 1
        String remove1 = myQueue.poll();
        System.out.println(remove1);
        System.out.println(myQueue);
        //removes 2
        String remove2 = myQueue.poll();
        System.out.println(remove2);
        System.out.println(myQueue);
        //removes 3
        String remove3 = myQueue.poll();
        System.out.println(remove3);
        System.out.println(myQueue);
        //removes 4
        String remove4 = myQueue.poll();
        System.out.println(remove4);
        System.out.println(myQueue);
        //removes 5
        String remove5 = myQueue.poll();
        System.out.println(remove5);
        System.out.println(myQueue);
        //prints out null, instead of giving you a exception error.
        String removeNull = myQueue.poll();
        System.out.println(removeNull);
        System.out.println(myQueue);
        */

        //Peek doesn't do anything but display whats in the front of the queue.
        //peeks 1
        String remove1 = myQueue.peek();
        System.out.println(remove1);
        System.out.println(myQueue);
        //peeks 1
        String remove2 = myQueue.peek();
        System.out.println(remove2);
        System.out.println(myQueue);
        //peeks 1
        String remove3 = myQueue.peek();
        System.out.println(remove3);
        System.out.println(myQueue);
        //peeks 1
        String remove4 = myQueue.peek();
        System.out.println(remove4);
        System.out.println(myQueue);
        //peeks 1
        String remove5 = myQueue.peek();
        System.out.println(remove5);
        System.out.println(myQueue);
        //peeks 1
        String removeError = myQueue.peek();
        System.out.println(removeError);
        System.out.println(myQueue);

    }
}
