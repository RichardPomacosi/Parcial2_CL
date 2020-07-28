<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="consumidor.aspx.cs" Inherits="Consumidor_ASP_NET.consumidor" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <p>
            CONSUMIDOR BASE DE DATOS POSTGRESS</p>
        <asp:Button ID="Button1" runat="server" Height="32px" OnClick="Button1_Click" Text="CLIENTES" Width="97px" />
        <asp:Button ID="Button2" runat="server" Height="32px" OnClick="Button2_Click" Text="EMPLEADOS" />
        <asp:Button ID="Button3" runat="server" Height="32px" OnClick="Button3_Click" Text="VENTAS" Width="123px" />
        <asp:GridView ID="GridView1" runat="server">
        </asp:GridView>
    </form>
</body>
</html>
