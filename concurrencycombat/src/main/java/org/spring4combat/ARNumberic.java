package org.spring4combat;

import org.springframework.context.annotation.Bean;

public class ARNumberic {

    protected int rollNum;

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    @Bean
    public ARNumberic getARNumberic(){
        ARNumberic arNumberic = new ARNumberic();
        arNumberic.rollNum = (int) Math.round(Math.random() * 100);
        return arNumberic;
    }
}
