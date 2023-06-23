package org.example;

public class Main {
    public static void main(String[] args) {

LinkedList linkedList=new LinkedList(4);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(5);
        linkedList.append(6);
       /* System.out.println(linkedList.removeFirst().value);
        System.out.println(linkedList.removeFirst().value);
        System.out.println(linkedList.removeLast());*/
   linkedList.reverse(linkedList.get(0));
      //  linkedList.prepend(2);
       linkedList.printList();



    }

}