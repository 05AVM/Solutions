class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> hs=new HashMap<>();
        int foundKey=0;
        for(int i=0;i<nums.length;i++)
        {
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }

            for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
                // Map.Entry is an interface which enables us to work with map entry and it also specifies the type of elements in it and is type of Map.Entry object which resembles the type of hashmap declared earlier
                // hs.entrySet() :- this retireves a Set contaned in the hashmap
                //Each Entry represnets the key-value pair..
                //entry: This is the loop variable that represents each entry               in the set during each iteration of the loop.
            if (entry.getValue() >=2) {
                foundKey = entry.getKey();
                break;
            }
            }
            return foundKey;

    }
}