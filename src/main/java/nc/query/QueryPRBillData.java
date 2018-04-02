/**
 * @Probject Name: nc-client
 * @Path: ncQueryPRBillDataRequest.java
 * @Create By zhongjunbin
 * @Create In 2018年1月22日 上午8:32:02
 * TODO
 */
package nc.query;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import nc.NCRequest;

/**
 * @Class Name QueryPRBillDataRequest
 * @Author zhongjunbin
 * @Create In 2018年1月22日
 */
@XmlRootElement(name="query")
public class QueryPRBillData extends NCRequest{
  @XmlElement(name="startTime")
  private Date startTime;
  @XmlElement(name="endTime")
  private Date endTime;
  @XmlElement(name="pageSize")
  private int pageSize;
  @XmlElement(name="startMonth")
  private Date startMonth;
  @XmlElement(name="endMonth")
  private Date endMonth;
  @XmlElement(name="idType")
  private int idType;
  @XmlElement(name="ids")
  private String ids;
  @XmlElement(name="currPage")
  private int currPage;
  /**
   * @Return the Date startTime
   */
  public Date getStartTime() {
    return startTime;
  }
  /**
   * @Param Date startTime to set
   */
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }
  /**
   * @Return the Date endTime
   */
  public Date getEndTime() {
    return endTime;
  }
  /**
   * @Param Date endTime to set
   */
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }
  /**
   * @Return the int pageSize
   */
  public int getPageSize() {
    return pageSize;
  }
  /**
   * @Param int pageSize to set
   */
  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }
  /**
   * @Return the Date startMonth
   */
  public Date getStartMonth() {
    return startMonth;
  }
  /**
   * @Param Date startMonth to set
   */
  public void setStartMonth(Date startMonth) {
    this.startMonth = startMonth;
  }
  /**
   * @Return the Date endMonth
   */
  public Date getEndMonth() {
    return endMonth;
  }
  /**
   * @Param Date endMonth to set
   */
  public void setEndMonth(Date endMonth) {
    this.endMonth = endMonth;
  }
  /**
   * @Return the int idType
   */
  public int getIdType() {
    return idType;
  }
  /**
   * @Param int idType to set
   */
  public void setIdType(int idType) {
    this.idType = idType;
  }
  /**
   * @Return the String ids
   */
  public String getIds() {
    return ids;
  }
  /**
   * @Param String ids to set
   */
  public void setIds(String ids) {
    this.ids = ids;
  }
  /**
   * @Return the int currPage
   */
  public int getCurrPage() {
    return currPage;
  }
  /**
   * @Param int currPage to set
   */
  public void setCurrPage(int currPage) {
    this.currPage = currPage;
  }
  
  }
