/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;


/**
 *
 * @author nataliogomes
 */
public class Arrays {

    public static void main(String[] args) {
       int[] nums = {1,1,2,3,4};
       
       int deduplicates = Solution.removeDuplicates(nums);
       
       int n[] = Solution.removeElement(nums, 1);
       
       int[] result = Solution.getConcatenation(nums);
        for(int num: result){
           System.out.print(num + " ");
       }
       System.out.println("");
       String s="({[{({[[})}]})";
        
       
        System.out.println("String score");
        System.out.println(Solution.scoreOfString("code"));

        int[] numbers = {1, 2, 3, 3};
        System.out.println(Solution.hasDuplicate(numbers));
        
        String st1 = "racecar";
        String st2 = "carrace";
        System.out.println(Solution.isAnagram(st1, st2));
        
         
        String string ="   fly me   to   the moon  ";
        System.out.println(Solution.lengthOfLastWord(string));

    }
    
    
  
    
    
    
}