/**
 * @Probject Name: nc-client
 * @Path: nc.queryQueryReconciliationDocumentsInfo.java
 * @Create By zhongjunbin
 * @Create In 2018年1月22日 下午3:15:37
 * TODO
 */
package nc.query;

import java.util.Date;

/**
 * @Class Name QueryReconciliationDocumentsInfo
 * @Author zhongjunbin
 * @Create In 2018年1月22日
 */
public class QueryReconciliationDocumentsInfo {
  private String ncCommunityId;
  private Date startTime;
  private Date endTime;
  private int pageSize;
  private int currentPage;
  /**
   * @Return the String ncCommunityId
   */
  public String getNcCommunityId() {
    return ncCommunityId;
  }
  /**
   * @Param String ncCommunityId to set
   */
  public void setNcCommunityId(String ncCommunityId) {
    this.ncCommunityId = ncCommunityId;
  }
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
   * @Return the int currentPage
   */
  public int getCurrentPage() {
    return currentPage;
  }
  /**
   * @Param int currentPage to set
   */
  public void setCurrentPage(int currentPage) {
    this.currentPage = currentPage;
  }
  
}
