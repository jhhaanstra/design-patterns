package command.commands;

// the command interface
public interface Command {
    public void execute();
    // If you want, you can log the commands that are executed
    // public void undo();
}