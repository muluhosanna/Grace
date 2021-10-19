package com.java.bankapplication;

public interface IbaseRate {
    default double  getBaseRate(){
        return 2.5;
    }
}
