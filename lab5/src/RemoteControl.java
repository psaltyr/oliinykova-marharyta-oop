import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private final List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
    }
}
