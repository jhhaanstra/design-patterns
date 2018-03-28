package state;

public interface State {
    void insertFiftyCents(ColaMachine context);
    void insertOneEuro(ColaMachine context);
}

class StartState implements State {
    @Override
    public void insertFiftyCents(ColaMachine context) {
        context.setState(new State1());
        context.giveStatus("Saldo: 50 cent.");
    }

    @Override
    public void insertOneEuro(ColaMachine context) {
        context.setState(new State2());
        context.giveStatus("Saldo: 1 euro.");
    }
}

class State1 implements State {
    @Override
    public void insertFiftyCents(ColaMachine context) {
        context.setState(new State2());
        context.giveStatus("Saldo: 1 euro.");
    }

    @Override
    public void insertOneEuro(ColaMachine context) {
        context.setState(new State3());
        context.giveStatus("Saldo: 1,50 euro");
    }
}


class State2 implements State {
    @Override
    public void insertFiftyCents(ColaMachine context) {
        context.setState(new State3());
        context.giveStatus("Saldo: 1,50 euro");
    }

    @Override
    public void insertOneEuro(ColaMachine context) {
        context.giveCola();
        context.setState(new StartState());
    }
}

class State3 implements State {
    @Override
    public void insertFiftyCents(ColaMachine context) {
        context.giveCola();
        context.setState(new StartState());
    }

    @Override
    public void insertOneEuro(ColaMachine context) {
        context.returnMoney(50);
        context.giveCola();
        context.setState(new StartState());
    }
}