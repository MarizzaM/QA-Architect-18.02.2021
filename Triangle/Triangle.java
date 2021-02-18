package com.app;

public class Triangle {
    protected float m_a;
    protected float m_b;
    protected float m_c;

    public Triangle(float m_a, float m_b, float m_c) {
        this.m_a = m_a;
        this.m_b = m_b;
        this.m_c = m_c;
    }

    public double getArea(){
        float p = (m_a + m_b + m_c)/2;
        return Math.sqrt(p*(p-m_b)*(p-m_b)*(p-m_c));
    }

    public double getHekef(){
        return this.m_a+this.m_b+this.m_c;
    }
}
