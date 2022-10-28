package maksimovich.tasks.task20;

import java.lang.reflect.Array;

public class Main {
    @SafeVarargs public static final <T> T[] repeat(int n, T... objs) {
        @SuppressWarnings("unchecked")
        T[] res = (T[]) Array.newInstance(objs.getClass().getComponentType(), n * objs.length);

        for (int i = 0; i < objs.length; i++) {
            System.arraycopy(objs, 0, res, i * objs.length, objs.length);
        }

        return res;
    }
}
