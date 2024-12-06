package org.howard.edu.lsp.finalexam.question3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeRendererTest {

    @Test
    void testCircleRendering() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("circle");
        assertNotNull(shape);
        assertTrue(shape instanceof Circle);
    }

    @Test
    void testRectangleRendering() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("rectangle");
        assertNotNull(shape);
        assertTrue(shape instanceof Rectangle);
    }

    @Test
    void testTriangleRendering() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("triangle");
        assertNotNull(shape);
        assertTrue(shape instanceof Triangle);
    }

    @Test
    void testUnknownShapeRendering() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("hexagon");
        assertNull(shape);
    }

    @Test
    void testSingletonInstance() {
        ShapeFactory factory1 = ShapeFactory.getInstance();
        ShapeFactory factory2 = ShapeFactory.getInstance();
        assertSame(factory1, factory2);
    }
}