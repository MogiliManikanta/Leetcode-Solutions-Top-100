class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        helper(nums,new ArrayList<>(),list,new boolean[nums.length]);
        return list;
    }

    private void helper(int[] nums,List<Integer>temp,List<List<Integer>>list,boolean[] used){
        if(temp.size()==nums.length){
            list.add(new ArrayList<>(temp));
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(used[i] || i>0 && nums[i]==nums[i-1]  && !used[i-1]){
                    continue;
                }
                temp.add(nums[i]);
                used[i]=true;
                helper(nums,temp,list,used);
                used[i]=false;
                temp.remove(temp.size()-1);
            }
        }
    }
}