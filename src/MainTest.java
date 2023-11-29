
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class MainTest {

    @Test
    public void example() {
        Main s = new Main();
        BinaryTree tree = new BinaryTree(42, new BinaryTree(1337), new BinaryTree(39));
        Assertions.assertTrue(s.search(tree, 42));
        Assertions.assertFalse(s.search(tree, 100));
    }
}
