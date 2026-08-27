class Solution {
    public String decodeString(String s) {
        Stack<String> str = new Stack<>();
        Stack<Integer> freq = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int num = 0;

        for(char ch : s.toCharArray()){
            if (Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
            }
            else if (ch == '['){
                freq.push(Integer.valueOf(num));
                num = 0;
                str.push("[");
            }
            else if (ch == ']'){
                StringBuilder sb = new StringBuilder();
                int curr_freq = 0;
                while (!str.isEmpty() && !str.peek().equals("[")) {
                    sb.insert(0, str.pop());  // keep each chunk intact
                }
                str.pop(); // "["
                curr_freq = freq.pop();
                //form new string
                StringBuilder repeated = new StringBuilder();
                for (int i = 0; i < curr_freq; i++){
                    repeated.append(sb);
                }
                str.push(repeated.toString());
            }
            else{
                str.push(String.valueOf(ch));
            }
        }
        for (String part : str) ans.append(part); // bottom → top
        return ans.toString();
    }
}

/*
Decode String
You are given an encoded string s, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. There will not be input like 3a, 2[4], a[a] or a[2].

The test cases are generated so that the length of the output will never exceed 100,000.

Example 1:

Input: s = "2[a3[b]]c"

Output: "abbbabbbc"
Example 2:

Input: s = "axb3[z]4[c]"

Output: "axbzzzcccc"
Example 3:

Input: s = "ab2[c]3[d]1[x]"

Output: "abccdddx"
*/