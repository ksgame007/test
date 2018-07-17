package com.kingdee.test;

import java.util.HashMap;
import java.util.Map;

/**
 * 取s-HR系统主数据写入第三方系统代码样例
 *
 */
public class SyncMainDataFromSHRTool {
	public static void main(String[] args) {
		//1.获取当前系统的某单据数据放到dataMap中
		Map dataMap = new HashMap();

		String serverUrl = "http://127.0.0.1:6888/shr";//s-HR服务器的地址，部署到测试环境，应该是取 shr-ssoClient.properties的server.url
		com.kingdee.shr.api.SHRClient shrClient = new com.kingdee.shr.api.SHRClient();
		try {
			//调用s-HR系统，服务名为 inteOAGetAdminOrgDataService 的OSF 获取s-HR系统的组织信息
			com.kingdee.shr.api.Response response = shrClient.executeService(serverUrl, "inteOAGetAdminOrgDataService", dataMap);
			System.out.printf("ss");
			//response为OSF返回的结果JSON串，需要解析JSON串后，按照情况新增或更新到第三方系统
			//...

		} catch (Exception e) {
			//调用有异常发生，可能是单点没有配置好，OSF调用发生异常等等
			e.printStackTrace();
		}

	}
}
