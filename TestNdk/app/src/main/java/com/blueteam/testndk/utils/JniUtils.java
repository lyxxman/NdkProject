package com.blueteam.testndk.utils;

/**
 * @author ly
 * @version V1.0
 * @Package com.blueteam.testndk.utils
 * @Description:
 * @date 2016/7/11 16:44
 */
public class JniUtils {
    static {
        System.loadLibrary("TestJni");
    }
    public native String getStringFromC();

}
