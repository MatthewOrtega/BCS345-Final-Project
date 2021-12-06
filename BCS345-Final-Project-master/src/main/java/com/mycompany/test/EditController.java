/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author dorje
 */
public class EditController {
    @FXML
    private void switchToHome() throws IOException {
        App.setRoot("secondary");
    }
}
