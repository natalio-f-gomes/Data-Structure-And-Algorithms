/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hashing;


import java.util.LinkedList;
import java.util.HashMap;
/**
 *
 * @author nataliogomes
 */
public class HashImplementation {
    private HashMap<String,Integer> [] array;
    private LinkedList<HashMap<String,Integer>> node;
    private int size;
    
    public HashImplementation(){
        this.size = 2;
        System.out.println("Size: "+size);
        this.array = new HashMap[size];
    }
    public  void addPair(int index,String key, int value ){
       
        if(index>=size){
            HashMap<String,Integer> [] temp = new HashMap[size];
            size *= 2;
            System.out.println("Size: "+size);
            this.array = new HashMap[size];
            
            //implement the for loop
        }
        HashMap<String, Integer> map = new HashMap();
        map.put(key, value);
        int result = index % size;
        System.out.println("Result: " + result);
        array[result] = map;
    }
    public HashMap<String, Integer> getPair(int index){
        int result = index % size;
        return array[result];
    }
}
