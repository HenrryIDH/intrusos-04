package codigo;

/* Si el package es codgio cual es el path es decir el punto de partida se buscan todas las clases en java*/

 class Suma{
   private int x;
   private int y; 
   public Suma(int xParam, int yParam){
      x = xParam;
      y = yParam;
    }
    public int operar() {
      return x + y;
    }
 }

 public class Hola{
  static int x = 10;
  public static void main (String[] args){
   // Como sumo 4,6,5
   System.out.println(suma(suma(4,6),5));
   // Como sumo 4,6,5 con objeto suma
   System.out.println(
   new Suma(
     new Suma(4,6).operar(),
     5
     ).operar()
   );
   
 }
 private static int suma(int x, int y){
   return x + y;
 }
 public static void decirAlgo(){
   System.out.println(x);
 }

 public static void decirAlgo2(){
    System.out.println("hola amigos!!!");
 }
}