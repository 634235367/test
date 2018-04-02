package nc.receive;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class ReceiveMonthInfo {
  
 
  private List<ReceiveUpdateData>   update=new ArrayList<ReceiveUpdateData>();
  
  
  @XmlElement(name="update")
  public List<ReceiveUpdateData> getUpdate() {
    return update;
  }

  public void setUpdate(List<ReceiveUpdateData> update) {
    this.update = update;
  }
  
  public  void  addUpdate(ReceiveUpdateData s) {
    update.add(s);
  }
}
