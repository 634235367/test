package nc.receive;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="ufinterface")
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlReceiveRespUfinterfaceRoot {
  
  
  @XmlAttribute(name="root")
  private String  root;
  
  @XmlAttribute(name="execstatus")
  private int execstatus;
  
  @XmlAttribute(name="billtype")
  private String  billtype;
  
  @XmlElement(name="exception")
  private  NcExceptionNode ncException;
  
  @XmlElement(name="revfares")
  private List<XmlRevfareNode> revfares;

  public String getRoot() {
    return root;
  }

  public void setRoot(String root) {
    this.root = root;
  }

  public int getExecstatus() {
    return execstatus;
  }

  public void setExecstatus(int execstatus) {
    this.execstatus = execstatus;
  }

  public String getBilltype() {
    return billtype;
  }

  public void setBilltype(String billtype) {
    this.billtype = billtype;
  }

  public NcExceptionNode getNcException() {
    return ncException;
  }

  public void setNcException(NcExceptionNode ncException) {
    this.ncException = ncException;
  }

  public List<XmlRevfareNode> getRevfares() {
    return revfares;
  }

  public void setRevfares(List<XmlRevfareNode> revfares) {
    this.revfares = revfares;
  }
  
  
 
}
