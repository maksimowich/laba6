package maksimovich.tasks.task2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack<E> {

    private E[] elements;
    private int capacity;
    private int numberOfElements;


    public Stack(Class<E> clazz) {
        capacity = 10;
        elements = (E[]) Array.newInstance(clazz, capacity);
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public void push(E element) {
        if (numberOfElements == capacity) {
            capacity += 10;
            elements = Arrays.copyOf(elements, capacity);
        }
        elements[numberOfElements] = element;
        numberOfElements++;
    }

    public E pop() {
        if (!isEmpty()) {
            E elementToReturn = elements[numberOfElements - 1];
            elements[numberOfElements - 1] = null;
            numberOfElements--;
            return elementToReturn;
        }
        return null;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(Integer.class);
        System.out.println(st.pop());
        st.push(12);
        st.push(13);
        st.push(14);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
