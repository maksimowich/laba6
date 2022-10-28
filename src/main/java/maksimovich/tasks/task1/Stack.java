package maksimovich.tasks.task1;

import java.util.ArrayList;

public class Stack<E> {

    private final ArrayList<E> elements;

    public Stack() {
        elements = new ArrayList<>();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void push(E element) {
        elements.add(element);
    }

    public E pop() {
        if (!isEmpty()) {
            return elements.remove(elements.size() - 1);
        }
        return null;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.pop());
        st.push(12);
        st.push(13);
        st.push(14);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
