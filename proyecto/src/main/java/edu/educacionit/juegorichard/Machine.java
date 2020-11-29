package edu.educacionit.juegorichard;

import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Ricardo
 */
class Machine {
    public Machine(){
    }
    protected int getMachineOption(){
        return ThreadLocalRandom.current().nextInt(0, 2 + 1);
    } 
}
