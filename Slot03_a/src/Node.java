/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author truon
 */
public class Node {
    //private
    //public
    //protected
    // ________
    int info;
    Node next;
    // default constructor (no parameter)
    public Node() {
    }
    //constructor for typical node
    public Node(int info, Node next) {
        this.info = info; //data stored inside the node
        this.next = next; // link to the next node
    }
    //copy constructor
    public Node(int info) {
        this.info = info;
    }
}
