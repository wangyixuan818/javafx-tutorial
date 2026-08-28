import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * A custom control representing a single chat message: some text beside an avatar image.
 */
public class DialogBox extends HBox {

    private Label text;
    private ImageView displayPicture;

    /**
     * Creates a dialog box holding the given message and avatar.
     *
     * @param message Text to show in the dialog box.
     * @param avatar Image to show beside the text.
     */
    public DialogBox(String message, Image avatar) {
        text = new Label(message);
        displayPicture = new ImageView(avatar);

        this.getChildren().addAll(text, displayPicture);
    }
}
