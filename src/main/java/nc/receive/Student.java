package nc.receive;

import javax.xml.bind.annotation.XmlAttribute;

public class Student {
    
  private String studentid;  
     
  private String name;  
        
  private String address;  
  
  private String birthday;
  
  @XmlAttribute
  public String getBirthday() {
    return birthday;
  }
  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }
  @XmlAttribute
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  @XmlAttribute
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
   @XmlAttribute  
  public String getStudentid() {  
        return studentid;  
  }  
  public void setStudentid(String studentid) {  
       this.studentid = studentid;  
  }  
  
}  

