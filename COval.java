package src.sh;
/**
 * The COval class represents an oval shape with horizontal and vertical radii and it extends the CShape abstract class.
 * 
 * @author Dema Ben Jabr
 * @version 1.0
 * @since January 20, 2024
 */
class COval extends CShape {
    private final int horizontalRadius;
    private final int verticalRadius;

    /**
     * Constructs an oval shape with given horizontal radius and vertical radius.
     *
     * @param horizontalRadius The horizontal radius of the oval.
     * @param verticalRadius   The vertical radius of the oval.
     */
    public COval(int horizontalRadius, int verticalRadius) {
        super();
        this.horizontalRadius = horizontalRadius;
        this.verticalRadius = verticalRadius;
    }

    /**
     * @return The horizontal radius of the oval.
     */
    public int getHorizontalRadius() {
        return horizontalRadius;
    }

    /**
     * @return The vertical radius of the oval.
     */
    public int getVerticalRadius() {
        return verticalRadius;
    }


    @Override
    public String getInfo() {
        return "OVAL " + horizontalRadius + "x" + verticalRadius;
    }
}