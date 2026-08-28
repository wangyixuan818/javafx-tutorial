/**
 * The Duke chatbot: generates responses to user messages.
 */
public class Duke {
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
        return "Duke heard: " + input;
    }
}
