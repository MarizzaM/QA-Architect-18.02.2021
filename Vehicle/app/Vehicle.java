package com.app;

import lombok.Getter;
import lombok.Setter;

public class Vehicle {
    protected String m_model;
    protected float m_price;
    protected  String m_id_number;
    private @Getter @Setter float m_size;
    String m_garage_name;

    public Vehicle(String m_model, float m_price, String m_id_number, float m_size, String m_garage_name) {
        this.m_model = m_model;
        this.m_price = m_price;
        this.m_id_number = m_id_number;
        this.m_size = m_size;
        this.m_garage_name = m_garage_name;
    }

    public void carGo(){
        System.out.println("beep-beep...");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "m_model='" + m_model + '\'' +
                ", m_price=" + m_price +
                ", m_id_number='" + m_id_number + '\'' +
                ", m_size=" + m_size +
                ", m_garage_name='" + m_garage_name + '\'' +
                '}';
    }
}
