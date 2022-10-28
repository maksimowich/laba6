package maksimovich.tasks.task19;

import java.util.ArrayList;

public class Main {

    public static <T> T[] repeat(int n, T obj) {
        ArrayList<T> result = new ArrayList<>(); // OK
        for (int i = 0; i < n; i++) result.add(obj);
        return (T[]) result.toArray();
    }

    public static void main(String[] args) {
        Integer[] ar = Main.<Integer>repeat(10, 23);
    }
}
