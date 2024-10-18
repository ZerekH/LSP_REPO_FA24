package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

public class MapUtilities {

    /**
     * This method finds the number of common key/value pairs between two HashMaps.
     *
     * @param map1 The first HashMap containing key-value pairs.
     * @param map2 The second HashMap containing key-value pairs.
     * @return The number of common entries between the two HashMaps.
     */
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        
        int commonCount = 0;

        // Iterate over the first map's keys and check for common key-value pairs
        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonCount++;
            }
        }

        return commonCount;
    }
}
