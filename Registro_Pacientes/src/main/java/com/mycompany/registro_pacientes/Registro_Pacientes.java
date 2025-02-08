/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registro_pacientes;
import java.sql.Connection;
import javax.swing.*;

/**
 *
 * @author PC
 */
public class Registro_Pacientes {

    public static void main(String[] args) {
        
        Connection con = Conexion.obtenerConexion();
        if (con != null) {
            System.out.println("Conexión exitosa a la base de datos.");
        }
        
       Registro ventana = new Registro();
       ventana.setVisible(true);
    }
    
}
