package com.net.gt.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
	private Connection con;
	
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3307/db_tickets";
	private static final String USUARIO = "root";
	private static final String CLAVE = "admin";

	static {
		try {
			Class.forName(CONTROLADOR);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		}
	}
	
	public Connection conectar() {
		Connection conexion = null;
		
		try {
			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
			System.out.println("Conexi�n Exitosa");

		} catch (SQLException e) {
			System.out.println("Error conexi�n");
			e.printStackTrace();
		}
		
		return conexion;
	}

}
