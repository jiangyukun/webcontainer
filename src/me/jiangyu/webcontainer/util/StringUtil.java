package me.jiangyu.webcontainer.util;

/**
 * Created by jiangyukun on 15/4/13.
 */
public class StringUtil {
    /**
     * 字符串是否为空，null或者为空字符串
     *
     * @param str 要检测的字符串
     * @return
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
