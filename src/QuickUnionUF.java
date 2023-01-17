import java.util.Arrays;

public class QuickUnionUF {

    private int[] id;

    /**
     * Initialize union-find data structure with N objects (0 to N-1)
     * @param N number of objects
     */
    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /**
     * Finds the root of i-th element
     * @param i
     * @return
     */
    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    /**
     * Add connection between p and q. Connected if they have the same root.
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);

        id[p] = rootQ;
    }

    /**
     * Are p and q in the same component?
     * @param p
     * @param q
     */
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public String toString() {
        return "QuickUnionUF{" +
                "id=" + Arrays.toString(id) +
                '}';
    }
}