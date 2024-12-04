import java.util.*;
class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();  
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int sum = arr[left]+arr[right];    
            if(sum == 0){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                list.add(pair);                  
                int leftval  = arr[left];
                int rightval = arr[right];      
                while(left<right && leftval == arr[left]){
                   left++;
                }
                while(left<right && rightval == arr[right]){
                       right--;
                }
            }else if(sum<0){
                left++;
            }else{
                right--;
            }
        }   
        return list;      
    }
    public static void main(String[] args) {
        int[] arr1 = {-1, 0, 1, 2, -1, -4};
            int[] arr2 = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
            System.out.println(getPairs(arr1)); // Output: [[-1, 1]]
            System.out.println(getPairs(arr2));
    }
}
