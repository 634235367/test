package nc.receive;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ufinterface")
public class Ufinterface {
  
  private String  root="update";
  
  
  private String  billtype="RECEIVABLES_UPDATE";
  
   
  private String  vsourcebilltype="JTWXJF";
  
  
  private List<ReceiveMonthInfo> month=new ArrayList<ReceiveMonthInfo>();
  
  
  @XmlAttribute(name="root")
  public String getRoot() {
    return root;
  }
  public void setRoot(String root) {
    this.root = root;
  }
  @XmlAttribute(name="billtype")
  public String getBilltype() {
    return billtype;
  }
  public void setBilltype(String billtype) {
    this.billtype = billtype;
  }
  @XmlAttribute(name="vsourcebilltype")
  public String getVsourcebilltype() {
    return vsourcebilltype;
  }
  public void setVsourcebilltype(String vsourcebilltype) {
    this.vsourcebilltype = vsourcebilltype;
  }
  @XmlElement(name="month")
  public List<ReceiveMonthInfo> getMonth() {
    return month;
  }
  public void setMonth(List<ReceiveMonthInfo> month) {
    this.month = month;
  }
  public void addMonth(ReceiveMonthInfo s){  
    month.add(s);  
}  
  
}
