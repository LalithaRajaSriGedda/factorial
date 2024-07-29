/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorial;

/**
 *
 * @author Lalitha
 */
public class Factorial {

    public static void main(String[] args) {
        int n=5,i,fact=1;
        for(i=0;i<=n;i++){
            fact=fact*i;
        }
    
    System.out.println("factorial is:" +fact);
    }

}