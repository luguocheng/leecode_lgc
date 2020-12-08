package array;

/**
 * description: DeleteDuplicate <br>
 * date: 2020/12/7 17:33 <br>
 * author: lgc <br>
 * version: 1.0 <br>
 */
//给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
//不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
public class DeleteDuplicate {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,1,2,2,2,2,2,3,3,3,4,4,4,4};
        int count = 0;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[count] != nums[i]){
                count++;
                nums[count] = nums[i];
            }
        }
        System.out.println(++count);
    }
}
