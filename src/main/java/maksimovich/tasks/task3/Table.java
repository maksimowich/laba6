package maksimovich.tasks.task3;

import java.util.ArrayList;

public class Table<K, V> {

    private final ArrayList<Entry<K, V>> items;

    public Table() {
        items = new ArrayList<>();
    }

    public V getValue(K key) {
        for (Entry<K, V> item : items) {
            if (item.getKey().equals(key)) {
                return item.getValue();
            }
        }
        return null;
    }

    public void removeForKey(K key) {
        items.removeIf(item -> item.getKey().equals(key));
    }

    public void addValue(K key, V value) {
        removeForKey(key);
        items.add(new Entry<>(key, value));
    }

}
