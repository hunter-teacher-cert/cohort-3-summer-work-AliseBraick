import java.io.*;
import java.util.*;

/*
Sort Project:
Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.
  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.
  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.
Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    public SortSearch(){
	    data = new ArrayList<Integer>();
	    r = new Random();
	    for (int i=0;i<15;i++){
	    data.add(r.nextInt(20));
	        }
	
    }
    
    public SortSearch(int size){
	    data = new ArrayList<Integer>();
	    r = new Random();
	    for (int i=0;i<size;i++){
	    data.add(r.nextInt(20));
	        }
	
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	return this.data.get(index);
    }
    


    /*
      return the index of the smallest data idem from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it would return 3
      which is the index of the value 6 which is the index with the
      smallest value from start to end
      On the otherh and, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
    public int findSmallestIndex(int start){
      
	    int smallIndex = start; // according to what index would like to start from
      
      for(int i = start; i < data.size(); i++){
      if( data.get(i) < data.get(smallIndex)){
        
      smallIndex = i; 
    }
  }
	  return smallIndex;//return index
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.
       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.
	 
       
    */
    public void sort(){
        for(int i = 0; i< data.size(); i++){//iterating the start position of find smallest index
            int smallindex = findSmallestIndex(i); //sets the variable to index of smallest element
            int smallval = data.get(smallindex); //set the variable to the value of the smallest element
            
            int startval = data.get(i); //sets the value of the start position
            
            data.set(i, smallval); //puts the smallest values at the start position
            data.set(smallindex, startval); //puts the start value at the smallest values position
        }
//PS : swapElements method written before could also be used😇😇
    }



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.
       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.
       This algorithm works on any ArrayList.
    */
    public int linearSearch(int value){
      for (int i = 0; i < data.size(); i++){
        if (data.get(i) == value){
          return i; //return index of the target value
        }
      }
	  return -1; // if value not found
    }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){
      int lowIndex = 0; 
      int highIndex = data.size()-1;
      int midIndex = (highIndex + lowIndex)/2;
      
      while (lowIndex <=midIndex && midIndex <= highIndex ){
        int midValue = data.get(midIndex);
        if (midValue == value){
          return midIndex;
          
          // checking the upper bound
        } else if (midValue < value){
          lowIndex = midIndex + 1;
          midIndex = (highIndex + lowIndex)/2;
           // checking the lower bound 
        } else {
          highIndex = midIndex -1;
          midIndex = (highIndex + midIndex)/2;
        } 
      }
      return -1; // value not found
    }

    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex){
      int midIndex = ( lowIndex + highIndex)/2;
      
       // Base case: condition to exit the recursion loop
      if (lowIndex > highIndex){ //thanks for the demo
        return -1;
      }
      // Another base case: return midIndex if midIndex === value
      if (data.get(midIndex) == value){
        return midIndex;
      }
      //recursive for the upper bound
      else if (data.get(midIndex) < value) {
        return binarySearchRecursive(value, midIndex + 1, highIndex);
          // recursive for lower bound
      } else {
        return binarySearchRecursive(value, lowIndex, midIndex -1);
      }
	    
    }
    
	
    public String toString(){
	    return "" + data;
    }


    public void builtinSort(){
	Collections.sort(data);
	
    }

  /* Merge Sort Stuff after here */
    /**
       Builds and returns an ArrayList that's already in increasing order.
       You can use this method to test your merge method.
    */
    public ArrayList<Integer> buildIncreasingList(int size){
	ArrayList<Integer>  newlist = new ArrayList<Integer>();
	Random r = new Random();
	int nextval = r.nextInt(20)+1;
	for (int i=0;i<size;i++){
	    newlist.add(nextval);
	    nextval = nextval + r.nextInt(20);
	}

	return newlist;
	}

    /**
       this routine should create and return a new ArrayList of
       integers and fill it by merging list1 and list2 into the new
       list.
       list1 and list2 are already sorted in increasing order.
       Example:
       If list1 contains [1,5,17,25]
       and list2 contains [3,6,10,30,40,50]
       The new list will contain:
       [1, 3, 5, 6, 10, 17, 25, 30, 40, 50]
       
    */
    // team collaboration //
  public ArrayList<Integer> merge(ArrayList<Integer> list1,
				    ArrayList<Integer> list2){
      // code for merge
      ArrayList<Integer> mergedList = new ArrayList<Integer>();

      while (list1.size() > 0 && list2.size() > 0 ) { // while lists aren't empty (1 or more list is not empty)
        if(list1.get(0) < list2.get(0)) { 
         mergedList.add(list1.get(0));
         list1.remove(0);
       } else {
         mergedList.add(list2.get(0));
         list2.remove(0);
       }    
      }
      if(list1.size() > 0) {
        for(int i = 0; i < list1.size(); i++) {
          mergedList.add(list1.get(i));
        }
      } 
      if(list2.size() > 0 ) {
         for(int i = 0; i < list2.size(); i++) {
          mergedList.add(list2.get(i));
        }
      }
	    return mergedList; 
    }  
}

    