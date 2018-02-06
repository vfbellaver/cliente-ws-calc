
package WsCalcWebServiceCliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WsCalcWebServiceCliente package. 
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

    private final static QName _GetSubtrair_QNAME = new QName("http://calculadoraws/", "getSubtrair");
    private final static QName _GetMultiplicaResponse_QNAME = new QName("http://calculadoraws/", "getMultiplicaResponse");
    private final static QName _GetDivideResponse_QNAME = new QName("http://calculadoraws/", "getDivideResponse");
    private final static QName _GetSomaResponse_QNAME = new QName("http://calculadoraws/", "getSomaResponse");
    private final static QName _GetSubtrairResponse_QNAME = new QName("http://calculadoraws/", "getSubtrairResponse");
    private final static QName _GetDivide_QNAME = new QName("http://calculadoraws/", "getDivide");
    private final static QName _GetSoma_QNAME = new QName("http://calculadoraws/", "getSoma");
    private final static QName _GetMultiplica_QNAME = new QName("http://calculadoraws/", "getMultiplica");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WsCalcWebServiceCliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMultiplica }
     * 
     */
    public GetMultiplica createGetMultiplica() {
        return new GetMultiplica();
    }

    /**
     * Create an instance of {@link GetSoma }
     * 
     */
    public GetSoma createGetSoma() {
        return new GetSoma();
    }

    /**
     * Create an instance of {@link GetDivide }
     * 
     */
    public GetDivide createGetDivide() {
        return new GetDivide();
    }

    /**
     * Create an instance of {@link GetMultiplicaResponse }
     * 
     */
    public GetMultiplicaResponse createGetMultiplicaResponse() {
        return new GetMultiplicaResponse();
    }

    /**
     * Create an instance of {@link GetDivideResponse }
     * 
     */
    public GetDivideResponse createGetDivideResponse() {
        return new GetDivideResponse();
    }

    /**
     * Create an instance of {@link GetSomaResponse }
     * 
     */
    public GetSomaResponse createGetSomaResponse() {
        return new GetSomaResponse();
    }

    /**
     * Create an instance of {@link GetSubtrairResponse }
     * 
     */
    public GetSubtrairResponse createGetSubtrairResponse() {
        return new GetSubtrairResponse();
    }

    /**
     * Create an instance of {@link GetSubtrair }
     * 
     */
    public GetSubtrair createGetSubtrair() {
        return new GetSubtrair();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubtrair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraws/", name = "getSubtrair")
    public JAXBElement<GetSubtrair> createGetSubtrair(GetSubtrair value) {
        return new JAXBElement<GetSubtrair>(_GetSubtrair_QNAME, GetSubtrair.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMultiplicaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraws/", name = "getMultiplicaResponse")
    public JAXBElement<GetMultiplicaResponse> createGetMultiplicaResponse(GetMultiplicaResponse value) {
        return new JAXBElement<GetMultiplicaResponse>(_GetMultiplicaResponse_QNAME, GetMultiplicaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDivideResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraws/", name = "getDivideResponse")
    public JAXBElement<GetDivideResponse> createGetDivideResponse(GetDivideResponse value) {
        return new JAXBElement<GetDivideResponse>(_GetDivideResponse_QNAME, GetDivideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSomaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraws/", name = "getSomaResponse")
    public JAXBElement<GetSomaResponse> createGetSomaResponse(GetSomaResponse value) {
        return new JAXBElement<GetSomaResponse>(_GetSomaResponse_QNAME, GetSomaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubtrairResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraws/", name = "getSubtrairResponse")
    public JAXBElement<GetSubtrairResponse> createGetSubtrairResponse(GetSubtrairResponse value) {
        return new JAXBElement<GetSubtrairResponse>(_GetSubtrairResponse_QNAME, GetSubtrairResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDivide }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraws/", name = "getDivide")
    public JAXBElement<GetDivide> createGetDivide(GetDivide value) {
        return new JAXBElement<GetDivide>(_GetDivide_QNAME, GetDivide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraws/", name = "getSoma")
    public JAXBElement<GetSoma> createGetSoma(GetSoma value) {
        return new JAXBElement<GetSoma>(_GetSoma_QNAME, GetSoma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMultiplica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraws/", name = "getMultiplica")
    public JAXBElement<GetMultiplica> createGetMultiplica(GetMultiplica value) {
        return new JAXBElement<GetMultiplica>(_GetMultiplica_QNAME, GetMultiplica.class, null, value);
    }

}
