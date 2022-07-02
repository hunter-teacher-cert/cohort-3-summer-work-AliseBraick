import java.io.*;
import java.util.*;

public class Calc {
  public static void main(String[] args){
  int [] a = { 10, 9, 3, 11};
  int largest = max (a);
    System.out.println(largest);
  }
  public static int max (int [] a) {
    int largest = a[0];
    int index = 0;
    for (int i = 1; i < a.length ; i++){
      if (a[i] >largest){
        largest = a[i];
        index = i;
      }
    }
  return index;
  }
}