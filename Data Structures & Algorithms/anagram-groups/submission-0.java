// Group Anagrams (medium)
//
// Goal: Given a list of strings, bucket them so that all words made of the exact
// same letters end up together. Each bucket is one sublist in the output.
//
// What counts as an anagram: two words are anagrams if one is a rearrangement of
// the other — same letters, same counts, different order. "act" and "cat" are
// anagrams; "hat" is in a group by itself.
//
// Input:  strs — an array of lowercase strings.
// Output: a list of lists, each inner list holding one group of anagrams.
//         Order doesn't matter — neither the order of the groups nor the order
//         of words within a group.
//
// Example:
//   Input:  ["act", "pots", "tops", "cat", "stop", "hat"]
//   act, cat         → same letters {a,c,t}     → one group
//   pots, tops, stop → same letters {o,p,s,t}   → one group
//   hat              → letters {a,h,t}, alone   → one group
//   Output: [["act","cat"], ["pots","tops","stop"], ["hat"]]
//
// Edge cases:
//   ["x"]  → [["x"]]              single word
//   [""]   → [[""]]              empty string is a valid group of one
//   up to 1000 words, each up to 100 chars → grouping key must be cheap to compute

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String,ArrayList<String>> map = new HashMap<>(); //map for storing keys as sorted string and values as arraylist of strings
        for (int i = 0; i<strs.length; i++){
            String str = strs[i];
            //convert this string into char array before sorting
            char[] chars = str.toCharArray();
            Arrays.sort(chars); //sorted the array now creating a new string from array
            String new_string = new String(chars);
            //check if this string is in hashmap or not
            //if the sorted key is not found then create a newlist and store it
            if (!map.containsKey(new_string)){
                //create a new list and store in the hashmap
                ArrayList<String> string_list = new ArrayList<>();
                string_list.add(str);
                map.put(new_string,string_list);
            }
            //else just append the str to matched sorted list
            else{
                map.get(new_string).add(str);
            }
        }
        
        //convert all the values of keys and add it to list of list
        for (ArrayList<String> str: map.values()){
            list.add(str);
        }
        return list;
    }
}
