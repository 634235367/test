package nc.receive;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;


@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class NcExceptionNode {
  
   
  @XmlElement(name="primarykey")
  private String primaryKey;
  @XmlElement(name="message")
  private String message;
  @XmlElement(name="exception_type")
  private String exceptionType;
  public String getPrimaryKey() {
    return primaryKey;
  }
  public void setPrimaryKey(String primaryKey) {
    this.primaryKey = primaryKey;
  }
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  public String getExceptionType() {
    return exceptionType;
  }
  public void setExceptionType(String exceptionType) {
    this.exceptionType = exceptionType;
  }
  
  

}
