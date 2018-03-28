package singleton;

public class Settings {
    // A static variable get placed in the memory from start to end in the program. You cannot change it.
    private static Settings uniqueSettings;

    private int setting1 = 0;
    private int setting2 = 0;
    private int setting3 = 0;

    private Settings(){}

    public static Settings getInstance() {
        if (uniqueSettings == null) {
            uniqueSettings = new Settings();
        }

        return uniqueSettings;
    }

    public int getSetting1() {
        return setting1;
    }

    public int getSetting2() {
        return setting2;
    }

    public int getSetting3() {
        return setting3;
    }

    public void setSetting1(int setting1) {
        this.setting1 = setting1;
    }

    public void setSetting2(int setting2) {
        this.setting2 = setting2;
    }

    public void setSetting3(int setting3) {
        this.setting3 = setting3;
    }
}
