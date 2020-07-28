/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.awt.List;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.naming.spi.DirStateFactory.Result;
import javax.sql.RowSet;
import javax.xml.ws.BindingType;

/**
 *
 * @author Rick
 */
@WebService(serviceName = "WebService_Postgress")
@BindingType(value = "http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/")
public class WebService_Postgress {

 

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addEmpleado")
    public String addEmpleado(@WebParam(name = "e_id") String e_id, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "fecha") String fecha, @WebParam(name = "reporte") String reporte, @WebParam(name = "extension") String extension) {
        String r="";
        try {
        Class.forName("org.postgresql.Driver");
        Connection conn=DriverManager.getConnection("localhost:21927/PEDIDOS","postgres","123456");
       java.sql.Statement st=conn.createStatement();
      int  resul=st.executeUpdate("insert into empleados (empleadoid,nombre,apellido,fecha_nac,reporta_a,extension) values("+e_id+",'"+nombre+"','"+apellido+"','"+fecha+"',"+reporte+","+extension+")");
        
        } catch (Exception e) {
        }
        return r;
    }


    
    

 
  

  

 
    
    
}
