package src.sh;

import java.util.*;

/**
 * The Main class creates a list of 10 random, non-duplicate shapes and displays them on the console.
 * 
 * @author Dema Ben Jabr
 * @version 1.0
 * @since January 20, 2024
 */
public class Main {

     /**
     * Generates a list of random shapes using the generateRandomShapes method.
     * Creates CCanvas instance with the list of shapes and then displays them.
     */
    public static void main(String[] args) {
        List<CShape> randomShapes = generateRandomShapes();
        CCanvas canvas = new CCanvas(randomShapes);
        canvas.displayShapes();
    }

    /**
     * Generates a list of 10 random non-duplicate shapes using a while loop. 
     * Each shape Oval, Circle, Rectangle, or Square is created with random dimensions and added to the list.
     * Checks for duplicates using the 'contains' method before adding the new shapes to the list.
     *
     * @return The list of random shapes.
     */
    private static List<CShape> generateRandomShapes() { 
        List<CShape> shapes = new ArrayList<>();
        Random random = new Random();

        while (shapes.size() < 10) {
            int shapeType = random.nextInt(4); // 0: Oval, 1: Circle, 2: Rectangle, 3: Square

            switch (shapeType) {
                case 0:
                    int ovalHorizontalRadius = random.nextInt(100) + 1;
                    int ovalVerticalRadius = random.nextInt(100) + 1;
                    COval oval = new COval(ovalHorizontalRadius, ovalVerticalRadius);
                    if (!shapes.contains(oval)) {
                        shapes.add(oval);
                    }
                    break;
                case 1:
                    int circleRadius = random.nextInt(100) + 1;
                    CCircle circle = new CCircle(circleRadius);
                    if (!shapes.contains(circle)) {
                        shapes.add(circle);
                    }
                    break;
                case 2:
                    int rectangleLength = random.nextInt(100) + 1;
                    int rectangleWidth = random.nextInt(100) + 1;
                    CRectangle rectangle = new CRectangle(rectangleLength, rectangleWidth);
                    if (!shapes.contains(rectangle)) {
                        shapes.add(rectangle);
                    }
                    break;
                case 3:
                    int squareSide = random.nextInt(100) + 1;
                    CSquare square = new CSquare(squareSide);
                    if (!shapes.contains(square)) {
                        shapes.add(square);
                    }
                    break;
            }
        }

        return shapes;
    }
}
