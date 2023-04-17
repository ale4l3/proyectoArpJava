package main12;

import conexion.*;
//import gui.*;
import java.sql.*;


public class MAIN12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Gui00 pantalla1 = new Gui00();

	//	Gui01 pantalla2 = new Gui01();
	
	// pantalla2.setBounds(650, 5, 350, 350);

	//	Gui04 pantalla3 = new Gui04();
		
	//	pantalla3.setBounds(0, 0, 550, 450);

		Conexion();
		
		conexion2();
		
		conexion3();

	}

	// BASE DE DATOS
	public static void Conexion() {
		
		// Objeto del tipo Connection para crear la conexión
        ConexionBD conexion = new ConexionBD();
        Connection con = conexion.getConnection();
        
        try {
            String Selectquery = "select * from empleados";
            
            //AGREGUE PARA QUEE SE EXECUTE LA SENTENCIA USE sino no se executaria lo siguiente correctamente
            Statement stmt = con.createStatement();
            stmt.executeUpdate("USE Qatar2022"); // ejecutar el comando
            // aquí puedes hacer otras operaciones en la base de datos
            Statement st = con.createStatement(); 
            ResultSet rs = st.executeQuery(Selectquery);

            while (rs.next()) {
                System.out.println(".... Registro n°: " + rs.getRow() + " ..........." + "\n");
                System.out.println("Nombre y apellido: " + rs.getString("nombre") + ", " + rs.getString("apellido"));
                System.out.println("DNI: " + rs.getString("DNI"));
                System.out.println("Departamento: " + rs.getString("Departamento") + "\n");

            }

            // Cerramos las conexiones, en orden inverso a su apertura
            st.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error!, conexión fallida a la base de datos.");
        }
    }

	public static void conexion2() {
		try {
			ConexionBD conn = new ConexionBD();
			Connection conexion = conn.getConnection(); 
			// usar executeUpdate para un insert,delete u update

			String Insertquery = "INSERT INTO empleados (DNI,nombre,apellido,nacionalidad,Departamento)\r\n" + "VALUES"
					+ "(?,?,?,?,?,?)";
			// preparo la sentencia
			PreparedStatement PS = conexion.prepareStatement(Insertquery);
			PS.setInt(1, 99000111); 
			PS.setString(2, "Claudio");
			PS.setString(3, "Caniggia");
			PS.setString(4, "Argentino");
			PS.setString(5, "logistica");
			PS.setInt(6, 3); 
			// + "(99000111,"Diego','Maradona','Argentino','logistica')";
			// execute insert SQL stetement
			PS.executeUpdate();

			System.out.println("El registro fue exitoso!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}
	}
	
	public static void conexion3() {
		try {
			ConexionBD conn = new ConexionBD();
			Connection conexion = conn.getConnection();
			
			String Insertquery = "insert into empleados(DNI,nombre,apellido,nacionalidad,Departamento) values (99000222,'Juan','Perez','Argentino','logistica',3)";
			
			String Updatequery = "UPDATE empleado SET DNI = 55222333, nombre = 'Roman', apellido = 'Riquelme', Departamento='Logistica'\r\n"
					+ "WHERE idEmpleado=5";

			String Deletequery = "delete from empleado where  idEmpleado in (6,11,13,12)";

			PreparedStatement sentencia = conexion.prepareStatement(Insertquery);
			PreparedStatement sentencia2 = conexion.prepareStatement(Updatequery);
		    PreparedStatement sentencia3 = conexion.prepareStatement(Deletequery);
			
		  sentencia.executeUpdate();
		  sentencia2.executeUpdate();
		  sentencia3.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Error!"
					+ e);
		}
		
	}
	
}