/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livecode;

/**
 *
 * @author HP VICTUS
 */
public class reguler {
    String tipekamar;
    int hargakamar = 100000;
    String namapenyewa;
    int lama;
    String member;
    
    public void settipekamar(String tipekamar){
        this.tipekamar = tipekamar;
    }
    
    public String gettipekamar(){
        return tipekamar;
    }
    
    public void sethargakamar(int hargakamar){
        this.hargakamar = hargakamar;
    }
    
    public int gethargakamar(){
        return hargakamar * lama  ;
    }
    
    public void setnamapenyewa(String namapenyewa){
        this.namapenyewa = namapenyewa;
    }
    
    public String getnamapenyewa(){
        return namapenyewa;
    }
    
    public int diskon(){
        if (gethargakamar() > 700000){
            return hargakamar * 7/100;
        } 
        else if (gethargakamar() > 500000) {
            return hargakamar * 5/100;
        } else {
            return hargakamar;
        }  
    }
    public int lamasewa(){
        if (lama > 7){
            return hargakamar * 10/100;
        }else {
            return 0;
        }
    }
    public int diskontambahan(){
        if (member == "y"){
            return hargakamar * 5/100;
        }else{
            return 0;
        }
    }
}
    

        
        
        
    
    

