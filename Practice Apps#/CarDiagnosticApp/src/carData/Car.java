package carData;

public class Car {

 String carBrand;
 String carModel;
 
 int year;
 double horsePower;
 
  public Car(String carBrand, String carModel)
 {
  this.carBrand = carBrand;
  this.carModel = carModel;
 }
 
 public Car(String carBrand, String carModel , int year , int horsePower)
 {
  this(carBrand,carModel);
  this.year = year;
  this.horsePower = horsePower;
 }

  public String getCarInfo()
  {
   return carBrand+","+carModel+","+year+","+horsePower;
  }

  public double upgreade(double u){
  return u = horsePower+u;
 }

}
