/*Encode and Decode Strings
Medium
Topics
Company Tags
Hints
Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings.

Machine 1 (sender) has the function:

String encode(List<String> strs) {
    // ... your code
    return encoded_string;
}
Machine 2 (receiver) has the function:

List<String> decode(String encoded_string) {
    // ... your code
    return decoded_strs;
}*/

class Solution {

    public String encode(List<String> strs) {
        //I receive list of strings and convert it into a single string 
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<strs.size(); i++){
            sb.append(strs.get(i).length());
            sb.append("#");
            sb.append(strs.get(i));
        }
        return sb.toString();
    }

    /*strings are in format 3#abc1#k#4#abcd
    */

    public List<String> decode(String str) {
        ArrayList<String> string_list = new ArrayList<>(); //array where i will insert decoded string
        int index = 0;
        while (index < str.length()){
            StringBuilder length_str = new StringBuilder();
            while (str.charAt(index) != '#'){
                length_str.append(str.charAt(index));
                index++;
            }
            int length = Integer.parseInt(length_str.toString());
            int start = index + 1;
            StringBuilder sb = new StringBuilder();
            for (int j = start; j< start + length; j++){
                sb.append(str.charAt(j));
            }
            index = index + length + 1;
            string_list.add(sb.toString());
        }
        return string_list;
    }
}
