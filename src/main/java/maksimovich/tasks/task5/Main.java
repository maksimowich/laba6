package maksimovich.tasks.task5;

public class Main {

    public static <T> T[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }

    public static void main(String[] args) {
        Double[] result = (Double[]) Main.swap(0, 1, 1.5, 2, 3);
        Double[] result2 = Main.<Double>swap(0, 1, 1.5, 2d, 3d);
    }
}
