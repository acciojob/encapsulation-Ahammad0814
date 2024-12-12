package com.driver;

public class RWOnly {
    private int variable;

    public int setter(int num){
        this.variable = num;
    }
    public int getter(){
        return variable;
    }
}
