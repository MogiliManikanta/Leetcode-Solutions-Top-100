class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList<>();
        }
        HashMap<String,List>ans = new HashMap<>();
        for(String s:strs){
            char[] array = s.toCharArray();
            Arrays.sort(array);
            String sorted=String.valueOf(array);
            if(!(ans.containsKey(sorted))){
                ans.put(sorted,new ArrayList<>());
            }
            ans.get(sorted).add(s);
        }
        return new ArrayList(ans.values());
    }
}