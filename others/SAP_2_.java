/*
SAP 2)


You're given an mxn array. The number 9 is the cheese, the number 0 is a wall and the number 1 is a path. You are the mouse and start in the top left corner a[0][0]. You need to find out whether there is a path to the cheese

output formate:
boolean 

input:
1 0 0 0 
1 1 0 0
0 1 1 9
0 0 0 0
 
output:
true


input:
1 0 0 9 
1 1 0 1
0 1 1 1
0 0 0 1

ouput:
false;

NOTE:there will be only one cheese in given maze 
*/
public class Main {
    public static boolean find(int[][] a, int i, int j, int n, int m, int[][] temp) {
        if (i < 0 || i >= n || j < 0 || j >= m || a[i][j] == 0 || temp[i][j] == 1) {
            return false;  // Out of bounds or wall or already visited
        }

        if (a[i][j] == 9) {
           
            return true;  // Found the cheese
        }

        temp[i][j] = 1;  // Mark as visited

        // Recur to the right
        if (find(a, i+1, j, n, m, temp)) {
            return true;
        }

        // Recur to the bottom
        if (find(a, i, j-1, n, m, temp)) {
            return true;
        }
         if (find(a, i, j+1, n, m, temp)) {
            return true;
        }
         if (find(a, i-1, j, n, m, temp)) {
            return true;
        }

        temp[i][j] = 0;  // Revert the mark if no path found
        return false;
    }

    public static boolean com(int[][] a, int n, int m) {
        int[][] temp = new int[n][m];
        return find(a, 0, 0, n, m, temp);
    }

    public static void main(String[] args) {
        int[][] a = {{1, 0, 0, 9}, {1, 1, 1, 0}, {0, 1, 1,1 }, {0, 0, 0, 0}};//give your input here
        System.out.println(com(a, a.length, a[0].length));
    }
}




