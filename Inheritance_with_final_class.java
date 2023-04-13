final class Vehicle {
  protected String brand = "Audi";
  public void honk() {
    System.out.println("Beep, beep!");
  }
}

class Main extends Vehicle {
  private String modelName = "Q8";
  public static void main(String[] args) {
    Main myFastCar = new Main();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}

/**
Terminal Output:
Main.java:9: cannot inherit from final Vehicle
class Main extends Vehicle {
                  ^
1 error
*/
