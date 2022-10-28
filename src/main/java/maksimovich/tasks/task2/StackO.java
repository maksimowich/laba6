package maksimovich.tasks.task2;

import java.util.Arrays;

public class StackO {

    private Object[] elements;
    private int capacity;
    private int numberOfElements;


    public StackO() {
        capacity = 10;
        elements = new Object[10];
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public void push(Object element) {
        if (numberOfElements == capacity) {
            capacity += 10;
            elements = Arrays.copyOf(elements, capacity);
        }
        elements[numberOfElements] = element;
        numberOfElements++;
    }

    public Object pop() {
        if (!isEmpty()) {
            Object elementToReturn = elements[numberOfElements - 1];
            elements[numberOfElements - 1] = null;
            numberOfElements--;
            return elementToReturn;
        }
        return null;
    }

    public static void main(String[] args) {
        StackO st = new StackO();
        System.out.println(st.pop());
        st.push(12);
        st.push(13);
        st.push(14);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
