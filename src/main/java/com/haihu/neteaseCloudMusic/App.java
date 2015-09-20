package com.haihu.neteaseCloudMusic;

import com.haihu.neteaseCloudMusic.utils.HttpUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String url = "http://music.163.com/api/song/detail/?id=28377211&ids=[28377211]";
    	DataHandler.songDetail(HttpUtils.GetMethod(url));
    }
}
