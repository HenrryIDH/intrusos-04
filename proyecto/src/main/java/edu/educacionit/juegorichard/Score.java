package edu.educacionit.juegorichard;
/**
 *
 * @author Ricardo
 */
class Score {
    private final String WIN = "Ganaste el juego";
    private final String DRAW = "Empataste el juego";
    private final String LOSE = "Perdiste el juego";
    public Score(){
    }
    
    protected void getFinalResult(int matchResult){
        if(matchResult < 0){ 
            System.out.println(LOSE);
        }else if(matchResult == 0){
            System.out.println(DRAW);
        }else{
            System.out.println(WIN);
        }
    } 
}
