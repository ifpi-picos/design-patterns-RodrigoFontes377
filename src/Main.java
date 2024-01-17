public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("Estado Inicial");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("Novo Estado");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.restoreStateFromMemento(caretaker.getMemento(0));
        System.out.println("Estado restaurado para: " + originator.getState());
    }
}

