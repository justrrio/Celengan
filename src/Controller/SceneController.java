package Controller;

import javafx.stage.Stage;
import View.register.Login_form;
import View.register.Registration_form;

public class SceneController {
    public void switchToRegistration() {
        Registration_form registration_form = new Registration_form();
        Stage registrationStage = new Stage(); // create a new Stage object
        registration_form.start(registrationStage); // pass the Stage object to the start method
        // root = new VBox();
        // root.getChildren().addAll(registration_form.getRoot());
        // Scene registrationScene = new Scene(root, 1000, 500);
        // registrationStage.setScene(registrationScene);
    }

    public void switchToLogin() {
        Login_form login_form = new Login_form();
        Stage loginStage = new Stage(); // create a new Stage object
        login_form.start(loginStage); // pass the Stage object to the start method
        // root = new VBox();
        // root.getChildren().addAll(login_form.getRoot());
        // Scene loginScene = new Scene(root, 50, 50);
        // loginStage.setScene(loginScene);
    }

}
