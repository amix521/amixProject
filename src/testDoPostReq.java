

import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import com.amix.util.Base64ImgUtil;
import com.amix.util.HttpsConnectUtil;



public class testDoPostReq {

	public static void main(String[] args) throws IOException {

		HttpsConnectUtil httpsConnectUtil = new HttpsConnectUtil();
		Map<String, String> paramMap = new HashMap<String, String>();
			
		/*两照对比***********************************/
		Map<String, String> paramMap2 = new HashMap<String, String>();
		paramMap.put("id", "metro_node_000004");
		paramMap.put("apiName", "metro_node_000004");
		paramMap.put("terminalNo", "OSSOTID1000015");
		paramMap.put("realFace", URLEncoder.encode(Base64ImgUtil.GetImageStr("G:/PAYPCID2000000028_live.jpg"),"UTF-8"));
		paramMap.put("liveFace", URLEncoder.encode(Base64ImgUtil.GetImageStr("G:/PAYPCID2000000028_front.jpg"),"UTF-8"));
		paramMap.put("entryFlow", "01");
		paramMap.put("entryResult", "01");
		paramMap.put("customerId", "20180312101400");
		
		String jresMsg = httpsConnectUtil.doPost("http://172.20.14.63:8888/monitoringsystem/gateMessage",paramMap);
		
		System.out.println("resMsg->"+jresMsg);
		
	}

}
