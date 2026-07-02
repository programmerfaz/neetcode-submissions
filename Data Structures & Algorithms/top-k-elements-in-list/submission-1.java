class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        //store the frequency count for each key/elmenet
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        //now sort the keys in the hashmap based on their frequency count
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((a,b) -> map.get(b) - map.get(a)); //very immportant ass .sort() requires a comparator which is either null or your own labda defined judge/function

        for (int j = 0; j < k; j++){
            ans.add(keys.get(j));
        }

        //convert the keys back to array
        int[] answer = new int[k];
        for (int j = 0; j<k; j++){
            answer[j] = ans.get(j);
        }
        return answer;
    }
}
