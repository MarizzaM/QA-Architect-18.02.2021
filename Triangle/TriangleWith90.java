package com.app;

public class TriangleWith90 extends Triangle{

    public TriangleWith90(float m_a, float m_b, float m_c) {
        super(m_a, m_b, m_c);
    }

    @Override
    public double getArea() {
        return m_a*m_b/2;
    }
}
