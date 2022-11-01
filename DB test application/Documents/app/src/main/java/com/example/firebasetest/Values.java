package com.example.firebasetest;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Values {
    private double ir;
    private double sensor;
    private double floaty;
    private int kek;
    private int sens;

    public Values(){}
    public double getIR(){return ir;}
    public double getSensor(){return sensor;}
    public double getFloaty(){return floaty;}
    public int getKek(){return kek;}
    public int getSens(){return sens;}

    public void setIr(double RI){ir=RI;}
    public void setSensor(double sensor) {this.sensor = sensor;}
    public void setFloaty(double floaty) {this.floaty = floaty;}
    public void setKek(int kek) {this.kek = kek;}
    public void setSens(int senscup){sens=senscup;}
}
