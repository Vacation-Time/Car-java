public class Car {
    //Primitive data types here (not reference)
    int maxSpeed = 100; // '=' assigns value to property 'maxSpeed'
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';
    //reference type variable:
    String nameOfCar = "Vroom Vroom"; //double quotes for "String" , single for 'char'-Java

    //function/method to print variable values
    public void printVariables() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Min Speed: " + minSpeed);
        System.out.println("Weight: " + weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println("Car Name: " + nameOfCar);
    }

    //function/method for the condition of car
    public void wreckCar() {
        condition = 'C';
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1; //what 'maxSpeed' will be after this function is run (101)
    }

    public static void main(String[] args) {

        Car familyCar = new Car();
        System.out.println("Family Car: ");
        familyCar.printVariables();
        //Car aliceCar = familyCar; //reference type as 'aliceCar' is the same as 'familyCar'
        familyCar.wreckCar(); //calling method to change condition of car
        //aliceCar.printVariables(); //check to see if car is same as and affected by aliceCar
        familyCar.upgradeMinSpeed();
        familyCar.printVariables();

    }
}