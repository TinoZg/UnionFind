import java.util.Arrays;

public class WeightedUF {

    private int[] id;
    private int[] sz;

    /**
     * Initialize union-find data structure with N objects (0 to N-1)
     * @param N number of objects
     */
    public WeightedUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }

        sz = new int[N];
        for (int i = 0; i < N; i++) {
            sz[i] = 1;
        }
    }

    /**
     * Finds the root of i-th element
     * @param i
     * @return
     */
    private int root(int i) {
        while (i != id[i]) {
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

        if (rootP == rootQ) {
            return;
        }

        if (sz[rootP] > sz[rootQ]) {
            id[rootQ] = rootP;
            sz[rootP] += sz[rootQ];
        } else {
            id[rootP] = rootQ;
            sz[rootQ] += sz[rootP];
        }
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
        return "WeightedUF{" +
                "id=" + Arrays.toString(id) +
                ", sz=" + Arrays.toString(sz) +
                '}';
    }
}