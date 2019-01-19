/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsabinarysearchtree;

/**
 *
 * @author shashilaheshan
 */
public class PDSABinarySearchTree {

    
    
    Node root;
    PDSABinarySearchTree(int key){
    
    root=new Node(key);
    }
    
    PDSABinarySearchTree(){
    root=null;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
       PDSABinarySearchTree tre=new PDSABinarySearchTree();
       //create root
       
       tre.root=new Node(1);
       tre.root.left=new Node(2);
       tre.root.right=new Node(3);
       
       
       
       tre.root.left.left=new Node(4);
       
       tre.root.traverlSnOrder();
    }
    
}
class Node{

int key;
Node left,right;
        public Node(int item){

            key=item;
            left=right=null;
        }
        
        
        public void traverlSnOrder(){
        if(this.left!=null){
        
        
          this.left.traverlSnOrder();
        }
            System.out.println(this.key+":");
            if(this.right!=null){
            this.right.traverlSnOrder();
            
            }
        
        }
}

