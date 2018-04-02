/**
 * @Probject Name: nc-client
 * @Path: nc.queryQueryReconciliationDocumentsInfo.java
 * @Create By zhongjunbin
 * @Create In 2018年1月22日 下午3:15:37
 * TODO
 */
package nc.query;

import java.security.Timestamp;
import java.util.Date;

/**
 * @Class Name QueryReconciliationDocumentsInfo
 * @Author zhongjunbin
 * @Create In 2018年1月22日
 */
public class QueryReconciliationDocumentsBean {
  private String ncCommunityId;
  private long startTime;
  private long endTime;
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
  
  /**
   * @Return the int pageSize
   */
  
  /**
   * @Param int pageSize to set
   */
  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }
  
 
  
  public long getStartTime() {
    return startTime;
  }
  public void setStartTime(long startTime) {
    this.startTime = startTime;
  }
  public long getEndTime() {
    return endTime;
  }
  public void setEndTime(long endTime) {
    this.endTime = endTime;
  }
  public int getPageSize() {
    return pageSize;
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
