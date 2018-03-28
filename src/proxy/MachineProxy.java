package proxy;

public class MachineProxy implements GetColaMachineData {
    @Override
    public State getState() {
        ColaMachine realMachine = new ColaMachine();
        return realMachine.getState();
    }

    @Override
    public int getCurrentAmount() {
        ColaMachine realMachine = new ColaMachine();
        return realMachine.getCurrentAmount();
    }
}
