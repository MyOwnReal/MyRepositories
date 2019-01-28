package AppData;

public class Clients {
 private int BeerPrice = 5;

 private int Client1 = 100;
 private int Client2 = 25;
 private int Client3 = 55;

 private int Beer1 = 500;
 

 public void Client1Money() {
  int C1o = Beer1*2;
  int C1$ = Client1-2*BeerPrice;
  System.out.println("Client one have " + Client1 + "$");
  System.out.println("Client one order a:"+C1o+" ml"+" off beer");
  System.out.println("Money Left "+C1$+ " $");
 }

 public void Client2Money() {
  int C2o = Beer1*5;
  int C2$ = Client2-5*BeerPrice;
  System.out.println("Client two have " + Client2 + "$");
  System.out.println("Client two order a:"+C2o+" ml"+" off beer");
  System.out.println("Money Left "+C2$+" $");
 }

 public void Client3Money() {

  int C3o = Beer1*10;
  int C3$ = Client2-10*BeerPrice;
  
  System.out.println("Client three have " + Client3 + " $");
  System.out.println("Client three order a:"+C3o+" ml"+" off beer");
  
  if (C3$<=0){
   System.out.println("Client three had no money");
  }
  else{
   System.out.println("Money Left "+C3$+" $");
  }
  
  }
 }
