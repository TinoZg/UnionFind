public interface UF {

    /**
     * Add connection between p and q
     * @param p
     * @param q
     */
    public void union(int p, int q);

    /**
     * Are p and q in the same component?
     * @param p
     * @param q
     */
    public boolean connected(int p, int q);
}
