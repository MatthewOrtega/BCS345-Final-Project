module com.mycompany.test {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.test to javafx.fxml;
    exports com.mycompany.test;
}
