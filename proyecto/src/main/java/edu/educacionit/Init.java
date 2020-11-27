package edu.educacionit;

import com.intrusos.Menu;

class A{
    
    public A(){
        System.out.println("AHORA !!!");
    }
    public String dameStr(){
        if(2 == 1 + 3){
            return "holli";
        } else {
            return "Chau";
        }
    }
}

public class Init{
    public static void main(String[] args){
        Menu m = new Menu();
        m.mostrarMenu();
         
    }
}
