package maksimovich.tasks.task12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static <T> void minmax(List<T> elements, Comparator<? super T> comp, List<? super T> result) {
        T minEl = null;
        T maxEl = null;
        for (int i = 0; i < elements.size(); i++) {
            if (i == 0 || minEl == null) {
                minEl = elements.get(i);
            } else if (comp.compare(minEl, elements.get(i)) > 0) {
                minEl = elements.get(i);
            }
            if (i == 0 || maxEl == null) {
                maxEl = elements.get(i);
            } else if (comp.compare(maxEl, elements.get(i)) < 0) {
                maxEl = elements.get(i);
            }
        }
        result.add(minEl);
        result.add(maxEl);
    }

    private static <T> void swapHelper(List<T> elements, int i, int j) {
        T temp = elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, temp);
    }

    public static <T> void maxmin(List<T> elements,
                                  Comparator<? super T> comp, List<? super T> result) {
        minmax(elements, comp, result);
        swapHelper(result, result.size() - 2, result.size() - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(233);
        ar.add(2424);
        ar.add(-131);
        ar.add(2);
        ar.add(44444);
        List<Object> lo = new ArrayList<>();
        minmax(ar, Integer::compareTo, lo);
        for (Object ob : lo) {
            System.out.println(ob);
        }
        maxmin(ar, Integer::compareTo, lo);
        for (Object ob : lo) {
            System.out.println(ob);
        }
    }
}
