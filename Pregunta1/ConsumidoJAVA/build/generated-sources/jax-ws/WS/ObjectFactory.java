
package WS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WS package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddEmpleadoResponse_QNAME = new QName("http://ws/", "addEmpleadoResponse");
    private final static QName _HolaMundoResponse_QNAME = new QName("http://ws/", "holaMundoResponse");
    private final static QName _AddEmpleado_QNAME = new QName("http://ws/", "addEmpleado");
    private final static QName _HolaMundo_QNAME = new QName("http://ws/", "holaMundo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddEmpleadoResponse }
     * 
     */
    public AddEmpleadoResponse createAddEmpleadoResponse() {
        return new AddEmpleadoResponse();
    }

    /**
     * Create an instance of {@link HolaMundoResponse }
     * 
     */
    public HolaMundoResponse createHolaMundoResponse() {
        return new HolaMundoResponse();
    }

    /**
     * Create an instance of {@link AddEmpleado }
     * 
     */
    public AddEmpleado createAddEmpleado() {
        return new AddEmpleado();
    }

    /**
     * Create an instance of {@link HolaMundo }
     * 
     */
    public HolaMundo createHolaMundo() {
        return new HolaMundo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addEmpleadoResponse")
    public JAXBElement<AddEmpleadoResponse> createAddEmpleadoResponse(AddEmpleadoResponse value) {
        return new JAXBElement<AddEmpleadoResponse>(_AddEmpleadoResponse_QNAME, AddEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HolaMundoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "holaMundoResponse")
    public JAXBElement<HolaMundoResponse> createHolaMundoResponse(HolaMundoResponse value) {
        return new JAXBElement<HolaMundoResponse>(_HolaMundoResponse_QNAME, HolaMundoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addEmpleado")
    public JAXBElement<AddEmpleado> createAddEmpleado(AddEmpleado value) {
        return new JAXBElement<AddEmpleado>(_AddEmpleado_QNAME, AddEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HolaMundo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "holaMundo")
    public JAXBElement<HolaMundo> createHolaMundo(HolaMundo value) {
        return new JAXBElement<HolaMundo>(_HolaMundo_QNAME, HolaMundo.class, null, value);
    }

}
