package depthfirstsearch;

/**
 *
 * @author Evan Warren, Ben Finotti
 * @version CSCI-333
 * @see that this class is driver class
 * @serial HW8
 */
public class DFSDriver {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       boolean[][] dfsArray1 = new boolean [8][8];
       dfsArray1[0][0] = false;
       dfsArray1[0][1] = true;
       dfsArray1[0][2] = true;
       dfsArray1[0][3] = false;
       dfsArray1[0][4] = true;
       dfsArray1[0][5] = false;
       dfsArray1[0][6] = false;
       dfsArray1[0][7] = false;
       
       dfsArray1[1][0] = true;
       dfsArray1[1][1] = false;
       dfsArray1[1][2] = false;
       dfsArray1[1][3] = true;
       dfsArray1[1][4] = true;
       dfsArray1[1][5] = false;
       dfsArray1[1][6] = true;
       dfsArray1[1][7] = false;
       
       dfsArray1[2][0] = true;
       dfsArray1[2][1] = false;
       dfsArray1[2][2] = false;
       dfsArray1[2][3] = false;
       dfsArray1[2][4] = false;
       dfsArray1[2][5] = false;
       dfsArray1[2][6] = false;
       dfsArray1[2][7] = true;
       
       dfsArray1[3][0] = false;
       dfsArray1[3][1] = true;
       dfsArray1[3][2] = false;
       dfsArray1[3][3] = false;
       dfsArray1[3][4] = false;
       dfsArray1[3][5] = false;
       dfsArray1[3][6] = true;
       dfsArray1[3][7] = false;
       
       dfsArray1[4][0] = true;
       dfsArray1[4][1] = true;
       dfsArray1[4][2] = false;
       dfsArray1[4][3] = false;
       dfsArray1[4][4] = false;
       dfsArray1[4][5] = true;
       dfsArray1[4][6] = false;
       dfsArray1[4][7] = false;
       
       dfsArray1[5][0] = false;
       dfsArray1[5][1] = false;
       dfsArray1[5][2] = false;
       dfsArray1[5][3] = false;
       dfsArray1[5][4] = true;
       dfsArray1[5][5] = false;
       dfsArray1[5][6] = false;
       dfsArray1[5][7] = false;
       
       dfsArray1[6][0] = false;
       dfsArray1[6][1] = true;
       dfsArray1[6][2] = false;
       dfsArray1[6][3] = true;
       dfsArray1[6][4] = false;
       dfsArray1[6][5] = false;
       dfsArray1[6][6] = false;
       dfsArray1[6][7] = false;
       
       dfsArray1[7][0] = false;
       dfsArray1[7][1] = false;
       dfsArray1[7][2] = true;
       dfsArray1[7][3] = false;
       dfsArray1[7][4] = false;
       dfsArray1[7][5] = false;
       dfsArray1[7][6] = false;
       dfsArray1[7][7] = false;
       
        DepthFirstInterface dfsOb = new DepthFirstSearch(dfsArray1);
        dfsOb.depthFirstSearch();
        dfsOb.printDFS();
        
       boolean[][] dfsArray2 = new boolean [8][8];
       dfsArray2[0][0] = false;
       dfsArray2[0][1] = true;
       dfsArray2[0][2] = true;
       dfsArray2[0][3] = false;
       dfsArray2[0][4] = false;
       dfsArray2[0][5] = true;
       dfsArray2[0][6] = false;
       dfsArray2[0][7] = true;
       
       dfsArray2[1][0] = true;
       dfsArray2[1][1] = false;
       dfsArray2[1][2] = false;
       dfsArray2[1][3] = false;
       dfsArray2[1][4] = false;
       dfsArray2[1][5] = false;
       dfsArray2[1][6] = false;
       dfsArray2[1][7] = false;
       
       dfsArray2[2][0] = true;
       dfsArray2[2][1] = false;
       dfsArray2[2][2] = false;
       dfsArray2[2][3] = true;
       dfsArray2[2][4] = true;
       dfsArray2[2][5] = true;
       dfsArray2[2][6] = false;
       dfsArray2[2][7] = true;
       
       dfsArray2[3][0] = false;
       dfsArray2[3][1] = false;
       dfsArray2[3][2] = true;
       dfsArray2[3][3] = false;
       dfsArray2[3][4] = true;
       dfsArray2[3][5] = false;
       dfsArray2[3][6] = true;
       dfsArray2[3][7] = false;
       
       dfsArray2[4][0] = false;
       dfsArray2[4][1] = false;
       dfsArray2[4][2] = true;
       dfsArray2[4][3] = true;
       dfsArray2[4][4] = false;
       dfsArray2[4][5] = false;
       dfsArray2[4][6] = false;
       dfsArray2[4][7] = false;
       
       dfsArray2[5][0] = true;
       dfsArray2[5][1] = false;
       dfsArray2[5][2] = true;
       dfsArray2[5][3] = false;
       dfsArray2[5][4] = false;
       dfsArray2[5][5] = false;
       dfsArray2[5][6] = false;
       dfsArray2[5][7] = true;
       
       dfsArray2[6][0] = false;
       dfsArray2[6][1] = false;
       dfsArray2[6][2] = false;
       dfsArray2[6][3] = true;
       dfsArray2[6][4] = false;
       dfsArray2[6][5] = false;
       dfsArray2[6][6] = false;
       dfsArray2[6][7] = false;
       
       dfsArray2[7][0] = true;
       dfsArray2[7][1] = false;
       dfsArray2[7][2] = true;
       dfsArray2[7][3] = false;
       dfsArray2[7][4] = false;
       dfsArray2[7][5] = true;
       dfsArray2[7][6] = false;
       dfsArray2[7][7] = false;
       System.out.println("--------------BELOW IS THE 2ND TEST--------------");
       DepthFirstInterface dfsOb2 = new DepthFirstSearch(dfsArray2);
        dfsOb2.depthFirstSearch();
        dfsOb2.printDFS();
       
       boolean[][] dfsArray3 = new boolean [8][8];
       dfsArray3[0][0] = false;
       dfsArray3[0][1] = true;
       dfsArray3[0][2] = true;
       dfsArray3[0][3] = true;
       dfsArray3[0][4] = false;
       dfsArray3[0][5] = false;
       dfsArray3[0][6] = false;
       dfsArray3[0][7] = false;
       
       dfsArray3[1][0] = true;
       dfsArray3[1][1] = false;
       dfsArray3[1][2] = false;
       dfsArray3[1][3] = false;
       dfsArray3[1][4] = true;
       dfsArray3[1][5] = true;
       dfsArray3[1][6] = true;
       dfsArray3[1][7] = false;
       
       dfsArray3[2][0] = true;
       dfsArray3[2][1] = false;
       dfsArray3[2][2] = false;
       dfsArray3[2][3] = true;
       dfsArray3[2][4] = false;
       dfsArray3[2][5] = true;
       dfsArray3[2][6] = true;
       dfsArray3[2][7] = false;
       
       dfsArray3[3][0] = true;
       dfsArray3[3][1] = false;
       dfsArray3[3][2] = true;
       dfsArray3[3][3] = false;
       dfsArray3[3][4] = false;
       dfsArray3[3][5] = true;
       dfsArray3[3][6] = false;
       dfsArray3[3][7] = true;
       
       dfsArray3[4][0] = false;
       dfsArray3[4][1] = true;
       dfsArray3[4][2] = false;
       dfsArray3[4][3] = false;
       dfsArray3[4][4] = false;
       dfsArray3[4][5] = false;
       dfsArray3[4][6] = false;
       dfsArray3[4][7] = false;
       
       dfsArray3[5][0] = false;
       dfsArray3[5][1] = true;
       dfsArray3[5][2] = true;
       dfsArray3[5][3] = true;
       dfsArray3[5][4] = false;
       dfsArray3[5][5] = false;
       dfsArray3[5][6] = false;
       dfsArray3[5][7] = false;
       
       dfsArray3[6][0] = false;
       dfsArray3[6][1] = true;
       dfsArray3[6][2] = true;
       dfsArray3[6][3] = false;
       dfsArray3[6][4] = false;
       dfsArray3[6][5] = false;
       dfsArray3[6][6] = false;
       dfsArray3[6][7] = false;
       
       dfsArray3[7][0] = false;
       dfsArray3[7][1] = false;
       dfsArray3[7][2] = false;
       dfsArray3[7][3] = true;
       dfsArray3[7][4] = false;
       dfsArray3[7][5] = false;
       dfsArray3[7][6] = false;
       dfsArray3[7][7] = false;
       
       System.out.println("--------------BELOW IS THE 3RD AND FINAL TEST--------------");
       DepthFirstInterface dfsOb3 = new DepthFirstSearch(dfsArray3);
        dfsOb3.depthFirstSearch();
        dfsOb3.printDFS();
        
    }
}
