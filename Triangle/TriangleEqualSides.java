package com.app;

public class  TriangleEqualSides extends Triangle {

    public TriangleEqualSides(float m_a, float m_c, float m_h) {
        super(m_a, m_a, m_c, m_h);
    }

    @Override
    public double getHekef() {
        return 2*m_a + m_c;
    }

}
