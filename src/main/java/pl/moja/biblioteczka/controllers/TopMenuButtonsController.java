package pl.moja.biblioteczka.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class TopMenuButtonsController {

    private MainController mainController;


    @FXML
    private ToggleGroup toggleButtons;

    @FXML
    public void openLibrary() {
        System.out.println("Open Library");
    }
    @FXML
    public void openListOfBooks() {
        System.out.println("Books");
    }
    @FXML
    public void stats() {
        System.out.println("stats");
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }


    @FXML
    public void addBook() {
        if(toggleButtons.getSelectedToggle()!=null){
            toggleButtons.getSelectedToggle().setSelected(false);
        }
        mainController.setCenter("/fxml/AddBook.fxml");

    }
}
