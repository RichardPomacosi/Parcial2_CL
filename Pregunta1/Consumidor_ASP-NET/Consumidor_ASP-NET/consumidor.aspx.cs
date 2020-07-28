using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Consumidor_ASP_NET
{
    public partial class consumidor : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            ServiceReference1.WebService1SoapClient ws = new ServiceReference1.WebService1SoapClient();
            GridView1.DataSource = ws.ventas();
            GridView1.DataBind();

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            ServiceReference1.WebService1SoapClient ws = new ServiceReference1.WebService1SoapClient();
            GridView1.DataSource = ws.clientes();
            GridView1.DataBind();
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            ServiceReference1.WebService1SoapClient ws = new ServiceReference1.WebService1SoapClient();
            GridView1.DataSource = ws.empleados();
            GridView1.DataBind();
        }

        protected void Button3_Click(object sender, EventArgs e)
        {
            ServiceReference1.WebService1SoapClient ws = new ServiceReference1.WebService1SoapClient();
            GridView1.DataSource = ws.ventas();
            GridView1.DataBind();
        }
    }
}