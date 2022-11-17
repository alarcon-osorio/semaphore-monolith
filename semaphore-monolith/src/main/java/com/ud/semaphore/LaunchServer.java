package com.ud.semaphore;

import com.ud.semaphore.logic.Client;
import com.ud.semaphore.logic.Server;

import java.io.IOException;

public class LaunchServer {

    public static void main(String[] args) throws IOException {
        Server server = new Server(8080);
        server.run();
    }

}
