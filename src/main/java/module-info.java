module co.edu.uniquindio.billeteravirtual.billeteravirtual {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens co.edu.uniquindio.billeteravirtual.billeteravirtual to javafx.fxml;
    exports co.edu.uniquindio.billeteravirtual.billeteravirtual;
    opens co.edu.uniquindio.billeteravirtual.billeteravirtual.viewController;
    exports co.edu.uniquindio.billeteravirtual.billeteravirtual.viewController;
    opens co.edu.uniquindio.billeteravirtual.billeteravirtual.controller;
    exports co.edu.uniquindio.billeteravirtual.billeteravirtual.controller;
}