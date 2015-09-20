/**
 * 
 */
package com.haihu.neteaseCloudMusic;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @author E545
 *
 */
public class DataHandler {
	public static void songDetail(String rawData){
		try {
			JSONObject jObject = JSONObject.fromObject(rawData);
			JSONArray jsonArray = JSONArray.fromObject(jObject.get("songs"));	
			System.out.println(jsonArray.get(0));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
