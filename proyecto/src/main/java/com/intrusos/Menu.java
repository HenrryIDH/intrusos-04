
package com.intrusos;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class Menu {
    public void mostrarMenu(){
    // aca voy a tener un menu y con ese menu voy a instanciar clases.
    //Mostar el Menu
    
    //leer el archivo de texto
    
        String[] arrMenu = null;
        String[] arrClases = null;
        try{
            List<String> lineas = FileUtils.readLines(new File("/var/config/instrusos/menu.txt"),"utf-8");
            arrMenu = new String[lineas.size()];
            arrClases = new String[lineas.size()];
            
            System.out.println("Menu Principal (Ingrese una Opcion)");
            for(String linea : lineas){
                //System.out.println(linea);
                String[] dosElementos = linea.split(":::");
                System.out.print("   ");
                System.out.println(dosElementos[0]);
                //System.out.println(dosElementos[1]);
                
            }
            Scanner scanner = new Scanner(System.in);
            String st = scanner.nextLine();
            Integer x = Integer.parseInt(st);
            if (x >= 1 && x <= lineas.size()){
                System.out.println("La opcion es valida");
                return;
                
            }
            System.out.println("La opcion NO es valida");
        }
        catch (Exception ex){
            System.out.println("NO SE PUDO LEER EL ARCHIVO DEL MENU");
        }

    }
}

