package depthfirstsearch;

/**
 *
 * @author Evan Warren, Ben Finotti
 * @version CSCI-333
 * @see that this class is DepthFirstSearch class this class is to do the work
 * of the DepthFirstSearch
 * @serial HW8
 */
public class DepthFirstSearch implements DepthFirstInterface {

    private Vertex[] vertex;
    private boolean[][] adjarray;
    private int time;

    /**
     *
     * @param input this is the input of the boolean array
     * @see that this method is scanning through the input array and looking to
     * see the amount of columns and to separate those into v(vertexes)
     */
    public DepthFirstSearch(boolean[][] input) {
        adjarray = input;
        vertex = new Vertex[adjarray.length];
        time = 0;
        for (int i = 0; i < vertex.length; i++) {
            vertex[i] = new Vertex();
        }

    }

    /**
     *
     * @param u is the original vertex
     * @param index is the index of the original vertex
     * @see that this method is to parse through the vertex at its set index to
     * look through the color to see it is has been visited or not if the color
     * is white(0) then it is set as the parent then changes the color to
     * black(2), the recursive call at the end keeps it going until it finds a
     * parent or until everything has been searched.
     */
    private void DFSVisit(Vertex u, int index) {
        time++;
        u.setD(time);
        u.setColor(1);
        for (int i = 0; i < adjarray[index].length; i++) {
            if (adjarray[index][i]) {
                if (vertex[i].getColor() == 0) {
                    vertex[i].setP(u);
                    DFSVisit(vertex[i], i);
                }
            }
        }
        u.setColor(2);
        time++;
        u.setF(time);
    }

    /**
     * @see that this method is the override for DepthFirstSearch, this method
     * it to parse through a tree of 1 component, then makes or produces one
     * depth first tree that will be rooted at vertex[i]
     */
    @Override
    public void depthFirstSearch() {
        for (int i = 0; i < vertex.length; i++) {
            if (vertex[i].getColor() == 0) {
                DFSVisit(vertex[i], i);
            }
        }
    }

    /**
     * @see that this method is the override for printDFS, this method is
     * made to print the depth first tree, consisting of the current number,
     * the first(visited) time stamp, the final time stamp, the parent of
     * the vertex (except for the root vertex), and the final color of the vertex
     * Color 0 is WHITE, Color 1 is GREY, Color 2 is BLACK. All correctly visited
     * vertexes are BLACK(2).
     */
    @Override
    public void printDFS() {
        for (int i = 0; i < vertex.length; i++) {
            System.out.println("Your current number is: " + (i + 1));
            System.out.println("The first time stamp is: " + vertex[i].getD());
            System.out.println("The final time stamp is: " + vertex[i].getF());
            System.out.println("Your current color is: " + vertex[i].getColor());
            if (vertex[i].getP() != null) {
                for (int j = 0; j < vertex.length; j++) {
                    if (i != j && vertex[i].getP().equals(vertex[j])) {
                        System.out.println("Your parent is: " + (j + 1));

                    } else {
                        //System.out.println("null");
                    }
                }
            }
            System.out.println();
        }
    }

}
