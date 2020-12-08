package array;

import org.junit.Test;

/**
 * description: RemoveNum <br>
 * date: 2020/12/8 17:43 <br>
 * author: lgc <br>
 * version: 1.0 <br>
 */
//  给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
//          不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
//          元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
public class RemoveNum {
    public static void main(String[] args) {
          int [] nums = {2,2,2,2,2,8,2,2,3,4,9,5};
//          int [] nums = {0,1,2,2,3,0,4,2};
          int val = 2;
          int count = 0;
        for (int i = 0; i < nums.length - count; i++) {
            if (nums[i] == val){
                for (int j = i+1; j < nums.length; j++) {
                    nums[j-1] = nums[j];
                }
                count++;
                i--;
            }
        }
        System.out.println(nums.length-count);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
     }


    public int removeElement1(int[] nums, int val) {
        int i = 0;
        for(int j = 0;j < nums.length;j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public int removeElement2(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i<n){
            if(nums[i] == val){
                nums[i] = nums[n-1];
                n--;
            }else{
                i++;
            }
        }
        return i;
    }
}
