package command;

import command.commands.TurnTVOff;
import command.commands.TurnTVOn;
import command.invoker.DeviceButton;
import command.receivers.ElectronicDevice;

public class Main {
    /**
     * Command pattern lets you dynamically use different commands.
     */
    public static void main(String[] args) {
        // This is the client
        // create command receiver
        ElectronicDevice newDevice = RemoteControl.getDevice();

        // create a concrete command, register the receiver
        TurnTVOn onCommand = new TurnTVOn(newDevice);

        // create invoker
        DeviceButton b = new DeviceButton();

        // invoke command
        b.execute(onCommand);

        // create another concrete command
        TurnTVOff offCommand = new TurnTVOff(newDevice);

        // invoke another concrete command
        b.execute(offCommand);
    }
}
