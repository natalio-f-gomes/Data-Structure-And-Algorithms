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
       String s="()[]{}";
        
       boolean isValid = Solution.isValid("s");
        System.out.println(isValid);

    }
    
    
    
}