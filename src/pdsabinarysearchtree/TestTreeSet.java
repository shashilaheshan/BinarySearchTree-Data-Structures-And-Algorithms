/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsabinarysearchtree;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author shashilaheshan
 */
public class TestTreeSet {
    
    
    
    
    public static void main(String[] args) {
        
        //Does not contain duplicate entities 
        //Maintain ascending order
        //stores in a red black tree
        TreeSet<String> al=new TreeSet<>();
        al.add("Ravi");
        al.add("Lahiru");
        al.add("Ravi");
        al.add("heshan");
        
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
