class Vehicle {
  protected String brand = "Innoson";                 
  public void horn() {                                  
    System.out.println("Beep, beep!");
  }
}

class Car extends Vehicle {
  private String modelName = "IVM G5";            // attribute
  public static void main(String[] args) {

    Car car = new Car();                        // creates a myCar object
    car.honk();                                 // calls the "inherited" horn() method on the car object

     System.out.println(car.brand + " " + car.modelName);
    
    /** Outputs the value of the brand attribute (Vehicle class) and
    the value of the modelName from the Car class. To be defined later in the code base
    */
   
  }
}
