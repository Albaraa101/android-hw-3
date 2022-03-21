package com.example.myapplication;

public class Programs {

    String programName;
    int programImage;
    double programPrice;

    public Programs(String programName, int programImage, double programPrice) {
        this.programName = programName;
        this.programImage = programImage;
        this.programPrice = programPrice;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getProgramImage() {
        return programImage;
    }

    public void setProgramImage(int programImage) {
        this.programImage = programImage;
    }

    public double getProgramPrice() {
        return programPrice;
    }

    public void setProgramPrice(double programPrice) {
        this.programPrice = programPrice;
    }
}
