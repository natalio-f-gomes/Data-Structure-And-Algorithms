/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hashing;

/**
 *
 * @author nataliogomes
 */
public class Hashing {

    public static void main(String[] args) {
        String key = "Natalio";
        int age = 23;
        HashImplementation hash = new HashImplementation();
        hash.addPair(2, key, age);
        System.out.println(hash.getPair(2));
        
        System.out.println("4%2 = "+ 4%2);
    }
}
