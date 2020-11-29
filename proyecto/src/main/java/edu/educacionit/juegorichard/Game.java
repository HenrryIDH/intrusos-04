package edu.educacionit.juegorichard;

/**
 *
 * @author Ricardo
 */
class Game {
    private final String validOptions[] = {"Tijera","Piedra","Papel"};
    private final int match[][] = {{0,2,1},{1,0,2},{2,1,0}};
    private final String results[] = {"Empate","ganas","Pierdes"};
    private int matchResult = 0;
    private final String MACHINE_OPTION = "La PC seleccionó: ";
    
    Machine machine = new Machine();
    Player player = new Player();
    Score score = new Score();
    
    public Game(int turns, UserInput ui) throws Exception {
        playGame(turns, ui);
    }
    
   
    private void playGame(int turns, UserInput ui) throws Exception{     
        for (int i = 0; i < turns; i++) {
            int playerOption = player.getPlayerOption(i,turns, ui);
            int machineOption = machine.getMachineOption();
            this.matchResult += getMatch(playerOption, machineOption);
        }
        score.getFinalResult(this.matchResult);   
    }
    
    
    private int getMatch(int playerOption, int machineOption){
        
        System.out.println(MACHINE_OPTION + this.validOptions[machineOption]);
        System.out.println("!!"+ this.results[this.match[playerOption][machineOption]]+"\n");
        
        int result = this.match[playerOption][machineOption];
        if(result == 2){
            result = -1;
        }
        
        return result;
    }
}
