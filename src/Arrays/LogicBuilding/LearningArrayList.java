package Arrays.LogicBuilding;

import java.util.ArrayList;
import java.util.Arrays;

public class LearningArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(0,3);
        list.add(1,6);
        list.add(2,9);
        list.add(3,12);
        list.add(3,100);
        System.out.println("This is a ArrayList:- "+list);

        int nums[]= new int[5];
        for(int i=0;i<nums.length;i++){
            nums[i] = list.get(i);
        }
        System.out.println("We have converted ArrayList into Array:-");
        System.out.println(Arrays.toString(nums));
    }
}
