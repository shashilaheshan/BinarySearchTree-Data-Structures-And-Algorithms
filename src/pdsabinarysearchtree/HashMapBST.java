/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsabinarysearchtree;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author shashilaheshan
 */
public class HashMapBST {
   
    
    public static void main(String[] args) {
         HashMap<Integer,String> hm=new HashMap<>();
    
          hm.put(100000,"shashila");
          hm.put(30000000, "heshanp");
          
          
          for(Map.Entry m:hm.entrySet()){
          
              System.out.println(m.getKey()+" "+m.getValue());
          }
    }
}
