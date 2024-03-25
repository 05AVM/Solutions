class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm =new HashMap<>();
        List<Integer>ls=new ArrayList<>();
         for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        //use the map.entry interface..
        
    for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > 1) {
                ls.add(entry.getKey());
            }
        }
        return ls;
    }
}