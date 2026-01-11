/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

import java.util.ArrayList;
import java.util.List;

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
        
        
        List<String> words = new ArrayList();
        words.add("ball");
        words.add("area");
        words.add("read");
        words.add("lady");

          
        boolean validWordSquare = Solution.validWordSquare(words);
        System.out.println(validWordSquare);
        
        System.out.println("=====================");
        String[] people = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int r = Solution.countSeniors(people);
        System.out.println(r);
        System.out.println("=====================");
        
        String[] emails = {"test.email+alex@neetcode.com","test.e.mail+bob.cathy@neetcode.com","testemail+david@nee.tcode.com"};
        System.out.println(Solution.numUniqueEmails(emails));
        
        System.out.println("===================\n");
        int[] arr = {1,1,0,1,1,1};
        System.out.println(Solution.findMaxConsecutiveOnes(arr));
        
        

    }
    
    
  
    
    
    
}