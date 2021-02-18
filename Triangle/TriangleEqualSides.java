package com.app;

public class  TriangleEqualSides extends Triangle {

    public TriangleEqualSides(float m_a, float m_c) {
        super(m_a, m_a, m_c);
    }

    @Override
    public double getHekef() {
        return 2*m_a + m_c;
    }

}
