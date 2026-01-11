/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

import java.util.TreeSet;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;

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
     
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length-1].length();
    } 
    
     public static int[] twoSum(int[] nums, int target) {
        
       int[] output = new int[2];
        for(int i=0;i< nums.length; i++){
            for(int j=0;j < nums.length; j++){
                if((nums[i] + nums[j] == target) && (i!=j)){
                    output[0] = j;
                    output[1] = i;
                }
            }
        }
        return output;
    
    }
     
    public static boolean validWordSquare(List<String> words) {
        if(words.isEmpty()){return true;}
        ArrayList<String> verticalWords = new ArrayList<>();
        int biggestWord = 0;
        for(String word: words){
            //loop through each word and get the length of the longest word
            biggestWord = Math.max(biggestWord, word.length());
        }
        //loop in the range of the bigest word in the list
        for(int i=0;i<biggestWord; i++){
           StringBuilder currentWord = new StringBuilder(); 
            //loop through the list
            for(String word: words){
                if(i < word.length()){
                    currentWord.append(word.charAt(i));
                }
            }
            verticalWords.add(currentWord.toString()); 
        }
        for(int i=0;i<words.size();i++){
            if(! words.get(i).equals(verticalWords.get(i))){
                return false;
            }
        }
       return true;
    }
    
    public static int countSeniors(String[] details) {
        /*
        The first ten characters consist of the phone number of passengers.
        The next character denotes the gender of the person.
        The following two characters are used to indicate the age of the person.
        The last two characters determine the seat allotted to that person.
        */
        int number = 0;
        
      
        for(String passenger: details){
            StringBuilder age = new StringBuilder();
            for(int i=11;i<=12;i++){
                age.append(passenger.charAt(i));
            }
            if(Integer.parseInt(age.toString()) > 60){
                number++;
            }
            System.out.println(age);
            

        }
        return number;
    }
    
     public static int numUniqueEmails(String[] emails) {
      
        HashSet uniqueEmails = new HashSet();
        for(int i=0;i<emails.length;i++){
            //looping through the list
            String[] emailsSperated = emails[i].split("@");
            String domain = emailsSperated[1];
            String username = emailsSperated[0];
            StringBuilder validEmail = new StringBuilder();
            for(int letterIndex=0; letterIndex< username.length(); letterIndex++){
                //looping through the individual word
                username = username.replace(".", "");
                if(username.charAt(letterIndex) != '+'){
                    validEmail.append(username.charAt(letterIndex));
                }else{ break;}
                
            }
            validEmail.append("@");
            validEmail.append(domain);
            
            uniqueEmails.add(validEmail.toString());
            
            System.out.println("Unique emails: " + uniqueEmails);
            System.out.println("username "+ username);
            System.out.println("SB validemail "+ validEmail);
            System.out.println("domain "+domain);
            
        }
        
        return uniqueEmails.size();

    }
     
    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length ==0) {return 0;}
        int total = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            
            System.out.println("nums[i] "+ nums[i]);
            System.out.println("nums[i]==1? : "+ (nums[i]==1));
            System.out.println("sb length "+sb.length());
            System.out.println("index: " + i);
            if(nums[i] == 1){
                sb.append("1");
                System.out.println("sb "+ sb);
            }else{
                System.out.println("nums[i] "+nums[i]);
                
                sb.setLength(0);
            }
            total = Math.max(total, sb.length());
            System.out.println("sb "+ sb);
            
            
        }
        return total;
    }
    
    public static boolean isSubsequence(String s, String t) {
        StringBuilder word = new StringBuilder();
        int outer;
        int inner;
        for(outer =0;outer < s.length(); outer++){
            for(inner =0; inner < t.length(); inner++){
                if(s.charAt(outer) == t.charAt(inner)){
                    word.append(t.charAt(inner));
                    break;
                }         
            }
        }
        return word.toString().equals(s);
    }
    
     public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            try{
            map.put(nums[i], map.get(nums[i])+1);
            }
            catch(Exception e){
                map.put(nums[i], 1);
            }
        }
        int mapKey = 0;
        int mapValue =0;
        for(int key: map.keySet()){
            System.out.println("map.get(key)> mapValue "+ (map.get(key)> mapValue));
            if(map.get(key)> mapValue){
                mapKey = key;
                mapValue = map.get(key);
            }
        }
        return mapKey;
    }
     public static int maxDifference(String s) {
         HashMap<Character, Integer> map =new HashMap();
         int maxValue= Integer.MIN_VALUE;
         int minValue= Integer.MAX_VALUE;
         System.out.println("Min Value: " + minValue);
         System.out.println("Max Value: " + maxValue);
         for(int i=0;i<s.length();i++){
            char letter=  s.charAt(i);
             System.out.println("Current Letter " + letter);
            try{
                 map.put(letter, map.get( letter)+1);
                 System.out.println("Map: " + map); 
            }catch(Exception e){
                  map.put(s.charAt(i), 1);
                  System.out.println("Catch Map: " + map); 
             }
         }
         for(char letter: map.keySet()){
             int mapValue = map.get(letter);
            if(mapValue > maxValue){maxValue = mapValue; }
            if(mapValue < minValue){minValue = mapValue; }
            System.out.println("Min Value: " + minValue);
            System.out.println("Max Value: " + maxValue);
         }
          
            
         return maxValue - minValue;
    }
    
    
      
}

