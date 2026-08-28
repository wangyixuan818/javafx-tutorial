import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
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

    private DialogBox(String message, Image avatar) {
        text = new Label(message);
        displayPicture = new ImageView(avatar);

        // Styling the dialog box
        text.setWrapText(true);
        displayPicture.setFitWidth(100.0);
        displayPicture.setFitHeight(100.0);
        this.setAlignment(Pos.TOP_RIGHT);

        this.getChildren().addAll(text, displayPicture);
    }

    /**
     * Flips the dialog box so the image is on the left and the text on the right.
     */
    private void flip() {
        this.setAlignment(Pos.TOP_LEFT);
        ObservableList<Node> tmp = FXCollections.observableArrayList(this.getChildren());
        FXCollections.reverse(tmp);
        this.getChildren().setAll(tmp);
    }

    /**
     * Returns a dialog box representing a message from the user.
     */
    public static DialogBox getUserDialog(String message, Image avatar) {
        return new DialogBox(message, avatar);
    }

    /**
     * Returns a dialog box representing a message from Duke, flipped so it is
     * visually distinct from the user's messages.
     */
    public static DialogBox getDukeDialog(String message, Image avatar) {
        DialogBox db = new DialogBox(message, avatar);
        db.flip();
        return db;
    }
}
