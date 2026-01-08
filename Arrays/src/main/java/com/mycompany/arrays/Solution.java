/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

import java.util.TreeSet;
import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author nataliogomes
 */
public class Solution {
   
    public static int removeDuplicates(int[] nums) {
        TreeSet<Integer> uniqueNumbers = new TreeSet();
        //TreeSet DS garantees that the numbers arred in the set is unique and it is in the correct order
        
        for(int i=0;i<nums.length;i++){
            uniqueNumbers.add(nums[i]);
        }
        return uniqueNumbers.size();

    }
    
    public static int[] removeElement(int[] nums, int val) {
        //this solution is out-of place because it uses an extra array: newNums
        int size = 0;
        for(int num: nums){
            if(num != val){
                size++;
            }
        }
        int[] newNums = new int[size];
        int x = 0;
        for(int num: nums){
             if(num != val){
                newNums[x] = num;
                x++;
            }
        }
        return  newNums;
    }
    
    public static int[] getConcatenation(int[] nums) {
        if(nums.length == 0){return nums;}
        if(nums == null){return new int[0];}
        int newL = 2 * nums.length;
        int[] ans = new int[newL];
        int ansIndex = 0;
        int numsIndex = 0;
       
        while(ansIndex < newL){
            if(numsIndex == nums.length){
                numsIndex = 0;
            }
            System.out.println(nums[numsIndex]);
            ans[ansIndex] = nums[numsIndex];
            ansIndex ++;
            numsIndex++;
        }
        return ans;
    }
    
    public static boolean isValid(String s) {
        //Valid Parentheses
        if(s.length()%2 == 1){return false;}
        if(s.length() == 1){return true;}
    
        HashMap<Character, Character> map = new HashMap();
        map.put('{','}');
        map.put('(',')');
        map.put('[',']');
        int leftSide = (s.length() / 2) -1;
        int rightSide = (s.length() / 2);
        System.out.println("left "+leftSide);
        System.out.println("right " +rightSide);
        
        while(leftSide>=0){
            char leftValue = s.charAt(leftSide);
            char rightValue = s.charAt(rightSide);
            System.out.println(leftValue);
             System.out.println(rightValue);
            if(map.get(leftValue) != rightValue ){
               return false;
               }
            leftSide --;
            rightSide ++;
        }
        return true;
        
    }
}
/*
//stack
[]
(
[
{
}
]
)

*/