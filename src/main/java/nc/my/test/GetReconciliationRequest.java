package nc.my.test;

import java.util.Date;

/**
 * 
 * @Class Name GetReconciliationRequest
 * @Author shizhukui
 * @Create In 2018年1月25日
 */
public class GetReconciliationRequest {
  private String ncCommunityId;
  private long startTime;
  private long endTime;
  private int pageSize;
  private int currentPage;

  public String getNcCommunityId() {
    return ncCommunityId;
  }

  public void setNcCommunityId(String ncCommunityId) {
    this.ncCommunityId = ncCommunityId;
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

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public int getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(int currentPage) {
    this.currentPage = currentPage;
  }



}
