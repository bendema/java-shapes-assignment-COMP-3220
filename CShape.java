package src.sh;
/**
 * CShape class is an abstract blueprint for different shapes.
 * It doesn't represent any shape itself. But, it is a general class that gives a unique ID every time a new shape is created.
 * 
 * @author Dema Ben Jabr
 * @version 1.0
 * @since January 20, 2024
 */
abstract class CShape {
    private static int counter = 0;
    private final int id;

    /**
     * Constructs a new shape and assigns a unique ID.
     * When we make a new shape, it adds 1 to the counter then assign it to the shape's ID.
     */
    public CShape() {
        this.id = ++counter;
    }

    /**
     * @return The unique ID of the shape.
     */
    public int getId() {
        return id;
    }

    /**
     * Since different shapes have different info/details, 
     * this abstract method ensures that each subclass of CShape must provide an implementation to describe itself. 
     *
     * @return A string containing the info about the shape.
     */
    public abstract String getInfo();
}

