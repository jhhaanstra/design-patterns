package command.commands;

import command.receivers.ElectronicDevice;

// Invoker
public class TurnVolumeUp implements Command {
    private ElectronicDevice device;

    public TurnVolumeUp(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }
}
