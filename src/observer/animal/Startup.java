package observer.animal;

import observer.Updater;

/**
 *
 * @author Dan
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dog ayda = new Dog("Ayda");
        Cat max = new Cat("Max");
        Person bob = new Person("Bob", "<<silence>>");
        Person sue = new Person("Sue", "When it rains cats and dogs...");
        
        Updater publisher = new Publisher();
        publisher.addUpdatable(ayda);
        publisher.addUpdatable(max);
        publisher.addUpdatable(bob);
        publisher.addUpdatable(sue);
        publisher.updateAll();
        
    }
    
}
