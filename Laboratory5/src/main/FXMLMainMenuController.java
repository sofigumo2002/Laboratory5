/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author sofia
 */
public class FXMLMainMenuController implements Initializable {


    @FXML
    private Button btnHome;
    @FXML
    private Button btnEmployees;
    @FXML
    private Button btnJobPosition;
    @FXML
    private Button btnExit;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Text txtTittle;
    @FXML
    private BorderPane bp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public static void loadPage(URL ui, BorderPane bp){
        Parent root = null;
        try {
            root = FXMLLoader.load(ui); 
        } catch (IOException ex) {
            Logger.getLogger(FXMLMainMenuController.class.getName());
        }
        //cleaning nodes
        bp.setTop(null); bp.setCenter(null); bp.setBottom(null); 
        //bp.setLeft(null);
        bp.setRight(null);
        //bp.setCenter(root);
    }
//       private void loadPage(String page) throws IOException {
//
//        Parent root = null;
//        try {
//            root = FXMLLoader.load(getClass().getResource(page + ".fxml"));
//        } catch (IOException ex) {
//            Logger.getLogger(FXMLMainMenuController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        this.bp.setCenter(root);
//    }
    
    @FXML
    private void btnHomeOnAction(ActionEvent event) {
    }

    @FXML
    private void btnEmployeesOnAction(ActionEvent event) {
        loadPage(getClass().getResource("FXMLEmployees.fxml"), bp);
    }

    @FXML
    private void btnbtnJobPositionOnAction(ActionEvent event) throws IOException {
        loadPage(getClass().getResource("FXMLJobPosition.fxml"), bp);
    }

    @FXML
    private void btnExitOnAction(ActionEvent event) {
        System.exit(0); //FORMA VALIDA
    }
    
}
