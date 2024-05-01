package view.Commands;

import model.service.Service;
import view.ConsoleUI;

public class Finish extends Command{
    public Finish(ConsoleUI consoleUI) {
        super("Закончить работу", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().finish();
    }
}