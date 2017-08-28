package test;

/**
 * Represents a boxed integer
 */
public class Int {

    private int value;

    /**
     * Create a new Int with the provided value
     */
    public Int(int value) {
        this.value = value;
    }
    
    /**
     * Add two Ints together
     */
    public void add(Int other) {
        value += other.value;
    }

}
