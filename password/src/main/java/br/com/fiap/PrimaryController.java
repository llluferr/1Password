package br.com.fiap;


import java.sql.Connection;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

   @FXML private TextField textFieldSenha;

    private void salvar(){
    textFieldSenha.getText();
    }


    private void inserir(){
        Connection con = SenhaDAO.getConnection();
        var stm = con.prepareStatement("INSERT INTO DDD_PASSWORD VALUES (?, ?)");
        stm.setString(1, Log.getNumero1());
        stm.setString(1, Log.getNumero2());
        
        stm.execute();
        stm.close();
    }
}
