/**
 * @Probject Name: nc-client
 * @Path: nc.nc_clientNCRequest.java
 * @Create By zhongjunbin
 * @Create In 2018年1月22日 上午8:24:00
 * TODO
 */
package nc;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import nc.query.QueryPRBillData;

/**
 * @Class Name NCRequest
 * @Author zhongjunbin
 * @Create In 2018年1月22日
 */
@XmlRootElement(name="ufinterface")
public class NCRequest {
  
  private QueryPRBillData query;

  /**
   * @Return the QueryPRBillDataRequest query
   */
  public QueryPRBillData getQuery() {
    return query;
  }

  /**
   * @Param QueryPRBillDataRequest query to set
   */
  @XmlElement(name ="query")
  public void setQuery(QueryPRBillData query) {
    this.query = query;
  }
  
  
  
}
