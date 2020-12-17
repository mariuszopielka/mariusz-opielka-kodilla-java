package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeTests() {

        System.out.println("TESTS BEGIN");
    }

    @AfterAll
    public static void afterTests() {

        System.out.println("TESTS FINISHED");
    }

    @BeforeEach
    public void beforeEach() {
        testCounter++;
        System.out.println("Test number: " + testCounter);
    }

    @Test
    public void testAddFigure() {
        //given
        ShapeCollector testList = new ShapeCollector(new ArrayList<>(Arrays.asList(new Circle(23),
                new Triangle(12, 18))));
        ShapeCollector expectedList = new ShapeCollector(new ArrayList<>(Arrays.asList(new Circle(23),
                new Triangle(12, 18), new Square(12))));
        int expectedListSize = expectedList.getShapeList().size();

        //when
        testList.addFigure(new Square(12));
        int actualListSize = testList.getShapeList().size();

        //then
        Assertions.assertEquals(expectedListSize, actualListSize);
    }

    @Test
    public void testRemoveFigure() {
        //given
        Circle circle = new Circle(23);
        Triangle triangle = new Triangle(12, 18);
        Square square = new Square(12);

        ShapeCollector testList = new ShapeCollector(new ArrayList<>(Arrays.asList(circle, triangle, square)));
        ShapeCollector expectedList = new ShapeCollector(new ArrayList<>(Arrays.asList(circle, triangle)));

        int expectedListSize = expectedList.getShapeList().size();

        //when
        testList.removeFigure(square);
        int actualListSize = testList.getShapeList().size();

        //then
        Assertions.assertEquals(expectedListSize, actualListSize);
    }

    @Test
    public void testGetFigure() {

        //given
        Circle circle = new Circle(23);
        Triangle triangle = new Triangle(12, 18);
        Square square = new Square(12);

        ShapeCollector testList = new ShapeCollector(new ArrayList<>(Arrays.asList(circle, triangle, square)));

         //when
        Shape shape1 = testList.getFigure(0);
        Shape shape2 = testList.getFigure(1);
        Shape shape3 = testList.getFigure(2);

        //then
        Assertions.assertEquals(circle, shape1);
        Assertions.assertEquals(triangle, shape2);
        Assertions.assertEquals(square, shape3);
        }

    @Test
    public void testShowFigures() {
        Circle circle = new Circle(23);
        Triangle triangle = new Triangle(12,18);
        Square square = new Square(12);

        ArrayList<Shape> testList = new ArrayList<>(Arrays.asList(circle, triangle, square));

        ShapeCollector shapeCollection = new ShapeCollector(testList);

        ArrayList<Shape> result = new ArrayList<>(shapeCollection.showFigures());
        Assertions.assertEquals(testList, result);
        }
    }

