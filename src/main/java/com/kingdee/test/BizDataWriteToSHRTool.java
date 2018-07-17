package com.kingdee.test;

import java.util.HashMap;
import java.util.Map;

/**
 * 取OA数据写入s-HR系统某单据代码样例
 *
 */
public class BizDataWriteToSHRTool {
	public static void main(String[] args) {
		Map dataMap = new HashMap();
		//1.获取当前系统的某单据数据放到dataMap中
		//dataMap.put("xxxAttr1",xxxVal1);
		//dataMap.put("xxxAttr2",xxxVal2);
		//dataMap.put("xxxAttr3",xxxVal3);
		//....

		String serverUrl = "http://172.19.112.139:6888/shr";//s-HR服务器的地址，部署到测试环境，应该是取 shr-ssoClient.properties的server.url
		com.kingdee.shr.api.SHRClient shrClient = new com.kingdee.shr.api.SHRClient();
		try {
			//调用s-HR系统，服务名为 writeXXXBizBillServiceExt 的OSF 写入s-HR系统
			//writeXXXBizBillServiceExt负责处理写入s-HR系统数据的逻辑，如果涉及到多个对象的更新，为保证提交的事务性，需要额外定义一个Facade
			com.kingdee.shr.api.Response response = shrClient.executeService(serverUrl, "writeXXXBizBillServiceExt", dataMap);
			//response为OSF返回的结果，根据返回情况，可以做其他一些额外的逻辑处理
			//...

		} catch (Exception e) {
			//调用有异常发生，可能是单点没有配置好，OSF调用发生异常等等
			e.printStackTrace();
		}

	}
}
