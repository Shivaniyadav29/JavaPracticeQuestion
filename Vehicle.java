package Lab6;

 class Vehicle { // super class
     void start(){
         System.out.println("Vehicle Started");
     }
 }
 class Car extends Vehicle{ // subclass
   void start(){
       System.out.println("car started");
   }
 }
 class Motorcycle extends Vehicle{ // subclass
     void start(){
         System.out.println("Motorcycle Started");
     }
 }
 class Garage {
     void ServiceVehicle(Vehicle vehicle) {
         vehicle.start();
         System.out.println("Vehicle serviced");
         }
 }
 class overriding{
     public static void main(String[]args){
         Car c = new Car();
         Motorcycle m = new Motorcycle();
         Garage g = new Garage();
         g.ServiceVehicle(c);
         g.ServiceVehicle(m);
     }
 }


