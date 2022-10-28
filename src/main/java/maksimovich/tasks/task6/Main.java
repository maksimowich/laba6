package maksimovich.tasks.task6;

import java.util.ArrayList;

public class Main {

    public static <E> void merge1(ArrayList<? extends E> from, ArrayList<E> to) {
        to.addAll(from);
    }

    public static <E> void merge2(ArrayList<? extends E> from, ArrayList<? super E> to) {
        to.addAll(from);
    }

    public static <E> void merge3(ArrayList<E> from, ArrayList<? super E> to) {
        to.addAll(from);
    }

}
