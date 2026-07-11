class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count = 0;
        // HashMap <Integer, ArrayList<Integer>> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++){
        //     //first step create a new Array list as store it in hashmap
        //     map.put(i, new ArrayList<>());
        //     //insert into the arrayList
        //     for (int t: map.keySet()){
        //         map.get(t).add(nums[i]);
        //     }
        //     //traverse through all the values of each key and check if its sum equal to k
        //     for (int j: map.keySet()){
        //         ArrayList<Integer> list = map.get(j);
        //         int sum = 0;
        //         for (int elem: list){
        //             sum+=elem;
        //         }
        //         if (sum == k) count++;
        //     }
        // }
        // return count;
        int count = 0;
        int prefix_sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(prefix_sum, 1);
        for (int i = 0; i<nums.length; i++){
            prefix_sum += nums[i];
            if (map.containsKey(prefix_sum-k)){
                count+= map.get(prefix_sum-k);
            }
            map.put(prefix_sum, map.getOrDefault(prefix_sum, 0) + 1);
        }
        return count;
    }
}