package nc.receive;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @Class Name ReceiveAppData
 * @Author shizhukui
 * @Create In 2018年1月22日
 */

public class ReceiveUpdateData {
 
  
  private String tag;
  
  private String nrevlfmny;
  
  private String nrevmny;
  
  private String ts;
  
  private String pk_receivablesid;
  
  private String pk_corp;
  
  private String pk_managementsecid;
  
  private String pk_account;
 
  private String pay_way;
  
  private String pay_time;
  
  private String pay_id;
  
  private String pay_user_name;
  
  @XmlAttribute(name="tag")
  public String getTag() {
    return tag;
  }
  public void setTag(String tag) {
    this.tag = tag;
  }
  @XmlElement(name="nrevlfmny")
  public String getNrevlfmny() {
    return nrevlfmny;
  }
  public void setNrevlfmny(String nrevlfmny) {
    this.nrevlfmny = nrevlfmny;
  }
  @XmlElement(name="nrevmny")
  public String getNrevmny() {
    return nrevmny;
  }
  public void setNrevmny(String nrevmny) {
    this.nrevmny = nrevmny;
  }
  @XmlElement(name="ts")
  public String getTs() {
    return ts;
  }
  public void setTs(String ts) {
    this.ts = ts;
  }
  @XmlElement(name="pk_receivablesid")
  public String getPk_receivablesid() {
    return pk_receivablesid;
  }
  public void setPk_receivablesid(String pk_receivablesid) {
    this.pk_receivablesid = pk_receivablesid;
  }
  @XmlElement(name="pk_corp")
  public String getPk_corp() {
    return pk_corp;
  }
  public void setPk_corp(String pk_corp) {
    this.pk_corp = pk_corp;
  }
  @XmlElement(name="pk_managementsecid")
  public String getPk_managementsecid() {
    return pk_managementsecid;
  }
  public void setPk_managementsecid(String pk_managementsecid) {
    this.pk_managementsecid = pk_managementsecid;
  }
  @XmlElement(name="pk_account")
  public String getPk_account() {
    return pk_account;
  }
  public void setPk_account(String pk_account) {
    this.pk_account = pk_account;
  }
  @XmlElement(name="pay_way")
  public String getPay_way() {
    return pay_way;
  }
  public void setPay_way(String pay_way) {
    this.pay_way = pay_way;
  }
  @XmlElement(name="pay_time")
  public String getPay_time() {
    return pay_time;
  }
  public void setPay_time(String pay_time) {
    this.pay_time = pay_time;
  }
  @XmlElement(name="pay_id")
  public String getPay_id() {
    return pay_id;
  }
  public void setPay_id(String pay_id) {
    this.pay_id = pay_id;
  }
  
  @XmlElement(name="pay_user_name")
  public String getPay_user_name() {
    return pay_user_name;
  }
  public void setPay_user_name(String pay_user_name) {
    this.pay_user_name = pay_user_name;
  }
 
  

}
