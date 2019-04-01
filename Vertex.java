package depthfirstsearch;

/**
 *
 * @author Evan Warren, Ben Finotti
 * @version CSCI-333
 * @see that this class is Vertex class, it is to handle the process required to
 * make an Vertex object
 * @serial HW8
 */
public class Vertex {

    private int d;
    private int f;
    private Vertex p;
    private int color;

    /**
     * initializes the values above so that we don't have to do that later 
     */
    public Vertex() {
        d = 0; // Timestamp 'd' for discovery of the node
        f = 0; // Timestamp 'f' for a finished node
        p = null; // Parent of the vertex
        color = 0;
    }

    /**
     * @see that this gets the d timestamp
     * @return's the d timestamp
     */
    public int getD() {
        return d;
    }

    /**
     *
     * @param d sets the d timestamp
     */
    public void setD(int d) {
        this.d = d;
    }

    /**
     * @see htat this gets the f timestamp
     * @return's the f timestamp
     */
    public int getF() {
        return f;
    }

    /**
     *
     * @param f sets the f timestamp
     */
    public void setF(int f) {
        this.f = f;
    }

    /**
     * @see that this gets the P(parent) of the vertex
     * @return's the p of the vertex
     */
    public Vertex getP() {
        return p;
    }

    /**
     * @see that this sets the p(parent) of the vertex
     * @param p -- parent of the vertex
     */
    public void setP(Vertex p) {
        this.p = p;
    }

    /**
     * @see that this gets the color of the selected parent or child
     * @return's the color of the parent or child
     */
    public int getColor() {
        return color;
    }

    /**
     *
     * @param color this sets the color of the parent or child selected colors
     * are as follows 0 = white, 1 = gray, 2 = black
     */
    public void setColor(int color) {
        this.color = color;
    }

}
