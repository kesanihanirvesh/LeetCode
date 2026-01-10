class Solution {
    public int climbStairs(int n) {
         int [] arr=new int[47];
         for(int i=0;i<=45;i++){
            arr[i]=0;
         }
         int data = helper(arr,n);
         return data;
    }
    public int helper(int[] arr, int n){
        if(n<=2){
            return n;
        }
        if(arr[n]!=0){
            return arr[n];
        }
         arr[n]=helper(arr,n-1)+helper(arr,n-2);
        return arr[n];
    }
    
        
}