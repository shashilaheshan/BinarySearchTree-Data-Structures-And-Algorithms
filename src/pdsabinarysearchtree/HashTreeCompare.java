/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsabinarysearchtree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author shashilaheshan
 */
public class HashTreeCompare {
    
    
    
    public static void main(String[] args) {
        //Hashmap
          HashMap<Integer,String> hm=new HashMap<>();
    
          hm.put(100000,"shashila");
          hm.put(30000000, "heshan");
          
          System.out.println("Printing Hashmap Integer,String");
          for(Map.Entry m:hm.entrySet()){
          
              System.out.println(m.getKey()+" "+m.getValue());
          }
           HashMap<String,String> hm3=new HashMap<>();
         
          hm3.put("one","shashila");
          hm3.put("Two", "heshan");
          
          System.out.println("Printing HashMap String String");
          for(Map.Entry m3:hm3.entrySet()){
          
              System.out.println(m3.getKey()+" "+m3.getValue());
          }
          
          //Tree map
          TreeMap<Integer,String> hm2=new TreeMap<>();
        hm2.put(100,"Shashila");
        hm2.put(10200000,"heshan");
       
        
        System.out.println("Printing TreeMap Integer,String");
        for(Map.Entry m2:hm2.entrySet()){
        
        
            System.out.println(m2.getKey()+" "+m2.getValue());
        }
        
        System.out.println("Printing TreeMap String,String");
         TreeMap<String,String> hm4=new TreeMap<>();
        hm4.put("one","hashila");
        hm4.put("two","aheshanhhjhjjh");
        
        
        
        for(Map.Entry m4:hm4.entrySet()){
        
        
            System.out.println(m4.getKey()+" "+m4.getValue());
        }
        
    }
}
