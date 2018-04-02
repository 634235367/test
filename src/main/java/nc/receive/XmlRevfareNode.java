package nc.receive;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlRevfareNode {
  
  @XmlElement(name="ncPkRevfare")
  private String ncPkRevfare;
  @XmlElement(name="ncPkreceivables")
  private String ncPkreceivables;
  @XmlElement(name="totalPayment")
  private String totalPayment;
  @XmlElement(name="payTime")
  private String payTime;
  public String getNcPkRevfare() {
    return ncPkRevfare;
  }
  public void setNcPkRevfare(String ncPkRevfare) {
    this.ncPkRevfare = ncPkRevfare;
  }
  public String getNcPkreceivables() {
    return ncPkreceivables;
  }
  public void setNcPkreceivables(String ncPkreceivables) {
    this.ncPkreceivables = ncPkreceivables;
  }
  public String getTotalPayment() {
    return totalPayment;
  }
  public void setTotalPayment(String totalPayment) {
    this.totalPayment = totalPayment;
  }
  public String getPayTime() {
    return payTime;
  }
  public void setPayTime(String payTime) {
    this.payTime = payTime;
  }
   
}
