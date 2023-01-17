import java.util.Arrays;

public class QuickFindUF implements UF {

    private int[] id;

    /**
     * Initialize union-find data structure with N objects (0 to N-1)
     * @param N number of objects
     */
    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /**
     * Add connection between p and q
     * @param p
     * @param q
     */
    public void union(int p, int q) {
        int val1 = id[p];
        int val2 = id[q];

        for (int i = 0; i < id.length; i++) {
            if (id[i] == val1) {
                id[i] = val2;
            }
        }
    }

    /**
     * Are p and q in the same component?
     * @param p
     * @param q
     */
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    @Override
    public String toString() {
        return "QuickFindUF{" +
                "id=" + Arrays.toString(id) +
                '}';
    }
}

