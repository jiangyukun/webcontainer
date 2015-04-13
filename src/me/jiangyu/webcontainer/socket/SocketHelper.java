package me.jiangyu.webcontainer.socket;

import me.jiangyu.webcontainer.util.ThreadUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by jiangyukun on 15/4/13.
 */
public class SocketHelper {
    public static final Logger logger = LoggerFactory.getLogger(ThreadUtil.class);
    private int port;

    private SocketHelper() {
    }

    public SocketHelper(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        final ServerSocket serverSocket = new ServerSocket(port);
        while (true) {
            ThreadUtil.runThread(new Runnable() {
                @Override
                public void run() {
                    Socket server = null;
                    InputStream inputStream;
                    try {
                        server = serverSocket.accept();
                        inputStream = server.getInputStream();
                    } catch (IOException e) {
                        logger.error(e.getMessage(), e);
                    }

                }
            });
        }
    }

    public static void main(String[] args) {

    }
}
