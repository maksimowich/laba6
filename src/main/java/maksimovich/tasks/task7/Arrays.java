package maksimovich.tasks.task7;

import java.util.ArrayList;

public class Arrays {
    public static <E extends Comparable<? super E>> Pair<E> firstLast(ArrayList<? extends E> a) {
        E first;
        E second;
        try {
            first = a.get(0);
        } catch (IndexOutOfBoundsException e) {
            return new Pair<>(null, null);
        }
        try {
            second = a.get(a.size() - 1);
        } catch (IndexOutOfBoundsException e) {
            return new Pair<>(first, null);
        }
        return new Pair<>(first, second);
    }

    public static <E extends Comparable<? super E>> E min(E[] a) {
        E minEl = null;
        for (int i = 0; i < a.length; i++) {
            if (i == 0 || minEl == null) {
                minEl = a[i];
            } else if (minEl.compareTo(a[i]) > 0) {
                minEl = a[i];
            }
        }
        return minEl;
    }

    public static <E extends Comparable<? super E>> E max(E[] a) {
        E maxEl = null;
        for (int i = 0; i < a.length; i++) {
            if (i == 0 || maxEl == null) {
                maxEl = a[i];
            } else if (maxEl.compareTo(a[i]) < 0) {
                maxEl = a[i];
            }
        }
        return maxEl;
    }

    public static <E extends Comparable<? super E>> Pair<E> minMax(E[] a) {
        return new Pair<>(min(a), max(a));
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        Pair<Integer> pair = firstLast(a);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        Integer[] ar = new Integer[] {1, 2, 3, 4343, -21, 33};
        System.out.println(min(ar));
        System.out.println(max(ar));
        System.out.println("minMax ----------------------------");
        Pair<Integer> mm = minMax(ar);
        System.out.println(mm.getFirst());
        System.out.println(mm.getSecond());
    }
}
