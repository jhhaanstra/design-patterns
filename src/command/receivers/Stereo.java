package command.receivers;

public class Stereo implements ElectronicDevice {
    private boolean turnedOn = false;
    private int volumeLevel = 50;

    @Override
    public void on() {
        turnedOn = true;
    }

    @Override
    public void off() {
        turnedOn = false;
    }

    @Override
    public void volumeUp() {
        if (turnedOn) System.out.println(++volumeLevel);
    }

    @Override
    public void volumeDown() {
        if (turnedOn) System.out.println(--volumeLevel);
    }
}
