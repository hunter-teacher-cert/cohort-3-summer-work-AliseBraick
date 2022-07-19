import java.io.*;
import java.util.*;

/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).
Basic
-----
add(string value)
get(int index);
toString()
Intermediate (at least add, size + one of the other two)
------------
size()
add(int index,String value)
indexOf(String value);
toArray()
Challenge
--------
remove(int index);
*/

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;
  }

  /**
  Parameters:
  value - the new string to add to the list
  Adds a new node containing value to the front of the list.
  */
  public void add(String value){
    Node a = new Node (value, head);
    head = a;
		//head = a;
  }

  /**
  Returns the String in the node at location index.
  */
  public String get(int index){
		Node walker = head;
    // walker != null is making sure we don't go PAST
    // the linked list.
		while(walker != null && index > 0){
			index = index-1; //index--
      walker = walker.getNext();
		}
    /*
    for(int i = 0; i < index && walker != null; i++){
      walker = walker.getNext();
    }
    */

    if(walker == null){
      System.out.println("Oops, that's outside of our LinkedList size! Returning blank string.");
      return "";
    }else{
      return walker.getData();
    }
  }

  /**
  Return a string representation of the list
  */
  public String toString(){
    Node walker = head;
    String myString = "";
    while(walker != null){
      myString += walker.toString();
      walker = walker.getNext();
    }
    myString += "NULL";
    return myString;
  }

  /**
  returns the number of elements in the list
  */
  public int size(){
    int counter = 0;
    Node walker = head;
    while(walker != null){
      counter++;
    }
    return counter;
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value
  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.
  For example, given the list:
  "a" -> "b" -> "c" -> "d"
  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"
  */
  public void add(int index, String value){
    Node walker = head;
    Node myNode = new Node(value);

    for(int i = 0; i < index-1 && walker.getNext() != null;
        i++){
      walker = walker.getNext();
    }
    
    myNode.setNext(walker.getNext());
    walker.setNext(myNode);
  }

  


  /**
  Returns the index (location) of the first node in the list
  that contains value.
  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.
  */
  public int indexOf(String value){
    return 0;
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.
  It should then copy all of the values to the array and return
  the array.
  */
  public String[] toArray(){
    return null;
  }



  /**
  Remove the Node at location index from the list.
  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
  }
}