//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.01.26 时间 12:13:17 PM CST 
//


package receive;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the receive package. 
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

    private final static QName _ReceiveWeiXinDataString_QNAME = new QName("", "string");
    private final static QName _ReceiveWeiXinDataString1_QNAME = new QName("", "string1");
    private final static QName _ReceiveWeiXinDataResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: receive
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReceiveWeiXinData }
     * 
     */
    public ReceiveWeiXinData createReceiveWeiXinData() {
        return new ReceiveWeiXinData();
    }

    /**
     * Create an instance of {@link ReceiveWeiXinDataResponse }
     * 
     */
    public ReceiveWeiXinDataResponse createReceiveWeiXinDataResponse() {
        return new ReceiveWeiXinDataResponse();
    }

    /**
     * Create an instance of {@link ReceiveWeiXinDataPreReleaseV1 }
     * 
     */
    public ReceiveWeiXinDataPreReleaseV1 createReceiveWeiXinDataPreReleaseV1() {
        return new ReceiveWeiXinDataPreReleaseV1();
    }

    /**
     * Create an instance of {@link ReceiveWeiXinDataPreReleaseV1Response }
     * 
     */
    public ReceiveWeiXinDataPreReleaseV1Response createReceiveWeiXinDataPreReleaseV1Response() {
        return new ReceiveWeiXinDataPreReleaseV1Response();
    }

    /**
     * Create an instance of {@link UpdateHousePrepay }
     * 
     */
    public UpdateHousePrepay createUpdateHousePrepay() {
        return new UpdateHousePrepay();
    }

    /**
     * Create an instance of {@link UpdateHousePrepayResponse }
     * 
     */
    public UpdateHousePrepayResponse createUpdateHousePrepayResponse() {
        return new UpdateHousePrepayResponse();
    }

    /**
     * Create an instance of {@link PushHouseholderTreasurePrepay }
     * 
     */
    public PushHouseholderTreasurePrepay createPushHouseholderTreasurePrepay() {
        return new PushHouseholderTreasurePrepay();
    }

    /**
     * Create an instance of {@link PushHouseholderTreasurePrepayResponse }
     * 
     */
    public PushHouseholderTreasurePrepayResponse createPushHouseholderTreasurePrepayResponse() {
        return new PushHouseholderTreasurePrepayResponse();
    }

    /**
     * Create an instance of {@link PushHouseholderParkPrepay }
     * 
     */
    public PushHouseholderParkPrepay createPushHouseholderParkPrepay() {
        return new PushHouseholderParkPrepay();
    }

    /**
     * Create an instance of {@link PushHouseholderParkPrepayResponse }
     * 
     */
    public PushHouseholderParkPrepayResponse createPushHouseholderParkPrepayResponse() {
        return new PushHouseholderParkPrepayResponse();
    }

    /**
     * Create an instance of {@link OpenElectronicTicketByReceiptId }
     * 
     */
    public OpenElectronicTicketByReceiptId createOpenElectronicTicketByReceiptId() {
        return new OpenElectronicTicketByReceiptId();
    }

    /**
     * Create an instance of {@link OpenElectronicTicketByReceiptIdResponse }
     * 
     */
    public OpenElectronicTicketByReceiptIdResponse createOpenElectronicTicketByReceiptIdResponse() {
        return new OpenElectronicTicketByReceiptIdResponse();
    }

    /**
     * Create an instance of {@link PushMonthlySecurityParkPerpay }
     * 
     */
    public PushMonthlySecurityParkPerpay createPushMonthlySecurityParkPerpay() {
        return new PushMonthlySecurityParkPerpay();
    }

    /**
     * Create an instance of {@link PushMonthlySecurityParkPerpayResponse }
     * 
     */
    public PushMonthlySecurityParkPerpayResponse createPushMonthlySecurityParkPerpayResponse() {
        return new PushMonthlySecurityParkPerpayResponse();
    }

    /**
     * Create an instance of {@link PayPrepaidFee }
     * 
     */
    public PayPrepaidFee createPayPrepaidFee() {
        return new PayPrepaidFee();
    }

    /**
     * Create an instance of {@link PayPrepaidFeeResponse }
     * 
     */
    public PayPrepaidFeeResponse createPayPrepaidFeeResponse() {
        return new PayPrepaidFeeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string", scope = ReceiveWeiXinData.class)
    public JAXBElement<String> createReceiveWeiXinDataString(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataString_QNAME, String.class, ReceiveWeiXinData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string1", scope = ReceiveWeiXinData.class)
    public JAXBElement<String> createReceiveWeiXinDataString1(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataString1_QNAME, String.class, ReceiveWeiXinData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = ReceiveWeiXinDataResponse.class)
    public JAXBElement<String> createReceiveWeiXinDataResponseReturn(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataResponseReturn_QNAME, String.class, ReceiveWeiXinDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string", scope = ReceiveWeiXinDataPreReleaseV1 .class)
    public JAXBElement<String> createReceiveWeiXinDataPreReleaseV1String(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataString_QNAME, String.class, ReceiveWeiXinDataPreReleaseV1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string1", scope = ReceiveWeiXinDataPreReleaseV1 .class)
    public JAXBElement<String> createReceiveWeiXinDataPreReleaseV1String1(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataString1_QNAME, String.class, ReceiveWeiXinDataPreReleaseV1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = ReceiveWeiXinDataPreReleaseV1Response.class)
    public JAXBElement<String> createReceiveWeiXinDataPreReleaseV1ResponseReturn(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataResponseReturn_QNAME, String.class, ReceiveWeiXinDataPreReleaseV1Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string", scope = UpdateHousePrepay.class)
    public JAXBElement<String> createUpdateHousePrepayString(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataString_QNAME, String.class, UpdateHousePrepay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string1", scope = UpdateHousePrepay.class)
    public JAXBElement<String> createUpdateHousePrepayString1(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataString1_QNAME, String.class, UpdateHousePrepay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = UpdateHousePrepayResponse.class)
    public JAXBElement<String> createUpdateHousePrepayResponseReturn(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataResponseReturn_QNAME, String.class, UpdateHousePrepayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string", scope = PushHouseholderTreasurePrepay.class)
    public JAXBElement<String> createPushHouseholderTreasurePrepayString(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataString_QNAME, String.class, PushHouseholderTreasurePrepay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string1", scope = PushHouseholderTreasurePrepay.class)
    public JAXBElement<String> createPushHouseholderTreasurePrepayString1(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataString1_QNAME, String.class, PushHouseholderTreasurePrepay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = PushHouseholderTreasurePrepayResponse.class)
    public JAXBElement<String> createPushHouseholderTreasurePrepayResponseReturn(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataResponseReturn_QNAME, String.class, PushHouseholderTreasurePrepayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string", scope = PushHouseholderParkPrepay.class)
    public JAXBElement<String> createPushHouseholderParkPrepayString(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataString_QNAME, String.class, PushHouseholderParkPrepay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string1", scope = PushHouseholderParkPrepay.class)
    public JAXBElement<String> createPushHouseholderParkPrepayString1(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataString1_QNAME, String.class, PushHouseholderParkPrepay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = PushHouseholderParkPrepayResponse.class)
    public JAXBElement<String> createPushHouseholderParkPrepayResponseReturn(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataResponseReturn_QNAME, String.class, PushHouseholderParkPrepayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string", scope = OpenElectronicTicketByReceiptId.class)
    public JAXBElement<String> createOpenElectronicTicketByReceiptIdString(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataString_QNAME, String.class, OpenElectronicTicketByReceiptId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string1", scope = OpenElectronicTicketByReceiptId.class)
    public JAXBElement<String> createOpenElectronicTicketByReceiptIdString1(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataString1_QNAME, String.class, OpenElectronicTicketByReceiptId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = OpenElectronicTicketByReceiptIdResponse.class)
    public JAXBElement<String> createOpenElectronicTicketByReceiptIdResponseReturn(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataResponseReturn_QNAME, String.class, OpenElectronicTicketByReceiptIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string", scope = PushMonthlySecurityParkPerpay.class)
    public JAXBElement<String> createPushMonthlySecurityParkPerpayString(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataString_QNAME, String.class, PushMonthlySecurityParkPerpay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string1", scope = PushMonthlySecurityParkPerpay.class)
    public JAXBElement<String> createPushMonthlySecurityParkPerpayString1(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataString1_QNAME, String.class, PushMonthlySecurityParkPerpay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = PushMonthlySecurityParkPerpayResponse.class)
    public JAXBElement<String> createPushMonthlySecurityParkPerpayResponseReturn(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataResponseReturn_QNAME, String.class, PushMonthlySecurityParkPerpayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string", scope = PayPrepaidFee.class)
    public JAXBElement<String> createPayPrepaidFeeString(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataString_QNAME, String.class, PayPrepaidFee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string1", scope = PayPrepaidFee.class)
    public JAXBElement<String> createPayPrepaidFeeString1(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataString1_QNAME, String.class, PayPrepaidFee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = PayPrepaidFeeResponse.class)
    public JAXBElement<String> createPayPrepaidFeeResponseReturn(String value) {
        return new JAXBElement<String>(_ReceiveWeiXinDataResponseReturn_QNAME, String.class, PayPrepaidFeeResponse.class, value);
    }

}
