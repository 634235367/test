package nc.nc_client;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import nc.GetBuildings;
import nc.GetBuildingsResponse;
import nc.GetCommunities;
import nc.GetCommunitiesResponse;
import nc.GetCompanys;
import nc.GetCompanysResponse;
import nc.GetReconciliationDocumentsInfo;
import nc.GetReconciliationDocumentsInfoResponse;
import nc.NCRequest;
import nc.ObjectFactory;
import nc.QueryPRBillDataNetCommunityPreReleaseV1;
import nc.QueryPRBillDataNetCommunityPreReleaseV1Response;
import nc.my.test.GetReconciliationRequest;
import nc.my.test.ListToMap.DemoClass;
import nc.my.test.list2Map2;
import nc.query.NCPaymentVo;
import nc.query.QueryPRBillData;
import nc.query.QueryReconciliationDocumentsInfo;
import nc.receive.Classes;
import nc.receive.ReceiveMonthInfo;
import nc.receive.ReceiveUpdateData;
import nc.receive.Student;
import nc.receive.Ufinterface;
import nc.receive.XmlReceiveRespUfinterfaceRoot;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import receive.ReceiveWeiXinDataPreReleaseV1;
import receive.ReceiveWeiXinDataPreReleaseV1Response;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest extends WebServiceGatewaySupport {
  private static final Logger log = LoggerFactory.getLogger(AppTest.class);
  private static final String 小区ID="1002A8100000000000UK";
  List<NCPaymentVo> list=new ArrayList<NCPaymentVo>();
  @Test
  public void getBuildings() {
    ObjectFactory factory=new ObjectFactory();
    GetBuildings getBuildings = factory.createGetBuildings();
    WebServiceTemplate ws=getWebServiceTemplate();
    JAXBElement<String> value=factory.createGetBuildingsString("XML");
    JAXBElement<String> value1=factory.createGetBuildingsString1("NTk4NjcxNTUxMDgyNDgzODA2OTIzMzc5ODgwOTY1MzIyNTUwOTA=");
    
    getBuildings.setString(value);
    getBuildings.setString1(value1);
    
    ws.setMarshaller(marshaller());
    ws.setUnmarshaller(marshaller());
    
    GetBuildingsResponse response = (GetBuildingsResponse) getWebServiceTemplate().marshalSendAndReceive("http://61.143.165.17:9443/uapws/service/nc.itf.ws.hd.IQueryService", getBuildings);

    JAXBElement<String>r = response.getReturn();
    log.info(r.getName()+":"+r.getValue());
  }
  
  @Test
  public void getCompanys() {
    ObjectFactory factory=new ObjectFactory();
    GetCompanys getCompanys = factory.createGetCompanys();
    WebServiceTemplate ws=getWebServiceTemplate();
    JAXBElement<String> value=factory.createGetCompanysString("<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
        "<ufinterface root=\"query\">\r\n" + 
        "  <query>\r\n" + 
        "    <startTime/>\r\n" + 
        "    <endTime/>\r\n" + 
        "    <startMonth></startMonth>\r\n" + 
        "    <endMonth></endMonth>  \r\n" + 
        "    <idType>2</idType>  \r\n" + 
        "    <ids>1045A8100000002I1FW2</ids>\r\n" + 
        "    <currPage>1</currPage>\r\n" + 
        "    <pageSize>500</pageSize>\r\n" + 
        "  </query>\r\n" + 
        "</ufinterface>");
    JAXBElement<String> value1=factory.createGetCompanysString1("NTk4NjcxNTUxMDgyNDgzODA2OTIzMzc5ODgwOTY1MzIyNTUwOTA=");
    
    getCompanys.setString(value);
    getCompanys.setString1(value1);
    
    ws.setMarshaller(marshaller());
    ws.setUnmarshaller(marshaller());
    
    GetCompanysResponse response = (GetCompanysResponse) getWebServiceTemplate().marshalSendAndReceive("http://61.143.165.17:9443/uapws/service/nc.itf.ws.hd.IQueryService", getCompanys);

    JAXBElement<String>r = response.getReturn();
    log.info(r.getName()+":"+r.getValue());
  }
  
  @Test
  public void queryPRBillData_netCommunity_PreReleaseV1() {
    Date s = new Date();
    ObjectFactory factory=new ObjectFactory();
    QueryPRBillDataNetCommunityPreReleaseV1 request = factory.createQueryPRBillDataNetCommunityPreReleaseV1();
    WebServiceTemplate ws=getWebServiceTemplate();
    JAXBElement<String> value=factory.createQueryPRBillDataNetCommunityPreReleaseV1String("<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
        "<ufinterface root=\"query\">\r\n" + 
        "  <query>\r\n" + 
        "    <startTime/>\r\n" + 
        "    <endTime/>\r\n" + 
        "    <startMonth>2017-01-01</startMonth>\r\n" + 
        "    <endMonth>2018-01-01</endMonth>  \r\n" + 
        "    <idType>1</idType>  \r\n" +
        "    <ids>1002T910000000000ZL0</ids>\r\n" + 
        "    <ids>1045A8100000002I1FW2</ids>\r\n" + 
        "    <currPage>1</currPage>\r\n" + 
        "    <pageSize>500</pageSize>\r\n" + 
        "  </query>\r\n" + 
        "</ufinterface>");
     value=factory.createQueryPRBillDataNetCommunityPreReleaseV1String("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n" + 
         "<ns2:ufinterface xmlns:ns2=\"http://hd.ws.itf.nc/IQueryService\">\r\n" + 
         "    <query>\r\n" + 
         "    <startTime/>\r\n" + 
         "    <endTime/>\r\n" + 
         "    <startMonth>2017-01-01</startMonth>\r\n" + 
         "    <endMonth>2018-01-01</endMonth>  \r\n" + 
         "    <idType>1</idType>  \r\n" +
         "    <ids>1002T910000000000ZL0</ids>\r\n" + 
         "    <ids>1045A8100000002I1FW2</ids>\r\n" + 
         "    <currPage>1</currPage>\r\n" + 
         "    <pageSize>500</pageSize>\r\n" + 
         "    </query>\r\n" + 
         "</ns2:ufinterface>");
    JAXBElement<String> value1=factory.createQueryPRBillDataNetCommunityPreReleaseV1String1("NTk4NjcxNTUxMDgyNDgzODA2OTIzMzc5ODgwOTY1MzIyNTUwOTA=");
    
    request.setString(value);
    request.setString1(value1);
    
    ws.setMarshaller(marshaller());
    ws.setUnmarshaller(marshaller());
    
    QueryPRBillDataNetCommunityPreReleaseV1Response response = (QueryPRBillDataNetCommunityPreReleaseV1Response) getWebServiceTemplate().marshalSendAndReceive("http://61.143.165.17:9443/uapws/service/nc.itf.ws.hd.IQueryService", request);
    JAXBElement<String>r = response.getReturn();
    log.info(r.getName()+":"+r.getValue());
    Date  e = new Date();
    log.info(""+(e.getTime()-s.getTime()));
  }
  
  
  /**
   * 
   * @Methods Name getReconciliationDocumentsInfo
   * @Create In 2018年1月24日 By shizhukui void
   */
  
  public  boolean getReconciliationDocumentsInfo(GetReconciliationRequest req ) {
    Date s = new Date();
    ObjectFactory factory=new ObjectFactory();
    GetReconciliationDocumentsInfo request = factory.createGetReconciliationDocumentsInfo();
    WebServiceTemplate ws=getWebServiceTemplate();
   /* QueryReconciliationDocumentsBean query=new QueryReconciliationDocumentsBean();
    query.setCurrentPage(currentPapage);
    

   query.setStartTime(1503072000000L);

   query.setEndTime(1505836800000L); //2017.12.19  0.0.0
  
    query.setNcCommunityId(小区ID);
    query.setPageSize(500);*/
   
    ObjectMapper objectMapper = new ObjectMapper();
    String queryJson=null;
    try {
      queryJson = objectMapper.writeValueAsString(req);
    } catch (JsonProcessingException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    log.info("query:"+queryJson.toString());
    JAXBElement<String> value = factory.createGetReconciliationDocumentsInfoString(queryJson.toString());
    JAXBElement<String> value1=factory.createGetReconciliationDocumentsInfoString1("NTk4NjcxNTUxMDgyNDgzODA2OTIzMzc5ODgwOTY1MzIyNTUwOTA=");
    
    request.setString(value);
    request.setString1(value1);
    
    ws.setMarshaller(marshaller());
    ws.setUnmarshaller(marshaller());
    
    GetReconciliationDocumentsInfoResponse response = (GetReconciliationDocumentsInfoResponse) getWebServiceTemplate().marshalSendAndReceive("http://61.143.165.17:9443/uapws/service/nc.itf.ws.hd.IQueryService", request);
    JAXBElement<String>r = response.getReturn();
    log.info(r.getName()+":"+r.getValue()+"");
    
    
    JSONObject myJsonObject = new JSONObject(r.getValue().toString());
    String strArray =myJsonObject.getString("resultList");
    JSONArray json = JSONArray.fromObject(strArray ); 
    List<NCPaymentVo> list2 = JSONArray.toList(json, NCPaymentVo.class);// ;//参数1为要转换的JSONArray数据，参数2为要转换的目标数据，即List盛装的数据
    list.addAll(list2);
    
    
    for (int i = 0; i < list2.size(); i++) {
      NCPaymentVo  vo1=list2.get(i);
      for (int j = 0; j < list2.size(); j++) {
        NCPaymentVo  vo2=list2.get(j);
        
        if( i!=j && vo1.getNcPkRevfare().equals(vo2.getNcPkRevfare())  &&  vo1.getNcBillId().equals(vo2.getNcBillId())  && vo1.getNcReceiptNum().equals(vo2.getNcReceiptNum())){
          
          
            System.out.println(vo2.getNcBillId());
          }
        }
      
    }
    if(!json.isEmpty()){
      for(int i=0;i<json.length();i++){
        JSONObject job = json.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
       System.out.println(job.length()+"sss") ;  // 得到 每个对象中的属性值
     }
    }
     /* myJsonObject.t
      System.out.println(JSONArray.getString("resultList"));*/
    return json.isEmpty();
   
  /*  
    Date  e = new Date();
    log.info(""+(e.getTime()-s.getTime()));*/
  }
  
  
//  @Test
//  public void testAllRecon() {
//     for (int i = 1; i >0; i++) {
//         if(this.getReconciliationDocumentsInfo(i)) {
//           
//           System.out.println(i+"ssssssssssssssss");
//           break;
//         }
//     }
//    
//    
//  }
  public List<String> getCommunityIdList() {
    // TODO Auto-generated method stub
    
    List<String> ids=new ArrayList<String>();
    ids.add("1048T9100000000000RT");
  
    return ids;
  }    
  
  //对账\
  @Test
  public void makeReconciliationByCommunityId() {
    GetReconciliationRequest req = new GetReconciliationRequest();
    req.setCurrentPage(1);
    

    req.setStartTime(1501516800000L);
    req.setEndTime(1503158400000L);
    req.setPageSize(3000);
    List<String> ids=this.getCommunityIdList();
    for (int i = 0; i < ids.size(); i++) {
         req.setNcCommunityId(ids.get(i));
         this.getReconciliationDiffRecord(req);
    } 
  }
  
  /**
   * 
   * TODO
   * @return List<ReconciliationDiffRecord>
   */
  public void getReconciliationDiffRecord (GetReconciliationRequest req ) {
    for (int i = 1; i > 0; i++) {
      req.setCurrentPage(i);
      if (this.getReconciliationDocumentsInfo(req)) {
         
        System.out.println(i + "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
        break;
      }
    }
  }
  
  
  @Test
  public void getCommunitiesRequest() {
    Date s = new Date();
    ObjectFactory factory=new ObjectFactory();
    GetCommunities request = factory.createGetCommunities();
    WebServiceTemplate ws=getWebServiceTemplate();
    QueryReconciliationDocumentsInfo query=new QueryReconciliationDocumentsInfo();
    query.setCurrentPage(1);
    query.setEndTime(new Date(1506355200000L));
    query.setNcCommunityId("1002A8100000000000UJ");
    query.setPageSize(500);
    Date d=new Date();
    d.setYear(2017);
    query.setStartTime(d);
    ObjectMapper objectMapper = new ObjectMapper();
    String queryJson=null;
    try {
      queryJson = objectMapper.writeValueAsString(query);
    } catch (JsonProcessingException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    log.info("query:"+queryJson);
    JAXBElement<String> value=factory.createQueryPRBillDataNetCommunityPreReleaseV1String("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n" + 
        "<ns2:ufinterface xmlns:ns2=\"http://hd.ws.itf.nc/IQueryService\">\r\n" + 
        "    <query>\r\n" + 
        "    <startTime/>\r\n" + 
        "    <endTime/>\r\n" + 
        "    <startMonth>2017-01-01</startMonth>\r\n" + 
        "    <endMonth>2018-01-01</endMonth>  \r\n" + 
        "    <currPage>1</currPage>\r\n" + 
        "    <pageSize>500</pageSize>\r\n" + 
        "    </query>\r\n" + 
        "</ns2:ufinterface>");
    JAXBElement<String> value1=factory.createQueryPRBillDataNetCommunityPreReleaseV1String1("NTk4NjcxNTUxMDgyNDgzODA2OTIzMzc5ODgwOTY1MzIyNTUwOTA=");
    
    request.setString(value);
    request.setString1(value1);
    
    ws.setMarshaller(marshaller());
    ws.setUnmarshaller(marshaller());
    
    GetCommunitiesResponse response = (GetCommunitiesResponse) getWebServiceTemplate().marshalSendAndReceive("http://61.143.165.17:9443/uapws/service/nc.itf.ws.hd.IQueryService", request);
    JAXBElement<String>r = response.getReturn();
    log.info(r.getName()+":"+r.getValue());
    Date  e = new Date();
    log.info(""+(e.getTime()-s.getTime()));
  }
  
  
  public Jaxb2Marshaller marshaller() {
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    // this package must match the package in the <generatePackage> specified in
    // pom.xml
    marshaller.setContextPath("nc");
    return marshaller;
  }
  
  @Test
  public void testMarshal() {
    QueryPRBillData query = new QueryPRBillData();
    NCRequest req = new NCRequest();
    req.setQuery(query);
    JAXBContext context;    
    try {    
        context = JAXBContext.newInstance(QueryPRBillData.class);    
        Marshaller mar = context.createMarshaller();    
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);    
        mar.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");    
            
        StringWriter writer = new StringWriter();
        
        mar.marshal(req, writer);
            
        System.out.println(writer.toString());    
    } catch (JAXBException e) {    
        e.printStackTrace();    
    }    
  } 

  
  public Jaxb2Marshaller marshaller2() {
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    // this package must match the package in the <generatePackage> specified in
    // pom.xml
    marshaller.setContextPath("receive");
    return marshaller;
  }
   
  @Test
  public  void receiveAppData() {
    Date s = new Date();
    receive.ObjectFactory factory=new receive.ObjectFactory();
    ReceiveWeiXinDataPreReleaseV1  request = factory.createReceiveWeiXinDataPreReleaseV1();
    WebServiceTemplate ws=getWebServiceTemplate(); 
/*  String  xmlStr="<?xml version=\"1.0\" encoding=\"gb2312\"?>\r\n" + 
        "<ufinterface root=\"update\" billtype=\"RECEIVABLES_UPDATE\" vsourcebilltype=\"JTWXJF\">\r\n" + 
        "<month>\r\n" + 
        "    <update tag=\"1\">\r\n" + 
        "      <nrevlfmny>0.01</nrevlfmny>\r\n" + 
        "      <nrevmny>0.01</nrevmny>\r\n" + 
        "      <ts>2017-09-29 17:31:17</ts>\r\n" + 
        "      <pk_receivablesid>1002A3100000001BQQE4</pk_receivablesid>\r\n" + 
        "      <pk_corp>1002</pk_corp>\r\n" + 
        "      <pk_managementsecid>aa</pk_managementsecid>\r\n" + 
        "      <pk_account>3602002909200071111</pk_account>\r\n" + 
        "      <pay_way>alipay</pay_way>\r\n" + 
        "      <pay_time>1506056777000</pay_time>\r\n" + 
        "      <pay_id>20170922130558-2364260632723457</pay_id>\r\n" + 
        "      <pay_user_name>黄**</pay_user_name>\r\n" + 
        "    </update>\r\n" + 
        "  </month>\r\n" + 
        "</ufinterface>";*/
   
      String  xmlStr="<?xml version=\"1.0\" encoding=\"gb2312\"?>\r\n" + 
        "<ufinterface root=\"update\" billtype=\"RECEIVABLES_UPDATE\" vsourcebilltype=\"JTWXJF\">\r\n" + 
        "<month>\r\n" + 
        "    <update tag=\"1\">\r\n" + 
        "      <nrevlfmny>0</nrevlfmny>\r\n" + 
        "      <nrevmny>131.1</nrevmny>\r\n" + 
        "      <ts>2017-09-01 10:48:50</ts>\r\n" + 
        "      <pk_receivablesid>1002A8100000000ZK5HX</pk_receivablesid>\r\n" + 
        "      <pk_corp>1002</pk_corp>\r\n" + 
        "      <pk_managementsecid>1002A8100000000000UK</pk_managementsecid>\r\n" + 
        "      <pk_account>3602002909200071111</pk_account>\r\n" + 
        "      <pay_way>weixin</pay_way>\r\n" + 
        "      <pay_time>1506056777000</pay_time>\r\n" + 
        "      <pay_id>20170822130558-2364260632723457</pay_id>\r\n" + 
        "      <pay_user_name>林**</pay_user_name>\r\n" + 
        "    </update>\r\n" + 
        "  </month>\r\n" + 
        "</ufinterface>";
    
   
    
    System.out.println(xmlStr);
    
    
   /* 
    String  xmlStr="<?xml version=\"1.0\" encoding=\"gb2312\"?>\r\n" + 
        "<ufinterface root=\"update\" billtype=\"RECEIVABLES_UPDATE\" vsourcebilltype=\"JTWXJF\">\r\n" + 
        "  <month>\r\n" + 
        "    <update tag=\"1\">\r\n" + 
        "      <nrevlfmny>0</nrevlfmny>\r\n" + 
        "      <nrevmny>1</nrevmny>\r\n" + 
        "      <ts>2017-04-01 09:30:24</ts>\r\n" + 
        "      <pk_receivablesid>1048A8100000000J4RFJ</pk_receivablesid>\r\n" + 
        "      <pk_corp>1048</pk_corp>\r\n" + 
        "      <pk_managementsecid>1048T9100000000000RU</pk_managementsecid>\r\n" + 
        "      <pk_account>223429562115</pk_account>\r\n" + 
        "      <pay_way>alipay</pay_way>\r\n" + 
        "      <pay_time>1506056777000</pay_time>\r\n" + 
        "      <pay_id>20170922130558-2364260632723457</pay_id>\r\n" + 
        "      <pay_user_name>李晓峰</pay_user_name>\r\n" + 
        "</update>\r\n" + 
        "<update tag=\"2\">\r\n" + 
        "      <nrevlfmny>0</nrevlfmny>\r\n" + 
        "      <nrevmny>1</nrevmny>\r\n" + 
        "      <ts>2017-04-01 09:30:24</ts>\r\n" + 
        "      <pk_receivablesid>1048A8100000000J4RFJ</pk_receivablesid>\r\n" + 
        "      <pk_corp>1048</pk_corp>\r\n" + 
        "      <pk_managementsecid>1048T9100000000000RU</pk_managementsecid>\r\n" + 
        "      <pk_account>223429562115</pk_account>\r\n" + 
        "      <pay_way>alipay</pay_way>\r\n" + 
        "      <pay_time>1506056777000</pay_time>\r\n" + 
        "      <pay_id>20170922130558-2364260632723457</pay_id>\r\n" + 
        "      <pay_user_name>李晓峰</pay_user_name>\r\n" + 
        "    </update>\r\n" + 
        "  </month>\r\n" + 
        "</ufinterface>";
    */
    /*String  xmlStr="<?xml version=\"1.0\" encoding=\"gb2312\"?>\r\n" + 
        "<ufinterface root=\"update\" billtype=\"RECEIVABLES_UPDATE\" vsourcebilltype=\"JTWXJF\">\r\n" + 
        "<month>\r\n" + 
        "    <update tag=\"1\">\r\n" + 
        "      <nrevlfmny>0</nrevlfmny>\r\n" + 
        "      <nrevmny>20</nrevmny>\r\n" + 
        "      <ts>2017-08-10 09:38:52</ts>\r\n" + 
        "      <pk_receivablesid>1002A8100000001ARFD9</pk_receivablesid>\r\n" + 
        "      <pk_corp>1048</pk_corp>\r\n" + 
        "      <pk_managementsecid>1048T9100000000000RU</pk_managementsecid>\r\n" + 
        "      <pk_account>223429562115</pk_account>\r\n" + 
        "      <pay_way>alipay</pay_way>\r\n" + 
        "      <pay_time>1506056777000</pay_time>\r\n" + 
        "      <pay_id>20170922130558-2364260632723457</pay_id>\r\n" + 
        "      <pay_user_name>陈**</pay_user_name>\r\n" + 
        "    </update>\r\n" + 
        "  </month>\r\n" + 
        "</ufinterface>";*/
    /*try {
      xmlStr=this.testWinXin();
      log.info("xml:"+xmlStr);
    } catch (JAXBException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }*/
    JAXBElement<String> value=factory.createReceiveWeiXinDataPreReleaseV1String(xmlStr);
    JAXBElement<String> value1=factory.createReceiveWeiXinDataPreReleaseV1String1("NTk4NjcxNTUxMDgyNDgzODA2OTIzMzc5ODgwOTY1MzIyNTUwOTA=");
    request.setString(value);
    request.setString1(value1);
    
    ws.setMarshaller(marshaller2());
    ws.setUnmarshaller(marshaller2());
    
    ReceiveWeiXinDataPreReleaseV1Response response = (ReceiveWeiXinDataPreReleaseV1Response)getWebServiceTemplate().marshalSendAndReceive("http://61.143.165.17:9443/uapws/service/nc.itf.ws.hd.IReceiveAppData", request);
    JAXBElement<String> r = response.getReturn();
    log.info(r.getName()+":"+r.getValue());
    Date  e = new Date();
    log.info(""+(e.getTime()-s.getTime()));
  }
  
  @Test
  public  void testStudent() throws JAXBException {
    
    
      //创建一个班级  
      Classes classes = new Classes();  
      classes.setClassid("045");  
      classes.setDesc("重点班");  
        
      //创建学生  
      for(int i=0;i<5;i++){  
         Student s = new Student();  
          s.setStudentid(String.valueOf(20140+i));  
          s.setName("学生"+i);  
          s.setAddress("地址"+i);  
          s.setBirthday("生日"+i);  
          classes.addStudent(s);  
      }  
      Writer  sw=new StringWriter();  
      //创建一个class.xml  
      /*String xml =""; */        
      JAXBContext context = JAXBContext.newInstance(Classes.class);
      
      Marshaller marshaller = context.createMarshaller();  
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);  
      marshaller.marshal(classes, sw);
      
     /* System.out.println(sw.toString()+"sssssssssss")*/
     /* Unmarshaller unmarshaller = context.createUnmarshaller();  
      Classes unclasses = (Classes) unmarshaller.unmarshal(xml);  
      System.out.println(unclasses); */ 

}
  
 
  public  String  testWinXin() throws JAXBException {
    
    
      //创建一个ufinterface  
    Ufinterface ufinterface = new Ufinterface();  
    ReceiveMonthInfo mf=new ReceiveMonthInfo();   
    List<ReceiveUpdateData>   update=new ArrayList<ReceiveUpdateData>(); 
    List<ReceiveMonthInfo>   month=new ArrayList<ReceiveMonthInfo>(); 
    
    
    
    
      //创建学生  
      for(int i=1;i<=1;i++){ 
        ReceiveUpdateData receive=new ReceiveUpdateData();
       
        receive.setTag(""+i);
        receive.setNrevlfmny("0");
        receive.setNrevmny("20");
        receive.setTs("2017-08-10 09:38:52");
        receive.setPk_receivablesid("1002A8100000001ARFD9");
        receive.setPk_corp("1048");
        receive.setPk_managementsecid("1048T9100000000000RU");
        receive.setPk_account("223429562115");
        receive.setPay_way("alipay");
        receive.setPay_time("1506056777000");
        receive.setPay_id("20170922130558-2364260632723457");
        receive.setPay_user_name("李晓峰");
        update.add(receive);
      }
      
      ReceiveMonthInfo mf1=new ReceiveMonthInfo();
      List<ReceiveUpdateData>   update1=new ArrayList<ReceiveUpdateData>(); 
      List<ReceiveMonthInfo>   month1=new ArrayList<ReceiveMonthInfo>();
      
      for(int i=5;i<5;i++){ 
        ReceiveUpdateData receive1=new ReceiveUpdateData();
       
        receive1.setTag(""+i);
        receive1.setNrevlfmny("0");
        receive1.setNrevmny("84.2");
        receive1.setTs("2017-04-01 09:30:24");
        receive1.setPk_receivablesid("1048A8100000000J4RFJ");
        receive1.setPk_corp("1048");
        receive1.setPk_managementsecid("1048T9100000000000RU");
        receive1.setPk_account("223429562115");
        receive1.setPay_way("alipay");
        receive1.setPay_time("1506056777000");
        receive1.setPay_id("20170922130558-2364260632723457");
        receive1.setPay_user_name("李晓峰");
        update1.add(receive1);
      }
      mf.setUpdate(update);
     
      
      
      month.add(mf);
      
      
    
   
      ufinterface.setMonth(month);  
       Writer  sw=new StringWriter();  
      //创建一个class.xml  
      /*String xml =""; */        
      JAXBContext context = JAXBContext.newInstance(Ufinterface.class);
      
      Marshaller marshaller = context.createMarshaller();  
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
      marshaller.setProperty(Marshaller.JAXB_ENCODING, "gb2312");
      marshaller.marshal(ufinterface, sw);
      return sw.toString();
     /* Unmarshaller unmarshaller = context.createUnmarshaller();  
      Classes unclasses = (Classes) unmarshaller.unmarshal(xml);  
      System.out.println(unclasses); */ 

}
  
  
  @Test
  public  void testWinXin2() throws JAXBException {
    
    
      //创建一个ufinterface  
    Ufinterface ufinterface = new Ufinterface();  
    ReceiveMonthInfo mf=new ReceiveMonthInfo();   
    List<ReceiveUpdateData>   update=new ArrayList<ReceiveUpdateData>(); 
    List<ReceiveMonthInfo>   month=new ArrayList<ReceiveMonthInfo>(); 
      //创建学生  
      for(int i=0;i<5;i++){ 
        ReceiveUpdateData receive=new ReceiveUpdateData();
       
        receive.setTag(""+i);
        receive.setNrevlfmny("0");
        receive.setNrevmny("84.2");
        receive.setTs("2017-04-01 09:30:24");
        receive.setPk_receivablesid("1048A8100000000J4RFJ");
        receive.setPk_corp("1048");
        receive.setPk_managementsecid("1048T9100000000000RU");
        receive.setPk_account("223429562115");
        receive.setPay_way("alipay");
        receive.setPay_time("1506056777000");
        receive.setPay_id("20170922130558-2364260632723457");
        receive.setPay_user_name("李晓峰");
        mf.addUpdate(receive);
      }
     
      ReceiveMonthInfo mf1=new ReceiveMonthInfo();
      List<ReceiveUpdateData>   update1=new ArrayList<ReceiveUpdateData>(); 
      List<ReceiveMonthInfo>   month1=new ArrayList<ReceiveMonthInfo>();
      
      for(int i=5;i<10;i++){ 
        ReceiveUpdateData receive1=new ReceiveUpdateData();
       
        receive1.setTag(""+i);
        receive1.setNrevlfmny("0");
        receive1.setNrevmny("84.2");
        receive1.setTs("2017-04-01 09:30:24");
        receive1.setPk_receivablesid("1048A8100000000J4RFJ");
        receive1.setPk_corp("1048");
        receive1.setPk_managementsecid("1048T9100000000000RU");
        receive1.setPk_account("223429562115");
        receive1.setPay_way("alipay");
        receive1.setPay_time("1506056777000");
        receive1.setPay_id("20170922130558-2364260632723457");
        receive1.setPay_user_name("李晓峰");
        mf1.addUpdate(receive1);
      }
      ufinterface.addMonth(mf);
      ufinterface.addMonth(mf1);
      
       Writer  sw=new StringWriter();  
      //创建一个class.xml  
      /*String xml =""; */        
      JAXBContext context = JAXBContext.newInstance(Ufinterface.class);
      
      Marshaller marshaller = context.createMarshaller();  
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true); 
      marshaller.setProperty(Marshaller.JAXB_ENCODING, "gb2312");
      marshaller.marshal(ufinterface, sw);
      System.out.println(sw.toString()+"sssssssssss");
     /* Unmarshaller unmarshaller = context.createUnmarshaller();  
      Classes unclasses = (Classes) unmarshaller.unmarshal(xml);  
      System.out.println(unclasses); */ 

}
  @Test 
  public void testListToMap() {
     
           List<DemoClass> list = new ArrayList<DemoClass>();  
             for (int i = 0; i < 10000; i++) {  
                 list.add(new DemoClass(i,"aaa"));  
             }  
             long start1 = System.nanoTime();  
             //list2Map1(list,"id");  //2265651285  
            Map a= new list2Map2().list2Map2(list,"id",DemoClass.class); //95193405    
             //list2Map3(list,"getId",DemoClass.class);  
             //Map<Integer,DemoClass> map = traditionalWay(list); //75825131  
             long end1 = System.nanoTime();  
             log.info("result:"+a+((DemoClass)a.get(1000)).getName());   
             System.out.println(end1 - start1); 

     
   }
  
  
  @Test
  public  void testXmlToJavaBean() {
    String xmlStr="<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
        "<ufinterface root=\"exception\" billtype=\"archivesdata\" execstatus=\"0\">\r\n" + 
        "  <exception>\r\n" + 
        "    <primarykey/>\r\n" + 
        "    <message>执行成功!</message>\r\n" + 
        "    <exception_type>archivesdata</exception_type>\r\n" + 
        "  </exception>\r\n" + 
        "  <revfares>\r\n" + 
        "    <revfare>\r\n" + 
        "      <ncPkRevfare>收款单主键</ncPkRevfare>\r\n" + 
        "      <ncPkreceivables>收费清单主键</ncPkreceivables>\r\n" + 
        "      <totalPayment>收款单总额（元）</totalPayment>\r\n" + 
        "      <payTime>2017-10-26 07:21:11(收款时间)</payTime>\r\n" + 
        "    </revfare>\r\n" + 
        "    <revfare>\r\n" + 
        "      <ncPkRevfare>收款单主键</ncPkRevfare>\r\n" + 
        "      <ncPkreceivables>收费清单主键</ncPkreceivables>\r\n" + 
        "      <totalPayment>收款单总额（元）</totalPayment>\r\n" + 
        "      <payTime>收款时间</payTime>\r\n" + 
        "    </revfare>\r\n" + 
        "  </revfares>\r\n" + 
        "</ufinterface>";
    
    
    
    
    
    nc.receive.XmlReceiveRespUfinterfaceRoot root = null;
    try {
      JAXBContext context = JAXBContext.newInstance(XmlReceiveRespUfinterfaceRoot.class);
      Unmarshaller unmarshaller = context.createUnmarshaller();
      root = (XmlReceiveRespUfinterfaceRoot) unmarshaller.unmarshal(new StringReader(xmlStr));
    } catch (JAXBException e) {
      
    }
      System.out.println(root.getExecstatus()); 
    
    
  }
  
  
    
    
  
}
