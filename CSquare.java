package src.sh;
/**
 * The CSquare class represents a square shape, which is a specific type of rectangle where all sides are of equal length.
 * It extends the CRectangle class.
 * 
 * @author Dema Ben Jabr
 * @version 1.0
 * @since January 20, 2024
 */
class CSquare extends CRectangle {

    /**
     * Initializes the instance of the CSquare class with a side length.
     * CSquare passes the squareSideLength twice to the constructor of CRectangle because the length and width are the same in the square.
     *
     * @param squareSideLength The side length of the square.
     */
    public CSquare(int squareSideLength) {
        super(squareSideLength, squareSideLength);
    }

    @Override
    public String getInfo() {
        return "SQUARE " + getLength() + "x" + getWidth();
    }
}
