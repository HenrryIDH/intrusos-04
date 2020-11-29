package edu.educacionit.juegojoaquin;


import com.juegosonline.ReglasPPT;
import java.util.Scanner;

public class PPTJoaquin implements Runnable {
    public void run (){
        String arrElementos[] = new String[] { "Piedra", "Papel", "Tijera" };
        
        //MENU
        System.out.println("Elija una opcion e ingrese el numero:");
        System.out.println("1- Piedra");
        System.out.println("2- Papel");
        System.out.println("3- Tijera");
        
        //entrada del teclado
        Scanner sc = new Scanner(System.in);
        int opcion ;
        opcion = sc.nextInt();
        
        //Numero Aleatoria
        int aleatorio = (int)(Math.random()*3+1);
        String out = String.join("La PC ha elegido: ", arrElementos[aleatorio-1]);
        System.out.println(out);
        
        int resultado = ReglasPPT.jugar(aleatorio, opcion);
        
        if (resultado == 0) {
            System.out.println("EMPATE !!!");
        }
        
        if (resultado == 1) {
            System.out.println("PERDISTE !!!");
            System.out.println(
                String.join(" ", arrElementos[aleatorio-1], "vence a", arrElementos[opcion-1])
            );
        }
        
        if (resultado == 2) {
            System.out.println("GANASTE !!!");
            System.out.println(
                String.join(" ", arrElementos[opcion-1], "vence a",arrElementos[aleatorio-1])
            );
        }
    }
}
