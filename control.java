import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class control {

    @FXML
    private Button btn;


    @FXML
    private PasswordField pass;

    @FXML
    private ChoiceBox<String> choice;


    @FXML
    private TextField text;

    @FXML
    void btnentrar(ActionEvent event) {

      ArrayList<String> arrayList = new ArrayList<String>(); 

        String name = text.getText();
        String password = pass.getText();

        arrayList.add(name);
        arrayList.add(password);

        text.setText("");
        pass.setText("");
   
        int oi = arrayList.size();
        System.out.println(oi);

        choice.getItems().addAll(arrayList);
        choice.setOnAction(this::setinformations);

    }

 
    public void setinformations(ActionEvent event){

      text.setText(choice.getValue());
        


    }


    @FXML
    void password(ActionEvent event) {

    }

    @FXML
    void textword(ActionEvent event) {

    }

}
