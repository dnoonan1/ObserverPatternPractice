package observer.animal;

import observer.Updatable;
import observer.Updater;

/**
 *
 * @author Dan
 */
public class Cat implements Talker, Updatable {

    private String name;
    private String sound = "meow!";

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void talk() {
        System.out.println(sound);
    }

    @Override
    public void update() {
        System.out.print(name + " (cat) says: ");
        talk();
    }
    
}
