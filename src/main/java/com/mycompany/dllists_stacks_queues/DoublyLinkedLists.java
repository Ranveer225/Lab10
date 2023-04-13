package com.mycompany.dllists_stacks_queues;


import com.mycompany.dllists_stacks_queues.DoublyLinkedList;
import org.w3c.dom.Node;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ranveer Singh PC
 */
public class DoublyLinkedLists {
    Node nodeA = newNode(0);   
    Node nodeB = newNode(1);
    public static void main(String[] args) {
   int m = 10;
          DoublyLinkedList numList = new DoublyLinkedList();
   int[] array = numList.toArray();  // 1. toArray method
   System.out.print("List to array: ");
   
   for(int n:array){
       System.out.print("");
   }                 // 2. find IndexOf(object)
   int num = 0;
   System.out.println("/nindex of "+numList.indexOf(num));
    }
    private Node newNode(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}




