/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsabinarysearchtree;






public class AddItemToBST {
    
    private int data;
    private AddItemToBST left;
    private AddItemToBST right;
    
    public AddItemToBST(int num){
    
    
    this.data=num;
    this.left=this.right=null;
    }
    public void addNode(int num){
    
    if(num<this.data){
    
    
            if(this.left!=null){
            this.left.addNode(num);
              
             }else{
            
                    this.left=new AddItemToBST(num);
                    
                    }
            }else{
                
                    if(this.right!=null){
            this.right.addNode(num);
              
             }else{
            
                    this.right=new AddItemToBST(num);
                    
                    }
          }
    }
    
    public void traveseInOrder(){
        if(this.left!=null){
        this.left.traveseInOrder();
        }System.out.println(this.data+":");
        if(this.right!=null){
        
        this.right.traveseInOrder();
        }
    
    }
    public static void main(String[] args) {
        
        AddItemToBST root=new AddItemToBST(20);
        int [] nums={15,200,25,5,0,100};
        
        for(int i:nums){
        root.addNode(i);
        }
        System.out.println("Travese in order -start");
        root.traveseInOrder();
        System.out.println("\n Travese In Order -End");
        
    }
    
}
