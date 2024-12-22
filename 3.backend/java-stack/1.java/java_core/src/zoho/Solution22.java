package zoho;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution22 {
    private final int capacity;
    private final LinkedHashMap<Integer, Integer> cache;

    public Solution22(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        if (cache.size() >= capacity && !cache.containsKey(key)) {
            cache.remove(cache.keySet().iterator().next());
        }
        cache.put(key, value);
    }

    public static void main(String[] args) {
        Solution22 lru = new Solution22(2);
        lru.put(1, 1);
        lru.put(2, 2);
        System.out.println(lru.get(1)); // Output: 1
        lru.put(3, 3); // Removes key 2
        System.out.println(lru.get(2)); // Output: -1
    }
}