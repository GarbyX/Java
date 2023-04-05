public class Human {
  private String name;                        // private => implies restricted access

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    this.name = newName;
  }
}

public class Main {
  public static void main(String[] args) {
    Person myObj = new Human();
    // myObj.name = "GarbyX";
    myObj.setName("GarbyX");
    System.out.println(myObj.name);
  }
}

/**
Main.java:4: error: name has private access in Human
    myObj.name = "GarbyX";
         ^
Main.java:5: error: name has private access in Human
    System.out.println(myObj.name);
                  ^
2 errors
*/
