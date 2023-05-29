package com.vellmond.springvellmondcourse.di;

public class Motor {
    private String marca;
    private Integer modelo;

    public Motor(){

    }
    public Motor(String marca, Integer modelo){
        this.marca=marca;
        this.modelo=modelo;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public Integer getModelo(){
        return modelo;
    }

    @Override
    public String toString(){
        return "Motor [marca="+marca+", modelo="+modelo+"]";
    }
}
