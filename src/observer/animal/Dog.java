package observer.animal;

import observer.Updatable;

/**
 *
 * @author Dan
 */
public class Dog implements Talker, Updatable {

    private String name;
    private String sound = "bark!";

    public Dog(String name) {
        this.name = name;
    }
    
    @Override
    public void talk() {
        System.out.println(sound);
    }
    
    @Override
    public void update() {
        System.out.print(name + " (dog) says: ");
        talk();
    }
    
}
