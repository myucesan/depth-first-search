public class Main {
    /**
     * Recursively searches for the element. Returns true if element can be found, else false.
     *
     * @param tree - tree that you need to look in.
     * @param element - the element that you are looking for.
     * @return true if found, else false.
     */
    public boolean search(BinaryTree tree, int element) {
        if (tree == null) return false; // clause that ends the recursive loop

        if (tree.getKey() == element) return true; // if this is the element return true
        // best to draw to understand this, it goes through the left-hand side first, and starts returning false (unless found) and goes up and up and down again.
        return search(tree.getLeft(), element) || search(tree.getRight(), element); // recursively check left and right nodes of each node
    }
}