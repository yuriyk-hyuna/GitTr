package com.hyuna.bustest;

/**
 * Created by Iurii on 3/11/2015.
 */
public class TEvent {
    private final int b;
    private final String a;

    public TEvent(String a, int b) {
        this.a=a;
        this.b=b;
    }

    public int getB() {
        return b;
    }

    public String getA() {
        return a;
    }
}
