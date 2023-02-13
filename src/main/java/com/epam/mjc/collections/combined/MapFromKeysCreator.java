package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> data = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            int key = entry.getKey().length();
            int stringLength = entry.getKey().length();
            Set<String> values;
            if (data.containsKey(stringLength)) {
                values = data.get(stringLength);
            } else {
                values = new HashSet<>();
            }
            values.add(entry.getKey());
            data.put(stringLength, values);
        }
        return data;
    }
}
