class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Build the signature for this string
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            // Convert count array to a string key
            String key = Arrays.toString(count);
            
            // Add to the appropriate group
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        
        return new ArrayList<>(map.values());
    }
}