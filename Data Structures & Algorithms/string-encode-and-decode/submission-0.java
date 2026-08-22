class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

public List<String> decode(String s) {
    List<String> result = new ArrayList<>();
    int i = 0;
    
    while (i < s.length()) {
        // Step 1: Find the position of '#' to locate the length
        int j = i;
        while (s.charAt(j) != '#') {
            j++;
        }
        
        // Step 2: Extract the length (substring from i to j)
        int length = Integer.parseInt(s.substring(i, j));
        
        // Step 3: Extract the actual string (length characters after '#')
        String str = s.substring(j + 1, j + 1 + length);
        result.add(str);
        
        // Step 4: Move i to the start of the next length prefix
        i = j + 1 + length;
    }
    
    return result;
    }
}
