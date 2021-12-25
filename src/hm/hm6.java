package hm;

import java.util.LinkedList;
import java.util.Queue;

public class hm6 {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        Queue<String> stringQueue = new LinkedList<>();

        System.out.println(writeInStack(10, stringStack));
        System.out.println(writeInLinkedList(10, stringQueue));

        System.out.println(show(stringStack, stringQueue));
    }

    public static String writeInStack(Integer size, Stack<String> stringStack) {
        for (int i = 0; i < size; i++) {
            stringStack.push(String.valueOf(i));
        }
        return "Стек = " + stringStack.size();
    }

    public static String writeInLinkedList(Integer size, Queue<String> stringQueue) {
        for (int i = 0; i < size; i++) {
            stringQueue.offer(String.valueOf(i));
        }
        return "Очередь = " + stringQueue.size();
    }

    public static String show(Stack<String> stringStack, Queue<String> stringQueue) {
        String s = "Stack: ";

        while (stringQueue.size() != 0) {
            s += stringQueue.poll() + " ";
        }
        s += "\nLinkedList: ";
        while (stringStack.size() != 0) ;
        {
            s += stringStack.pop() + "";

            return s;
        }

    }
}


