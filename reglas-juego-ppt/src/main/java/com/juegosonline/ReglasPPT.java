package com.juegosonline;

public class ReglasPPT {
    // 1. Piedra
    // 2. Papel
    // 3. Tijera
    
    // Output es 0. Empate 1; Gana 1; 2. Gana2;
    
    public static int jugar(int j1, int j2) {
        if (j1 == j2){
            return 0;
        }
        
        switch (j1) {
            //Piedra
            case 1 : 
                if (j2 == 3){
                    return 1;
                }
                else {
                    return 2;
                }
            //Papel
            case 2 :
                if (j2 == 1){
                    return 1;
                }
                else {
                    return 2;
                }
            //Tijera    
            case 3 :
                if (j2 == 1){
                    return 2;
                }
                else {
                    return 1;
                }
        }
        return 0;
    }
}
