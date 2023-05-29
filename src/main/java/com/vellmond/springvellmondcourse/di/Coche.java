package com.vellmond.springvellmondcourse.di;

public class Coche {
    @Value("Ford")
    private String marca;
    private Integer modelo;
    private Motor motor;
    private Coche(){

    }

    public Coche(String marca,Integer modelo,Motor motor){
        this.marca=marca;
        this.modelo=modelo;
        this.motor=motor;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getMarca(){
        return marca;
    }

    public void setModelo(Integer modelo){
        this.modelo=modelo;
    }
    public Integer getModelo(){
        return modelo;
    }

    public void setMotor(Motor motor){
        this.motor=motor;
    }
    public Motor getMotor(){
        return motor;
    }

    @Override
    public String toString(){
        return "Coche [marca="+marca+", modelo="+modelo+", motor="+motor+"]";
    }
}
