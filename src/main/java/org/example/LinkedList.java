package org.example;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getHead() {
        System.out.println("Head:: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail:: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length:: " + length);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;

        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public Node removeLast() {

        Node temp = head;
        Node pre = head;
        if (length == 0) {
            return null;
        }

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode=new Node(2);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if(index<0||index>=length){
            return null;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node node=get(index);
        if(node !=null){
            node.value=value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index<0||index>length){return false;}

        if(index==0){
            prepend(value);
            return true;
        }
        if(index==length){
            append(value);
            return true;
        }

        Node newNode=new Node(1);
        Node temp=get(index-1);

        newNode.next=temp.next;
        temp.next=newNode;
        length++;
        return true;
    }

    public Node remove(int index, int value){
        if(index<0||index>=length){
            return null;
        }

        if(index==0){
            return removeFirst();
        }

        if (index==length-1){
            return removeLast();
        }

        Node prev=get(index-1);
        Node temp=prev.next;
        prev.next=temp;
        temp.next=null;
        length--;
        return temp;


    }

    public void reverse(){
        Node temp=head;
        head=tail;
        tail=temp;
        Node after;
        Node before=null;
        for(int i=0;i<length;i++){
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }

    public Node reverse(Node head){
        Node previous=null;
        Node current=head;
        Node after;

        while(current !=null){
            after=current.next;
            current.next=previous;
            previous=current;
            current=after;
        }
        return previous;
    }
}
