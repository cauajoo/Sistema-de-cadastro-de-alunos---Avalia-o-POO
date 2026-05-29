module br.com.poo.registrationsystem {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.poo.registrationsystem.controller to javafx.fxml;

    exports br.com.poo.registrationsystem;
    exports br.com.poo.registrationsystem.controller;
}