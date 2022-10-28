package maksimovich.tasks.task3;

import java.util.ArrayList;

public class Table2<K, V> {

    public class Entry {

        private final K key;
        private final V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() { return key; }

        public V getValue() { return value; }
    }

    private final ArrayList<Entry> items;

    public Table2() {
        items = new ArrayList<>();
    }

    public V getValue(K key) {
        for (Entry item : items) {
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
        items.add(new Entry(key, value));
    }
}
