package command;

import command.receivers.ElectronicDevice;
import command.receivers.Television;

public class RemoteControl {

    // return a command receiver
    public static ElectronicDevice getDevice(){
        return new Television();
    }
}