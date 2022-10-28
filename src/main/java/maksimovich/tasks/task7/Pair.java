package maksimovich.tasks.task7;

public class Pair<E extends Comparable<? super E>> {

    private final E first;
    private final E second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public E min() {
        if (first == null) {
            return second;
        } else if (second == null) {
            return first;
        } else if (first.compareTo(second) > 0) {
            return second;
        }
        return first;
    }

    public E max() {
        if (first == null) {
            return second;
        } else if (second == null) {
            return first;
        } else if (first.compareTo(second) < 0) {
            return second;
        }
        return first;
    }

    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(1, 2);
        System.out.println(pair.min());
        System.out.println(pair.max());
    }
}
