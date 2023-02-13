package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        List<String> data = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                data.add(entry.getKey());
            }
        }

        Collections.sort(data, new CustomSortMethod());

        return data;
    }
}

class CustomSortMethod implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return -1;
        } else if (o1.length() < o2.length()) {
            return 1;
        } else {
            int i = o1.compareTo(o2) * (-1);
            return i;
        }
    }
}
