package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane root = new GridPane();
        FlowPane leftBanner = new FlowPane();
        leftBanner.setPrefWidth(200);
        String bgStyle = "-fx-background-color: lightblue;"
                + "-fx-background-radius: 0%;"
                + "-fx-background-inset: 5px;";
        leftBanner.setStyle(bgStyle);
        root.add(leftBanner , 0 , 0 , 1 , 1);
        root.add(createGridPanel() , 1 , 0 , 1 , 1);
        Scene scene = new Scene(root , 840 , 540);
        stage.setTitle("Layout Demo");
        stage.setScene(scene);
        stage.show();
    }

    public GridPane createGridPanel() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        Text text = new Text("Name and Location");
        text.setFont(Font.font("Dialog" , FontWeight.BOLD , 12));

        grid.add(text , 0 , 0 , 1 ,1);
        grid.add(new Separator() , 0 ,1 ,3 , 1);

        grid.add(new Label("Project Name:") , 0 , 2 , 1 , 1);
        grid.add(new TextField() , 1 , 2 , 1 , 1);
        grid.add(new Button("Browse...") , 2 , 3 , 1 , 1);

        grid.add(new Label("Project Folder:") , 0  , 4 , 1 , 1);
        grid.add(new TextField() , 1 , 4 , 1 , 1);

        grid.add(new Separator() , 0 , 5 , 3 , 1);

        grid.add(new Label("JavaFX Platform:") , 0 , 6 , 1 , 1);
        ComboBox<String> cb = new ComboBox<>();
        cb.setPrefWidth(400);
        grid.add(cb , 1 , 6 , 1 , 1);
        grid.add(new Button("Manage Platforms...") , 2 , 6 , 1 , 1);


        grid.add(new CheckBox("Create Custom Preloader") , 0 , 7  , 3 , 1);
        grid.add(new TextField() , 1 , 8 , 1 , 1);

        grid.add(new Separator() , 0 , 9 , 3 , 1);

        grid.add(new CheckBox("Use Dedicated Folder for storing"+
                "Libraries") , 0 , 10 , 3 , 1);

        grid.add(new Label("tLibraries Folder:") , 0 , 11 , 1 , 1);
        grid.add(new TextField() , 1 , 11 , 1 , 1);
        grid.add(new Button("Browse...") , 2 , 11 , 1 , 1);

        grid.add(new Label("Different users and project can " +
                "share the same compilation Libraries"
        + "(see Help for details") , 1 , 12 , 1 , 1);

        grid.add(new CheckBox("Create Application Class") , 0 , 13 , 1  , 1);
        grid.add(new TextField() , 1 , 13 , 1 , 1);


        grid.add(new CheckBox("Set as main project") , 0 , 14  ,1 , 1);

        grid.add(new Separator() , 0 ,15 , 3 , 1);

        FlowPane flowPane = new FlowPane(Orientation.HORIZONTAL , 10 , 10);
        flowPane.setAlignment(Pos.CENTER_RIGHT);
        flowPane.getChildren().addAll(
                new Button("< Back"),
                new Button("Next >"),
                new Button("Finish"),
                new Button("Help"));
        grid.add(flowPane , 0 , 16 , 3 , 1);

        return grid;





    }

    public static void main(String[] args) {
        launch();
    }
}