package src.sh;
import java.util.*;

/**
 * The CCanvas class represents a canvas that contains a list of shapes.
 * 
 * @author Dema Ben Jabr
 * @version 1.0
 * @since January 20, 2024
 */
class CCanvas {
    private final List<CShape> shapes;

    /**
     * Constructs a canvas with an initial list of shapes.
     *
     * @param shapes which is the list of shapes that will be added to the canvas.
     */
    public CCanvas(List<CShape> shapes) {
        this.shapes = new ArrayList<>(shapes);
    }

    /**
     * Displays info about each shape on the canvas to the console.
     */
    public void displayShapes() {
        System.out.println("\nCanvas has the following random shapes:\n");
        for (CShape shape : shapes) {
            System.out.println("Shape " + shape.getId() + ": " + shape.getInfo());
        }
    }
}
