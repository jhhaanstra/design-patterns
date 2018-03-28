package command.commands;

import command.receivers.ElectronicDevice;

// a concrete command
public class TurnTVOff implements Command {
    ElectronicDevice myDevice;

    public TurnTVOff(ElectronicDevice device){
        myDevice = device;
    }
    
    public void execute() {
        myDevice.off();
    }
}