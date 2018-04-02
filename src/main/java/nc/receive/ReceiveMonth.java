package nc.receive;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public class ReceiveMonth {
  
  private List<ReceiveUpdateData>   update;
  
  @XmlElement(name="update")
  public List<ReceiveUpdateData> getUpdate() {
    return update;
  }

  public void setUpdate(List<ReceiveUpdateData> update) {
    this.update = update;
  }
  

}
