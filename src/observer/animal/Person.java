package observer.animal;

import observer.Updatable;

/**
 *
 * @author Dan
 */
public class Person implements Talker, Updatable {

    private String name;
    private String sound;

    public Person(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    @Override
    public void talk() {
        System.out.println(sound);
    }
    
    @Override
    public void update() {
        System.out.print(name + " (person) says: ");
        talk();
    }
    
}
