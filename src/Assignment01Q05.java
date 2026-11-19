public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) { 
        int n = m.length;
        int[] dist = new int[n];
        for (int k=0 ; k<dist.length ;k++)
            dist[k] = (-1); 
        dist[i] = 0;

        int[] queue = new int[n];
        int head = 0;
        int tail = 0;
        queue[tail] = i; // i is in the queue
        tail++; // tail is updated





        return -1;
        if (i == j)
            return 0; 
        }
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}