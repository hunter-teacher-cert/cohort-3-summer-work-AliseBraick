 import java.io.*;
import java.util.*;

  public class Stack{

    // Decalre and initialize instance variables ( object properties) ----> (type: ArrayList, name is stackData)
    private ArrayList<Integer> stackData;
    

    // Default constructors/objects  (We use public and the same name of the class ())
    // the defaut constructors/objects has no parameters
    // initialize the varaible stackdata to a new empty ArrayList 
    public Stack (){
      stackData = new ArrayList<Integer> ();
    }

    // toString( method)
    public String toString(){
      String result = " ";
      result= result + stackData;
      return result;
    }
  
    // Implement the Push() method
    public void push(int num){
    stackData.add(num);
  }

    // implement size() method
    public int size(){
      return stackData.size();
    }
    
  // int pop() - remove and return the top value from the stack
    public Integer pop()  {
      if(stackData.size() == 0){
        return null;
      } else {
        int topValue = stackData.get(stackData.size()-1);
        stackData.remove(stackData.size()-1);
      return topValue;
    }
}

    //int top() - return but do not remove the top value from the stack
    public Integer top(){
      if (stackData.size() == 0){
        return null;
      } else {
      return stackData.get(stackData.size()-1);   
    }
  }

    //boolean isEmpty() - return true of the stack is empty, false otherwise
    public boolean isEmpty(){
       if (stackData.size() == 0){
         return true;
       } else {
         return false;
       }
  }
     
}
