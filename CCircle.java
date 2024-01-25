package src.sh;
/**
 * The CCircle class represents a circle shape, which is a specific type of oval with equal horizontal and vertical radii.
 * It extends the COval class.
 * 
 * @author Dema Ben Jabr
 * @version 1.0
 * @since January 20, 2024
 */
class CCircle extends COval {

    /**
     * Initializes the instance of the CCircle class with a given radius.
     * CCircle passes the radius twice to the constructor of COval because a circle's horizontal and vertical radii are always equal.
     *
     * @param radius The radius of the circle.
     */
    public CCircle(int radius) {
        super(radius, radius);
    }

    @Override
    public String getInfo() {
        return "CIRCLE " + getHorizontalRadius();
    }
}