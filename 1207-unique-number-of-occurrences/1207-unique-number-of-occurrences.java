class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hs =new HashMap<>();
        for (int num : arr) {
            hs.put(num, hs.getOrDefault(num, 0) + 1);
        }
           HashSet<Integer> uniqueOccurrences = new HashSet<>(hs.values());
        
        return uniqueOccurrences.size() == hs.size();
            
        
        
    }
}