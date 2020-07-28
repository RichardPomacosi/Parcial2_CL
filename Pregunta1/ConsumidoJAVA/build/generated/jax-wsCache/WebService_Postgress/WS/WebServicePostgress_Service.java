
package WS;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WebService_Postgress", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/Web_Service_JAVA/WebService_Postgress?wsdl")
public class WebServicePostgress_Service
    extends Service
{

    private final static URL WEBSERVICEPOSTGRESS_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICEPOSTGRESS_EXCEPTION;
    private final static QName WEBSERVICEPOSTGRESS_QNAME = new QName("http://ws/", "WebService_Postgress");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Web_Service_JAVA/WebService_Postgress?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICEPOSTGRESS_WSDL_LOCATION = url;
        WEBSERVICEPOSTGRESS_EXCEPTION = e;
    }

    public WebServicePostgress_Service() {
        super(__getWsdlLocation(), WEBSERVICEPOSTGRESS_QNAME);
    }

    public WebServicePostgress_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICEPOSTGRESS_QNAME, features);
    }

    public WebServicePostgress_Service(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICEPOSTGRESS_QNAME);
    }

    public WebServicePostgress_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICEPOSTGRESS_QNAME, features);
    }

    public WebServicePostgress_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServicePostgress_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebServicePostgress
     */
    @WebEndpoint(name = "WebService_PostgressPort")
    public WebServicePostgress getWebServicePostgressPort() {
        return super.getPort(new QName("http://ws/", "WebService_PostgressPort"), WebServicePostgress.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServicePostgress
     */
    @WebEndpoint(name = "WebService_PostgressPort")
    public WebServicePostgress getWebServicePostgressPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "WebService_PostgressPort"), WebServicePostgress.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICEPOSTGRESS_EXCEPTION!= null) {
            throw WEBSERVICEPOSTGRESS_EXCEPTION;
        }
        return WEBSERVICEPOSTGRESS_WSDL_LOCATION;
    }

}
