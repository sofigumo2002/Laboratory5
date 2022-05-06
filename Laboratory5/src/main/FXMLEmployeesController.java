/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author sofia
 */
public class FXMLEmployeesController implements Initializable {

    @FXML
    private BorderPane bp;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Button btnAdd;
    @FXML
    private TableView<?> tableView;
    @FXML
    private TableColumn<?, ?> iDTableColumn;
    @FXML
    private TableColumn<?, ?> lastNameTableColumn;
    @FXML
    private TableColumn<?, ?> firstNameTableColumn;
    @FXML
    private TableColumn<?, ?> tittleTableColumn;
    @FXML
    private TableColumn<?, ?> birthdayTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnAddOnAction(ActionEvent event) {
    }
    
}
