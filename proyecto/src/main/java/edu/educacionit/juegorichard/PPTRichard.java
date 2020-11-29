package edu.educacionit.juegorichard;
/**
 *
 * @author Ricardo
 */
public class PPTRichard implements Runnable {

    public void run() {
        //System.out.println("Aca estaria el juego... si supiera programar en java");
        UserInput userInput = new UserInput();
        try {
            Menu(userInput);
        } catch (Exception e) {
            //                             falta completar
        }
    }

    private void Menu(UserInput ui) throws Exception {
        int option;
        do {
            MostrarMenu();
            option = ui.getUserInput(1);
            if (option == 1) {
                NumeroPartidas();
                int turns = ui.getUserInput(20);
                Game game = new Game(turns, ui);
            }
        } while (option != 0);
    }

    public static void MostrarMenu() {
        System.out.println("-----------------\n"
                + " Piedra, Papel o Tijera (escribe una opción y presiona enter) \n"
                + "1. Jugar \n"
                + "0. Salir");
    }

    public static void NumeroPartidas() {
        System.out.println("-----------------\n"
                + " escribe un número de partidas para jugar \n");
    }

}
