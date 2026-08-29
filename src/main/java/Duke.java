/**
 * The Duke chatbot: generates responses to user messages.
 */
public class Duke {

    private String commandType;

    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * Returns Duke's response to the user's chat message.
     *
     * @param input The user's message.
     * @return Duke's reply.
     */
    public String getResponse(String input) {
        commandType = parseCommandType(input);
        return "Duke heard: " + input;
    }

    /**
     * Returns the type of the command produced by the most recent call to
     * {@link #getResponse(String)}.
     *
     * @return The simple name of the most recent command, e.g. {@code "AddCommand"}.
     */
    public String getCommandType() {
        return commandType;
    }

    /**
     * Returns the command type for the given user input, derived from its first word.
     *
     * @param input The user's message.
     * @return The simple name of the matching command.
     */
    private String parseCommandType(String input) {
        String keyword = input.split(" ", 2)[0];
        switch (keyword) {
        case "todo":
        case "deadline":
        case "event":
            return "AddCommand";
        case "mark":
        case "unmark":
            return "ChangeMarkCommand";
        case "delete":
            return "DeleteCommand";
        default:
            return "UnknownCommand";
        }
    }
}
