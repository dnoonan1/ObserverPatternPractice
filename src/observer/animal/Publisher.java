package observer.animal;

import java.util.ArrayList;
import java.util.List;
import observer.Updatable;
import observer.Updater;

/**
 *
 * @author Dan
 */
public class Publisher implements Updater {

    private List<Updatable> subscribers;
    
    public Publisher() {
        subscribers = new ArrayList<>();
    }
    
    @Override
    public void addUpdatable(Updatable u) {
        subscribers.add(u);
    }
    
    @Override
    public void removeUpdatable(Updatable u) {
        subscribers.remove(u);
    }
    
    @Override
    public void updateAll() {
        for (Updatable u : subscribers) {
            u.update();
        }
    }

}
