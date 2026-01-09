class Solution {
    public List<List<Integer>> generate(int numRows) {
    //     List<List<Integer>> data=helper(numRows-1);
    //     return data;

    // }

    // public List<List<Integer>> helper(int numRows){
        if(numRows==1){
            List<List<Integer>> arr=new ArrayList<>();
            List<Integer> a=new ArrayList<>();
            a.add(1);
            arr.add(a);
            return arr;
        }
        List<List<Integer>> pre=generate(numRows-1);
        List<Integer> last=pre.get(pre.size()-1);
        List<Integer> curr=new ArrayList<>();
        curr.add(1);
        for(int i=1;i<last.size();i++){
            curr.add(last.get(i)+last.get(i-1));
        }
        curr.add(1);
        pre.add(curr);
        return pre; 
    }
}