package adapter;

/**
 * The adaptor pattern gives you the possibility to let classes adapt to a certain interface. In
 * this example we have units from a RPG theme. We have the classical warriors which have a standard
 * attack function. But the mages cast spells for attacks. We have to adapt the mage in this case to match the Unit.
 * If we do that, we can just use the Unit interface as typing.
 */
public class Main {
    public static void main(String[] args) {
        Unit warrior = new Warrior();
        Mage whiteMage = new WhiteMage();

        warrior.attack();
        Unit mage1 = new MageAdaptor(whiteMage); // Here we use the adaptor with our white mage
        Unit blackMage = new MageAdaptor(new BlackMage()); // Give a new BlackMage as parameter


        warrior.attack();
        mage1.attack();
        blackMage.attack();
    }
}
