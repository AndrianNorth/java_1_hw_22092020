package lesson0204;

import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    public javafx.scene.control.TextArea textArea;
    @FXML
    public javafx.scene.control.TextField textField;

    public void onClickBtnSend() {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }

    public void KeyEnter(KeyEvent keyEvent) {
            if(keyEvent.getCode() == KeyCode.ENTER) {
                textArea.appendText(textField.getText() + "\n");
                textField.clear();
                textField.requestFocus();
            }
        }
    }


