/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsabinarysearchtree;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author shashilaheshan
 */
public class TreeMapBST {
    
    
    public static void main(String[] args) {
        //Integer key and String value
        TreeMap<Integer,String> hm=new TreeMap<>();
        hm.put(100,"Shashila");
        hm.put(102,"heshan");
        
//        
//        for(Map.Entry m:hm.entrySet()){
//        
//        
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
        
        //String key and String Val
         TreeMap<String,String> hm1=new TreeMap<>();
        hm1.put("one","Shashila");
        hm1.put("two","heshan");
        
        
        for(Map.Entry m:hm1.entrySet()){
        
        
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
    
}
