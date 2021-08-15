/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author guill
 */
public class PantallaChantonController implements Initializable {

    @FXML
    private Label lblRondas;
    @FXML
    private Label lblTotalRondas;
    @FXML
    private TextField txtPuntosJugador;
    @FXML
    private TextField txtPuntosComputadora;
    @FXML
    private Label lblLetraEscogida;
    
    PantallaJuegoController controladorJuego;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    public void recibeParametros(PantallaJuegoController controlador, String rondas, String letra){
        lblLetraEscogida.setText(letra);
        lblTotalRondas.setText(rondas);
        controladorJuego = controlador;
    }

}
