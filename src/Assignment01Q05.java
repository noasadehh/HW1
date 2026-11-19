public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) { 
        int n = m.length;
        if (i == j)
            return 0;
        int[] dist = new int[n];
        for (int k=0 ; k<dist.length ;k++)
            dist[k] = (-1); 
        dist[i] = 0;

        int[] queue = new int[n];
        int head = 0;
        int tail = 0;
        queue[tail] = i; // i is in the queue
        tail++; // tail is updated
        while (head != tail) {
            int u = queue[head];
            head ++;
            for (int v=0; v<m[u].length ; v++){
            if (m[u][v] == 1 && dist[v] == (-1)){
                dist[v] = dist[u] + 1;
                if (v == j)
                    return dist[v];
                queue[tail] = v;
                tail ++; 
            }
            }
        }
        return -1;

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