package maksimovich.tasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class task21 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(task21.<List<String>>constructArr(10)));
        List<String>[] result = task21.<List<String>>constructArr(10);
        System.out.println(result.getClass());
        System.out.println(result.getClass().getComponentType().getComponentType());
    }

    @SafeVarargs
    @SuppressWarnings("unchecked")
    public static <T> T[] constructArr(int length, T... values) {
        return (T[]) Array.newInstance(values.getClass().getComponentType(), length);
    }
}
