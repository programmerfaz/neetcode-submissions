/*Design HashMap
Easy
Topics
Company Tags
Design a HashMap without using any built-in hash table libraries.

Implement the MyHashMap class:

MyHashMap() initializes the object with an empty map.
void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
Example 1:

Input: ["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
[[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]

Output: [null, null, null, 1, -1, null, 1, null, -1]
*/
class MyHashMap {
    //create a reference for map using arrayList
    private ArrayList<ArrayList<Integer>> hashMap;
    public MyHashMap() {
        hashMap = new ArrayList<ArrayList<Integer>>();
    }
    
    public void put(int key, int value) {
        //first check if this key is present in the hashmap or not
        for (int i = 0; i<hashMap.size(); i++){
            ArrayList<Integer> list = hashMap.get(i); //fetch the list at every index
            //now for each list check first value or the key if it matches the input key or not
            if (list.get(0) == key){
                //update its value
                list.set(1,value);
                return;
            }
        }
        //just add it as a new value
        ArrayList<Integer> new_list = new ArrayList<>();
        new_list.add(key);
        new_list.add(value);
        hashMap.add(new_list);
    }
    
    public int get(int key) {
        for (int i = 0; i < hashMap.size(); i++){
            ArrayList<Integer> list = hashMap.get(i);
            if (list.get(0) == key){
                return list.get(1);   
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        for (int i = 0; i < hashMap.size(); i++){
            ArrayList<Integer> list = hashMap.get(i);
            if (list.get(0) == key){
                hashMap.remove(i); 
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */