package src.sh;
/**
 * The CRectangle class represents a rectangle shape and it extends the CShape abstract class.
 * 
 * @author Dema Ben Jabr
 * @version 1.0
 * @since January 20, 2024
 */
class CRectangle extends CShape {
    private final int length;
    private final int width;

    /**
     * Constructs a rectangle shape with given length and width
     * By calling super(); It automatically gets a unique ID from its superclass (CShape). 
     *
     * @param length The length of the rectangle.
     * @param width  The width of the rectangle.
     */
    public CRectangle(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }

    /**
     * @return The length of the rectangle.
     */
    public int getLength() {
        return length;
    }

    /**
     * @return The width of the rectangle.
     */
    public int getWidth() {
        return width;
    }

    @Override
    public String getInfo() {
        return "RECTANGLE " + length + "x" + width;
    }
}