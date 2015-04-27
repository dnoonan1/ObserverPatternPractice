package observer;

/**
 *
 * @author Dan
 */
public interface Updater {
    void addUpdatable(Updatable u);
    void removeUpdatable(Updatable u);
    void updateAll();
}
