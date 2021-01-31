package facade;

public class ComputerFacade {
    private final CPU cpu;
    private final Memory memory;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
    }

    public void start() {
        cpu.freeze();
        memory.load();
        cpu.execute();
    }
}
