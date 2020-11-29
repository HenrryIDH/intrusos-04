package edu.educacionit.juegorichard;

import java.util.Scanner;
/**
 *
 * @author Ricardo
 */
class Player {
    private final String PLAYER_OPTION_MESSAGE = "-----------------\n"
                    + "Elije una opción !!! y presiona enter !!!\n"
                    + " 1. Piedra, 2. Papel o 3.Tijera \n";
    
    Scanner sc = new Scanner(System.in);
    
    public Player(){
    }
    
    protected int getPlayerOption(int turn, int totalTurns, UserInput ui) throws Exception{
        System.out.println("turn "+(++turn)+" of "+totalTurns+"\n"
                    + PLAYER_OPTION_MESSAGE);
        int option = ui.getUserInput(3);
             
        if(option == 3){
            option = 0;
        }   
        return option;
    }
}
