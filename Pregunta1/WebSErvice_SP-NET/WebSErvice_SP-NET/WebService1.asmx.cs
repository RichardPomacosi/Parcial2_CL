using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;
using System.Data;
using System.Data.SqlClient;
using Npgsql;
namespace WebSErvice_SP_NET
{
    /// <summary>
    /// Descripción breve de WebService1
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class WebService1 : System.Web.Services.WebService
    {

        [WebMethod]
        public string HelloWorld()
        {
            return "Hola a todos";
        }
        
        [WebMethod]
        public DataSet clientes()
        {
            NpgsqlConnection conn = new NpgsqlConnection();
            conn.ConnectionString = "Username=postgres; Password=123456; Host=localhost; port=5432; database=PEDIDOS";
            NpgsqlDataAdapter ada = new NpgsqlDataAdapter();
            ada.SelectCommand = new NpgsqlCommand();
            ada.SelectCommand.Connection = conn;
            ada.SelectCommand.CommandText = "select*from clientes";
            ada.SelectCommand.CommandType = CommandType.Text;
            DataSet ds = new DataSet();
            ada.Fill(ds);
            conn.Close();
            return ds;
        }
        [WebMethod]
        public DataSet empleados()
        {
            NpgsqlConnection conn = new NpgsqlConnection();
            conn.ConnectionString = "Username=postgres; Password=123456; Host=localhost; port=5432; database=PEDIDOS";
            NpgsqlDataAdapter ada = new NpgsqlDataAdapter();
            ada.SelectCommand = new NpgsqlCommand();
            ada.SelectCommand.Connection = conn;
            ada.SelectCommand.CommandText = "select*from empleados";
            ada.SelectCommand.CommandType = CommandType.Text;
            DataSet ds = new DataSet();
            ada.Fill(ds);
            conn.Close();
            return ds;
        }
        [WebMethod]
        public DataSet ventas()
        {
            NpgsqlConnection conn = new NpgsqlConnection();
            conn.ConnectionString = "Username=postgres; Password=123456; Host=localhost; port=5432; database=PEDIDOS";
            NpgsqlDataAdapter ada = new NpgsqlDataAdapter();
            ada.SelectCommand = new NpgsqlCommand();
            ada.SelectCommand.Connection = conn;
            ada.SelectCommand.CommandText = "Select detalle_ordenes.ordenid, productos.descripcion, empleados.nombre,detalle_ordenes.cantidad, ordenes.descuento, ordenes.fechaorden from detalle_ordenes, productos, empleados, ordenes where detalle_ordenes.ordenid = ordenes.ordenid and productos.productoid = detalle_ordenes.productoid and ordenes.empleadoid = empleados.empleadoid";
            ada.SelectCommand.CommandType = CommandType.Text;
            DataSet ds = new DataSet();
            ada.Fill(ds);
            conn.Close();
            return ds;
        }
        [WebMethod]
        public DataSet consulta(string cons )
        {
            NpgsqlConnection conn = new NpgsqlConnection();
            conn.ConnectionString = "Username=postgres; Password=123456; Host=localhost; port=5432; database=PEDIDOS";
            NpgsqlDataAdapter ada = new NpgsqlDataAdapter();
            ada.SelectCommand = new NpgsqlCommand();
            ada.SelectCommand.Connection = conn;
            ada.SelectCommand.CommandText = cons;
            ada.SelectCommand.CommandType = CommandType.Text;
            DataSet ds = new DataSet();
            ada.Fill(ds);
            conn.Close();
            return ds;
        }

    }
}
