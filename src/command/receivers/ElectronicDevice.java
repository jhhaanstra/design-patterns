package command.receivers;

public interface ElectronicDevice {
    // This is where you define the commands for the receivers
    public void on();
    public void off();
    public void volumeUp();
    public void volumeDown();
}