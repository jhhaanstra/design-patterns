package command.commands;

import command.receivers.ElectronicDevice;

// a concrete command
public class TurnTVOn implements Command {
    ElectronicDevice myDevice;

    // perhaps log?
    //private Stack log = new Stack();

    public TurnTVOn(ElectronicDevice device){
        // register receiver
        myDevice = device;
    }

    @Override
    public void execute() {
        myDevice.on();
    }
}