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
        TreeSet<Integer> al2=new TreeSet<>();
        TreeSet<Student> al3=new TreeSet<>();
        //adding String
        al.add("Ravi");
        al.add("Lahiru");
        al.add("Ravi");
        al.add("heshan");
        
        
      int a[]={2,3,23,43};
      for(int i=0;i<a.length;i++){
         al2.add(a[i]);
      
      }
      //adding objects
      al3.add(new Student("shasila"));
      al3.add(new Student("heshshshshshshsh"));
      
      
        
        // al.remove("heshan");
        
        //Adding String
        
//        Iterator<String> itr=al.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//adding Integer
//         Iterator<Integer> itr2=al2.iterator();
//        while(itr2.hasNext()){
//            System.out.println(itr2.next());
//        }
        for(Student s:al3){
            System.out.println(s.getName());
        }
        
        
       
    }
    
}
class Student implements Comparable<Student>{

    private String name;

    public Student(String name) {
        this.name = name;
    }
    
    

    public String getName() {
        return name;
    }

    
    @Override
    public int compareTo(Student o) {
        
       if(this.getName().length()> o.getName().length()) {
            return -1;
        } else if (this.getName().length()< o.getName().length()) {
            return 1;
        } else {
            return 0;
        }
//To change body of generated methods, choose Tools | Templates.
    }

    
    

}