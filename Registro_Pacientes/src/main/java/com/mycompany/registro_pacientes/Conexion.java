/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registro_pacientes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class Conexion {
     private static final String URL = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
    private static final String USUARIO = "root";  // Cambia si tienes otro usuario
    private static final String CONTRASENA = "";   // Déjalo vacío si no usaste contraseña

    public static Connection obtenerConexion() {
        try {
            return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al conectar con la base de datos", e);
        }
    }
}
