package maksimovich.tasks.task23;

import java.util.concurrent.Callable;

public class task23 {

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwAs(Throwable e) throws T {
        throw (T) e; // The cast is erased to (Throwable) e
    }

    public static <V> V doWork(Callable<V> c) {
        try {
            return c.call();
        } catch (Throwable ex) {
            task23.<RuntimeException>throwAs(ex);
            return null;
        }
    }
}
