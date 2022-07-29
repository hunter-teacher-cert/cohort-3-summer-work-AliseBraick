 import java.io.*;
import java.util.*;

  public class Stack{

    // Place private instance variables here
    private ArrayList<Integer> stackData;
    int size ;

    // Default constructors 
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
    
    // implement the pop() method
    public Integer pop()  {
      if(stackData.size() == 0){
        return null;
      } else {
    return stackData.remove(stackData.size()-1);
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
