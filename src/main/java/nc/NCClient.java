/**
 * @Probject Name: nc-client
 * @Path: ncNCClient.java
 * @Create By zhongjunbin
 * @Create In 2018年1月22日 上午8:25:44
 * TODO
 */
package nc;

import org.springframework.stereotype.Component;

/**
 * @Class Name NCClient
 * @Author zhongjunbin
 * @Create In 2018年1月22日
 */
@Component
public class NCClient {
  private static final String token = "NTk4NjcxNTUxMDgyNDgzODA2OTIzMzc5ODgwOTY1MzIyNTUwOTA=";
  private static final String url="http://61.143.165.17:9443/uapws/service/nc.itf.ws.hd.IQueryService";
  
  public NCResponse send(NCRequest request) throws TimeOutException {
    return null;
  }
}
