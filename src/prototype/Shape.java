package prototype;

/**
 * Prototype.
 */
public abstract class Shape implements Cloneable {

    protected String type;

    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }

}
