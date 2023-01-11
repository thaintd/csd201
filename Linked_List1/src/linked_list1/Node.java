/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linked_list1;

/**
 *
 * @author ASUS
 */

public class Node {
    
    int info; //data of Node
    Node next;
    //create a new Node 
    Node(int info, Node next) {
        this.info = info;
        this.next = next;
    }
    
    Node(int info) {
        this(info,null);
    }
}