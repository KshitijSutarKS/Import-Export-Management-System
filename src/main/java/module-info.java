module com.project.application {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires java.naming;
    requires java.desktop;
    requires java.sql;
    requires com.oracle.database.jdbc;

    exports com.project.application;
    exports com.project.utils;
}