/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

import java.util.TreeSet;
import java.util.Arrays;
import java.util.Stack;
import java.util.HashSet;

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
    
     public static int scoreOfString(String s) {
       int score = 0;
       for(int index=0;index < s.length()-1; index++){
          
           int currentAsciiValue = s.charAt(index);
           int nextAsciiValue = s.charAt(index+1);
           int pair = Math.abs(nextAsciiValue - currentAsciiValue);
            System.out.println("current: " + currentAsciiValue + " nextAsciiValue"+ "pair: " + pair);
           //System.out.println(pair);
           score += pair;
           
       }
       return score;
          
    }
     
      public static boolean hasDuplicate(int[] nums) {
        HashSet deduplicated = new HashSet();
        for(int i: nums){
            deduplicated.add(i);
        }
        return deduplicated.size() == nums.length;
    }
      
     public static boolean isAnagram(String s, String t) {
        if(s.length() == 0 && t.length() == 0 ){return true;}
        if(s.length() != t.length()){return false;}
        
       
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        
        for(int i=0;i<s.length();i++){
            if(sChar[i] != tChar[i]){
                return false;
            }
        }

        return true;

    }
    
}
    
/*

Input: s = "code"

Output: 24
c
o
d
e

*/

