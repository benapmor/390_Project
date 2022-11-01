package com.example.firebasetest;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Values {
    private float ir;
    private float sensor;
    private float floaty;
    private int kek;
    private int sens;

    public Values(){}
    public float getIR(){return ir;}
    public float getSensor(){return sensor;}
    public float getFloaty(){return floaty;}
    public int getKek(){return kek;}
    public int getSens(){return sens;}

    public void setIr(float RI){ir=RI;}
    public void setSensor(float sensor) {this.sensor = sensor;}
    public void setFloaty(float floaty) {this.floaty = floaty;}
    public void setKek(int kek) {this.kek = kek;}
    public void setSens(int senscup){sens=senscup;}
}
