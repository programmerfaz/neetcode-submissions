class Solution {
    public boolean isAnagram(String s, String t) {
       //first fill the map1 with s string and count of each character
       if (s.length() != t.length()){
        return false;
       }
       HashMap <Character, Integer> map1 = new HashMap<> ();
       for (int i = 0; i< s.length(); i++){
        map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
       }
       for (int j = 0; j<t.length(); j++){
        if (map1.getOrDefault(t.charAt(j),0) <= 0){
            System.out.println(map1.get(j));
            return false;
        }
        map1.put(t.charAt(j),map1.get(t.charAt(j))-1);
       }
       return true;
    }
}
