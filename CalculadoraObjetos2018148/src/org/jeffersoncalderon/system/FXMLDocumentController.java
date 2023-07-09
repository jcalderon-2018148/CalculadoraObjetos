package org.jeffersoncalderon.system;

import org.jeffersoncalderon.bean.Operaciones;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    double dato1 = 0, dato2 = 0, result = 0, punto;
    char signo = ' ';
    Operaciones op = new Operaciones(0,0,' ');
    
    @FXML private Button btnCero;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnMasMenos;
    @FXML private Button btnPunto;
    @FXML private Button btnIgual;
    @FXML private Button btnMas;
    @FXML private Button btnMenos;
    @FXML private Button btnMulti;
    @FXML private Button btnDivi;
    @FXML private Button btnUnoX;
    @FXML private Button btnCuadrado;
    @FXML private Button btnRaiz;
    @FXML private Button btnPorcentaje;
    @FXML private Button btnCE;
    @FXML private Button btnC;
    @FXML private TextField txtPantalla;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (txtPantalla.getText().length() > 0) {
            alineacion(txtPantalla.getText());
        }
        
        if (event.getSource() == btnCero)
            txtPantalla.setText(txtPantalla.getText()+"0");
        
        else if (event.getSource() == btnUno)
            txtPantalla.setText(txtPantalla.getText()+"1");
        
        else if (event.getSource() == btnDos)
            txtPantalla.setText(txtPantalla.getText()+"2");
        
        else if (event.getSource() == btnTres)
            txtPantalla.setText(txtPantalla.getText()+"3");
        
        else if (event.getSource() == btnCuatro)
            txtPantalla.setText(txtPantalla.getText()+"4");
        
        else if (event.getSource() == btnCinco)
            txtPantalla.setText(txtPantalla.getText()+"5");
        
        else if (event.getSource() == btnSeis)
            txtPantalla.setText(txtPantalla.getText()+"6");
        
        else if (event.getSource() == btnSiete)
            txtPantalla.setText(txtPantalla.getText()+"7");
        
        else if (event.getSource() == btnOcho)
            txtPantalla.setText(txtPantalla.getText()+"8");
        
        else if (event.getSource() == btnNueve)
            txtPantalla.setText(txtPantalla.getText()+"9");
        
        else if (event.getSource() == btnMas){
            if (txtPantalla.getText().length() > 0) {
                alineacion(txtPantalla.getText());
                if (signo == ' ') {
                    dato1 = Double.parseDouble(txtPantalla.getText());
                    txtPantalla.clear();
                }else {
                    dato2 = Double.parseDouble(txtPantalla.getText());
                    dato1 = op.operacion(dato1,dato2,signo);
                    txtPantalla.clear();
                }
                
                signo = '+';
            }

        }else if (event.getSource() == btnMenos){
            if (txtPantalla.getText().length() > 0) {
                alineacion(txtPantalla.getText());
                if (signo == ' ') {
                    dato1 = Double.parseDouble(txtPantalla.getText());
                    txtPantalla.clear();
                }else {
                    dato2 = Double.parseDouble(txtPantalla.getText());
                    dato1 = op.operacion(dato1,dato2,signo);
                    txtPantalla.clear();
                }

                signo = '-';
            }
            
        }else if (event.getSource() == btnMulti){
            if (txtPantalla.getText().length() > 0) {
                alineacion(txtPantalla.getText());
                if (signo == ' ') {
                    dato1 = Double.parseDouble(txtPantalla.getText());
                    txtPantalla.clear();
                }else {
                    dato2 = Double.parseDouble(txtPantalla.getText());
                    dato1 = op.operacion(dato1,dato2,signo);
                    txtPantalla.clear();
                }

                signo = '*';
            }
            
        }else if (event.getSource() == btnDivi){
            if (txtPantalla.getText().length() > 0) {
                alineacion(txtPantalla.getText());
                if (signo == ' ') {
                    dato1 = Double.parseDouble(txtPantalla.getText());
                    txtPantalla.clear();
                }else {
                    if (Double.parseDouble(txtPantalla.getText()) == 0) {
                        txtPantalla.setText("NaN");
                    }else {
                        dato2 = Double.parseDouble(txtPantalla.getText());
                        dato1 = op.operacion(dato1,dato2,signo);
                        txtPantalla.clear();
                    }
                }
                
                signo = '/';
            }
                        
        }else if (event.getSource() == btnC) {
            txtPantalla.clear();
            dato1 = 0;
            dato2 = 0;
            signo = ' ';
            txtPantalla.setStyle("-fx-font-size: 30.0 pt;");
            
        }else if (event.getSource() == btnCE) {
            txtPantalla.clear();
            
            if (signo == ' ')
                dato1 = 0;
            else 
                dato2 = 0;
            
            txtPantalla.setStyle("-fx-font-size: 30.0 pt;");
            
        }else if (event.getSource() == btnRaiz) {
            if (txtPantalla.getText().length() > 0) {
                alineacion(txtPantalla.getText());
                if (signo == ' ') {
                    dato1 = Math.sqrt(Double.parseDouble(txtPantalla.getText()));
                    alineacion(txtPantalla.getText());
                    txtPantalla.setText(String.valueOf(dato1));
                }else {
                    dato2 = Math.sqrt(Double.parseDouble(txtPantalla.getText()));
                    alineacion(txtPantalla.getText());
                    txtPantalla.setText(String.valueOf(dato2));
                }
            }
            
        }else if (event.getSource() == btnCuadrado) {
            if (txtPantalla.getText().length() > 0) {
                alineacion(txtPantalla.getText());
                if (signo == ' '){
                    dato1 = Double.parseDouble(txtPantalla.getText());
                    dato1 = dato1 * dato1;
                    alineacion(txtPantalla.getText());
                    txtPantalla.setText(String.valueOf(dato1));
                }else {
                    dato2 = Double.parseDouble(txtPantalla.getText());
                    dato2 = dato2 * dato2;
                    alineacion(txtPantalla.getText());
                    txtPantalla.setText(String.valueOf(dato2));
                }
            }
            
        }else if (event.getSource() == btnMasMenos) {
            if (txtPantalla.getText().length() > 0){
                if (signo == ' ') {
                    dato1 = Double.parseDouble(txtPantalla.getText()) * -1;
                    txtPantalla.setText(String.valueOf(dato1));
                }else {
                    dato2 = Double.parseDouble(txtPantalla.getText()) * -1;
                    txtPantalla.setText(String.valueOf(dato2));
                }
            }
            
        }else if (event.getSource() == btnUnoX) {
            if (txtPantalla.getText().length() > 0) {
                if (signo == ' ') {
                    dato1 = 1 / Double.parseDouble(txtPantalla.getText());
                    txtPantalla.setText(String.valueOf(dato1)); 
                }else {
                    dato2 = 1 / Double.parseDouble(txtPantalla.getText());
                    txtPantalla.setText(String.valueOf(dato2));
                }
            }
            
        }else if (event.getSource() == btnPorcentaje) {
            if (txtPantalla.getText().length() > 0) {
                if (signo != ' ') {
                    double valorPorciento, resPorciento;
                    valorPorciento = Double.parseDouble(txtPantalla.getText());
                    txtPantalla.clear();

                    resPorciento = (dato1 * valorPorciento) / 100;
                    txtPantalla.setText(String.valueOf(resPorciento));
                }
            }
            
        }else if (event.getSource() == btnPunto) {
            punto = 0;
            for (int i = 0; i < txtPantalla.getText().length(); i++) {
                if (txtPantalla.getText().charAt(i) == '.') 
                    punto = 1;
            }
            
            if (txtPantalla.getText().length() > 0) {
                if (punto == 0) {
                    txtPantalla.setText(txtPantalla.getText() + '.');
                }
            }else
                txtPantalla.setText("0.");

        }else if (event.getSource() == btnIgual){  
            if (txtPantalla.getText().length() > 0){
                dato2 = Double.parseDouble(txtPantalla.getText());
                
                switch (signo) {
                    case '+':
                        result = dato1 + dato2;
                        alineacion(String.valueOf(result));
                        
                        txtPantalla.setText(String.valueOf(result));
                        break;
                    case '-':
                        result = dato1 - dato2;
                        alineacion(String.valueOf(result));
                        
                        txtPantalla.setText(String.valueOf(result));
                        break;
                    case '*':
                        result = dato1 * dato2;
                        alineacion(String.valueOf(result));
                        
                        txtPantalla.setText(String.valueOf(result));
                        break;
                    case '/':
                        if (Double.parseDouble(txtPantalla.getText()) == 0) {
                            txtPantalla.setText("NaN");
                        }else {
                            result = dato1 / dato2;
                            alineacion(String.valueOf(result));
                            
                            txtPantalla.setText(String.valueOf(result));
                        }
                        
                        break;
                    default:
                        break;
                }
                
                signo = ' ';
                dato1 = 0;
                dato2 = 0;
            }
            
        }

    }
    
    private void alineacion(String txt){
        if (txt.length() >= 20) {
            txtPantalla.setStyle("-fx-font-size: 18.0 pt;");
        }else 
            if (txt.length() >= 14) 
                txtPantalla.setStyle("-fx-font-size: 23.0 pt;");
            else
                txtPantalla.setStyle("-fx-font-size: 30.0 pt;");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtPantalla.setEditable(false);
    }
    
}

