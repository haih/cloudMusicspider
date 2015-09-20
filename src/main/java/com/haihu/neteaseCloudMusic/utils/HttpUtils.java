package com.haihu.neteaseCloudMusic.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

public class HttpUtils {
	
	
	public static String GetMethod(String url){
		HttpClient httpClient = new DefaultHttpClient();
		
		HttpGet httpGet = new HttpGet(url);
		StringBuffer result= new StringBuffer();
		try {
			HttpResponse response = httpClient.execute(httpGet);	
			HttpEntity entity = response.getEntity();
			BufferedReader br = new BufferedReader(new InputStreamReader(entity.getContent()));
			String tmpString= "";
			while ((tmpString = br.readLine()) != null) {
				result.append(tmpString);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}
	
	
	public static String PostMethod(String url){
		HttpClient httpClient = new DefaultHttpClient();
		
		HttpPost httpPost = new HttpPost(url);
		try {
			HttpResponse response = httpClient.execute(httpPost);
			response.getEntity();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "";
	}
	public static void main(String[] args) {
		String songDetail = "http://music.163.com/api/song/detail/?id=28377211&ids=[28377211]";
		System.out.println(GetMethod(songDetail).toString());
	}
}
