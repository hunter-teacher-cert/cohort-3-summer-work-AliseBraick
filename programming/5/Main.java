//this is where we call the methods from Grade.java
class Main{
  public static void main(String[] args){

    //instantiating the new Grade object with parameters and assign it to g2
    Grade g2 = new Grade("3456", 95, 0.10);
    g2.showInfo();
    
    Grade g = new Grade();
    g.showInfo();

    g.setID("12345678");
    g.showInfo();

    g.setID("123");
    String aString = g.getID();
    System.out.println(aString);

    g.showInfo();
  }

}
