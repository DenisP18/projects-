/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addup;
import java.util.Scanner;

public class AddUp {


    public  static void main(String[] args) {
        int i=0;
        int z;
        int sum = 0;
        Scanner x = new Scanner(System.in);
        System.out.println("Input Integer:");
        z= x.nextInt();
        
        for(;i<=z;i++){
           
            sum =sum +i;
        }
        
       System.out.println("The addUp sum" + " = " +sum);
}
}