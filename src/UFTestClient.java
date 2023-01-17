import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UFTestClient {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        WeightedUF uf = new WeightedUF(N);

        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();

            if (!uf.connected(p, q)) {
                uf.union(p, q);
                StdOut.println(p + " " + q);
            }
            StdOut.println(uf.toString());
        }
    }
}
