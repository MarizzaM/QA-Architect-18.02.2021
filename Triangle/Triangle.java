package com.app;

public class Triangle {
    protected float m_a;
    protected float m_b;
    protected float m_c;
    protected float m_h;

    public Triangle(float m_a, float m_b, float m_c, float m_h) {
        this.m_a = m_a;
        this.m_b = m_b;
        this.m_c = m_c;
        this.m_h = m_h;
    }


    public double getArea(){
        return this.m_c*this.m_h/2;
    }

    public double getHekef(){
        return this.m_a+this.m_b+this.m_c;
    }
}
