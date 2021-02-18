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
        double h = Math.sqrt((p*(p-m_b)*(p-m_b)*(p-m_c))/m_a);
        return this.m_c*h/2;
    }

    public double getHekef(){
        return this.m_a+this.m_b+this.m_c;
    }
}
