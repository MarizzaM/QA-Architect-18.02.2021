package com.app;

public class TriangleAllEqualSides extends TriangleEqualSides{

    public TriangleAllEqualSides(float m_a) {
        super(m_a, m_a);
    }

    @Override
    public double getHekef() {
        return 3*m_a;
    }

    @Override
    public double getArea() {
        return Math.pow(m_a,2)*Math.sqrt(3)/4;
    }
}
