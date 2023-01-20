package com;

public class Luas {
    int alas;
    int tinggi;
    
    public void setAlas(int alas){
      this.alas = alas;
    }
    
    public void setTinggi(int tinggi){
      this.tinggi = tinggi;
    }
    
    public int getAlas(){
      return this.alas;
    }
    public int getTinggi(){
      return this.tinggi;
    }
    public double getLuas(){
      return 0.5 * this.alas * this.tinggi;
    }
  }

