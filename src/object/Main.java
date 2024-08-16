/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author aytaj.veyisli
 */
public class Main {
    public static void main(String[] args) {
        User.umumi="Salam";
        //User.foo();
        
       // System.out.println(User.umumi);
        
        User u = new User();
        u.Name="Aytac";
        
        User u2 = new User();
        u2.Name="Ulker";
        
        Test.deyish();
        
        System.out.println(u.Name);
        System.out.println(u2.Name);
        System.out.println(User.umumi);
        
    }
}
