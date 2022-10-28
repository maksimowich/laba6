package maksimovich.tasks.task14;

import java.util.ArrayList;

public class Main {

    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems)
            throws Exception {
        Exception exceptionToThrow = null;
        Exception exceptionHelper = null;
        for (T elem : elems) {
            try {
                elem.close();
            } catch (Exception e) {
                if (exceptionToThrow == null) {
                    exceptionToThrow = e;
                    exceptionHelper = e;
                } else {
                    exceptionHelper.initCause(e);
                    exceptionHelper = e;
                }
            }
        }
        if (exceptionToThrow != null) {
            throw exceptionToThrow;
        }
    }

    public static void main(String[] args) throws Exception {
        ArrayList<AutoCloseable> ar = new ArrayList<>();
        ar.add(new AutoCloseable1());
        ar.add(new AutoCloseable2());
        ar.add(new AutoCloseable3());
        closeAll(ar);
    }
}
