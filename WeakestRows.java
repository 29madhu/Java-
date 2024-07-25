import java.util.PriorityQueue;
import java.util.Queue;

public class WeakestRows {
    public static void main(String[] args) {
        int[][] mat = {
            {1,1,0,0,0}, {1,1,1,1,0}, {1,0,0,0,0},
            {1,1,0,0,0}, {1,1,1,1,1}
        };
        int k = 3;
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) if (mat[i][j] == 1) count++;
            pq.offer(new int[]{count, i});
        }
        for (int i = 0; i < k; i++) System.out.print(pq.poll()[1] + " ");
    }
}