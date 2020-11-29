package edu.educacionit.juegorichard;

import java.util.Scanner;
/**
 *
 * @author Ricardo
 */
public class UserInput {
    Scanner sc = new Scanner(System.in);
    private final String INVALID_OPTION = "Opción inválida.";
    private final String ONLY_NUMBERS = "Sólo opciones numéricas.";
    
    public UserInput(){
    }
    
  
    protected int getUserInput(int max) throws Exception{       
        int option;
            try {
                String inputOption = sc.nextLine();
                option = Integer.parseInt(inputOption);
                if(option < 0 || option > max){
                    System.out.println(INVALID_OPTION);
                    option = getUserInput(max);
                }
            } catch (NumberFormatException e) {
                System.out.println(ONLY_NUMBERS);
                option = getUserInput(max);
            }    
        return option;
    }
}
