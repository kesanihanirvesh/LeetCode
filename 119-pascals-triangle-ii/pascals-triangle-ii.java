class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> arr=new ArrayList<>();
        if(rowIndex==0){
            arr.add(1);
            return arr;
        }
        List<Integer> pre= getRow(rowIndex-1);
        List<Integer> curr= new ArrayList<>();
        curr.add(1);
        for(int i=1;i<pre.size();i++){
            curr.add(pre.get(i)+pre.get(i-1));
        }
        curr.add(1);
        return curr;
    }
}