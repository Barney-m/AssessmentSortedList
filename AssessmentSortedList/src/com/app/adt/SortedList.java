package com.app.adt;


public class SortedList<E extends Comparable<E>>{
    
    private Node<E> first;
    
    public SortedList(){
        first = null;
    }

    private Node<E> getFirst(){
        return first;
    }


    public boolean isEmpty(){
        return (first==null);
    }

    public void insert(E key){
        Node<E> newNode=new Node<E>(key);
        insert(newNode);
    }
    public void insert(Node<E> newNode){

        if (first==null || newNode.compareTo(first) < 0){
            newNode.setNext(first);
            first=newNode;
        }  else {
            Node<E> current = first, previous=null;
            while ( current != null && newNode.compareTo(current) > 0 ) {
                previous = current;
                current = current.getNext();
            }

            previous.setNext(newNode);
            newNode.setNext(current);
        }
    }
    public void print(){
        for (Node<E> cursor=getFirst(); cursor != null ;
             cursor=cursor.getNext()){
            System.out.println(cursor.getData());
        }
    }
    
    public class Node<E extends Comparable<E>> implements Comparable<Node<E>> {
        private E data;
        private Node<E> next;
        public Node(E data){
            this.data = data;
            next=null;
        }
        public Node<E> getNext(){
            return next;
        }

        public void setNext(Node<E> next){
            this.next = next;
        }

        public E getData(){
            return data;
        }
        public int compareTo(Node<E> other){
            return data.compareTo(other.data);
        }
    }
}
