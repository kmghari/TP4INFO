
package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "BrailleSoap", targetNamespace = "http://www.webserviceX.NET")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BrailleSoap {


    /**
     * Convert TEXT to Braille
     * 
     * @param textFontSize
     * @param inText
     * @return
     *     returns byte[]
     */
    @WebMethod(operationName = "BrailleText", action = "http://www.webserviceX.NET/BrailleText")
    @WebResult(name = "BrailleTextResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "BrailleText", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.BrailleText")
    @ResponseWrapper(localName = "BrailleTextResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.BrailleTextResponse")
    public byte[] brailleText(
        @WebParam(name = "InText", targetNamespace = "http://www.webserviceX.NET")
        String inText,
        @WebParam(name = "TextFontSize", targetNamespace = "http://www.webserviceX.NET")
        float textFontSize);

}
