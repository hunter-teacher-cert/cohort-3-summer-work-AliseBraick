import java.io.*;
import java.util.*;


class Grade{

  //instance vaiables - properties of the object 
  private String ID; 
  private double score;
  private double weight;

  //setter method - as we are setting the value, we need a parameter
  public void setID(String id){
    ID = id;
  }

  //getter method
  public String getID(){
    return ID;
  }

  //defualt constructor - a constructor must have the same name as the class name
  public Grade(){
    ID = "";
    score = 0.0;
    weight = 0.0;
  }

  //constructor with parameters
  public Grade(String id, double s, double w){
    ID = id;
    score = s;
    weight = w;
  }

  //method - action
  public void enterInfo(){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter ID: ");
    ID = input.nextLine();
    
    System.out.print("Enter Score: ");
    score = input.nextDouble();
    
    System.out.print("Enter Weight: ");
    weight = input.nextDouble();
    
    input.nextLine();
  }
  
  //method - action
  public void showInfo(){
    System.out.println("ID: " + ID +
                      " Score: " +  score + 
                      " Weigh: " + weight);
  }
}