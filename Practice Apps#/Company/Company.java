
public class Company {

 public static void main(String[] args) {
 
  Employee Zbyszek = new Employee();
  Employee Radek = new Employee();
  Employee Bartek = new Employee();
  

  Zbyszek.imiê = "Zbyszek";
  Zbyszek.nazwisko = "Kowalski";
  Zbyszek.rokUrodzenia = 1964;
  Zbyszek.wiek= 51;
  Zbyszek.sta¿Pracy = 10;
  
  String InfoZbyszek =  Zbyszek.imiê +" "+ Zbyszek.nazwisko
       +","+ Zbyszek.rokUrodzenia+", "+Zbyszek.wiek
       +"," + Zbyszek.sta¿Pracy;
  
  System.out.println("Pracownik numer jeden to:");
  System.out.println(InfoZbyszek);
  
  Radek.imiê = "Radek";
  Radek.nazwisko = "Radkowski";
  Radek.rokUrodzenia = 1980;
  Radek.wiek = 35;
  Radek.sta¿Pracy = 15;
  
  String InfoRadek = Radek.imiê+" "+ Radek.nazwisko
      +","+Radek.rokUrodzenia+","+ Radek.wiek
      +","+ Radek.sta¿Pracy;
  
  System.out.println("Pracownik numer dwa to:");
  System.out.println(InfoRadek);
  
  
  Bartek.imiê = "Bartosz";
  Bartek.nazwisko = "Janczyñski";
  Bartek.rokUrodzenia = 1988;
  Bartek.wiek= 30;
  Bartek.sta¿Pracy = 5;
  
  String InfoBartek = Bartek.imiê+" "+ Bartek.nazwisko
       +","+ Bartek.rokUrodzenia+","+Bartek.wiek
       +","+Bartek.sta¿Pracy;
  
  System.out.println("Pracownik numer trzy to:");
  System.out.println(InfoBartek);
  
  
  
 }

}
