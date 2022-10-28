package maksimovich.tasks.task18;

import java.util.function.IntFunction;

public class Main {
    public static <T> T[] repeat(int n, T obj, IntFunction<T[]> constr) {
        T[] result = constr.apply(n);
        for (int i = 0; i < n; i++) result[i] = obj;
        return result;
    }

    public static void main(String[] args) {
        Main.<Integer>repeat(10, 42, Integer[]::new);
    }
}
