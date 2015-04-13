package me.jiangyu.webcontainer.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jiangyukun on 15/4/13.
 */
public class ThreadUtil {
    public static final Logger logger = LoggerFactory.getLogger(ThreadUtil.class);

    public static void runThread(Runnable r) {
        runThread(r, 0);
    }

    public static void runThread(Runnable r, int ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
            logger.error(e.getMessage());
            System.exit(1);
        }
        Thread thread = new Thread(r);
        thread.start();
    }
}
