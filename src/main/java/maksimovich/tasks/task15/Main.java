package maksimovich.tasks.task15;

import java.util.ArrayList;
import java.util.function.Function;

public class Main {
    public static <T, R> ArrayList<R> map(ArrayList<T> source, Function<? super T, ? extends R> func) {
        ArrayList<R> result = new ArrayList<>();
        for (T item : source) {
            result.add(func.apply(item));
        }
        return result;
    }
}
