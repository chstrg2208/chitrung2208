
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author truon
 */
public class MyList {
    Node head;

    public MyList() {
        this.head = null;
    }
    public boolean isEmpty(){
//        if(this.head == null)
//            return true;
//        else
//            return false;
        return this.head == null;
    }
    public void clear(){
        this.head = null;
    }
    public void traverse(){
        Node p = head;
        while (p!=null){
            System.out.print(p.info);
            System.out.print(" ");
            p = p.next;
        }
    }
    void loadData(int k){
        Random generator = new Random();
        for (int i = 0; i < k; i++) {
           int number = generator.nextInt(1000)+1;
                //add into list
                addFirst(number);
            }
    }
    public void addFirst(int n){
        //-----------------------------------------------------------------------
        //----Start your code here-----------------------------------------------------
        Node newNode = new Node(n);
        
        // addFirst
        newNode.next = head;
        head = newNode;
        
        
        
        
        //---------end your code here-----------------------------------------------
        //----------------------------------------------------------
    }
    public void addLast(int n){
        //-----------------------------------------------------------------------
        //----Start your code here-----------------------------------------------------
        Node newNode = new Node(n);
        
        // addLast
        //last element.next = newNode
        // Case 1:if list is empty, make the new node as head
        if(head == null){
            head = newNode;
            return;
        }
        //Case 2:if list is not empty
        Node last = head;
        while (last.next!=null){
            last = last.next;
        }
        //add the new node at the end
        last.next = newNode;
        
        //---------end your code here-----------------------------------------------
        //----------------------------------------------------------
    }
    public void addPos(int a, int k) {
    Node newNode = new Node(a);

    if (k <= 0 || head == null) {
        addFirst(a);
        return;
    }

    Node current = head;
    int index = 0;

    while (current != null && index < k - 1) {
        current = current.next;
        index++;
    }

    if (current == null) {
        addLast(a);
    } else {
        newNode.next = current.next;
        current.next = newNode;
    }
    }
    void f1(){
        System.out.println("Linker list: ");
        this.traverse();
    }
    // f2: Nhap du lieu mot con so tu ban phim =>addLast
    void f2(){
        System.out.println("Before: ");
        this.traverse();
        //-----------------------------------------------------------------------
        //----Start your code here------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter :");
        int a = sc.nextInt();
        addLast(a);
        
        //---------end your code here-----------------------------------------------
        //----------------------------------------------------------
        System.out.println("After: ");
        this.traverse();
    }
    //f3:Ham addPoas ==> them node vao vi tri thu k
    // trong do node moi va chi so k duoc nhap tu ban phim
    void f3(){
        System.out.println("Before: ");
        this.traverse();
        //-----------------------------------------------------------------------
        //----Start your code here------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to add at the end: ");
        int value = sc.nextInt();
        System.out.println("Enter position k (0-based index): ");
        int k = sc.nextInt();
        // Special case for head
        if(k==0){
            addFirst(value);
            return;
        } else {
        //Find the node at position k-1
        Node curent = head;
        int currentIndex = 0;
        while(currentIndex<k-1 && curent!=null){
            curent = curent.next;
            currentIndex++;
        }
        //Insert the new node 
        Node newNode = new Node(value);
        newNode.next = curent.next;
        curent.next = newNode;
        //---------end your code here-----------------------------------------------
        //----------------------------------------------------------
        System.out.println("After: ");
        this.traverse();
    }
//    void f3(){
//        System.out.println("Before:");
//        this.traverse();
//        //---Start your code here -----------------
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\nEnter a number to add");
//        int a = sc.nextInt();
//        
//        System.out.println("Enter position k (0-based index)");
//        int k = sc.nextInt();
//        
//        addPos(a,k);
//       
//        //---End your code here   ------------
//        System.out.println("After:"); 
//        this.traverse();
//                
//    }
    
    }
   
    // f4: removeFirst
    void f4(){
        System.out.println("Before:");
        this.traverse();
        //---Start your code here ------------
        if(head != null){
            head = head.next;
        }
        
        //---End your code here   ------------
        System.out.println("After:"); 
        this.traverse();
    }
    // f5: removeLast
    void f5() throws Exception{
        System.out.println("Before:");
        this.traverse();
        //---Start your code here ------------
        if(head!=null){
            //If there is only one element
            if(head.next==null){
            }else{
                // find the second last node
                //remove last node
                Node secondlast = head;
                while(secondlast.next.next!=null){
                    secondlast = secondlast.next;
            }
                secondlast.next = null;
        }
        
        //---End your code here   ------------
        System.out.println("After:"); 
        this.traverse();
    }
}  
}