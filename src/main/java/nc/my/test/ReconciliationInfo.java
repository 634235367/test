package nc.my.test;

import java.util.ArrayList;
import java.util.List;

public class ReconciliationInfo {
  private  String execstatus;
  private  String message;
  private  List<ResultInfo> list=new ArrayList<ResultInfo>();
  public String getExecstatus() {
    return execstatus;
  }
  public void setExecstatus(String execstatus) {
    this.execstatus = execstatus;
  }
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  public List<ResultInfo> getList() {
    return list;
  }
  public void setList(List<ResultInfo> list) {
    this.list = list;
  }
  

}
