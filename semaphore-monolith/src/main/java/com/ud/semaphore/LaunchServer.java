package com.ud.semaphore;

import com.ud.semaphore.logic.Server;

import java.io.IOException;

public class LaunchServer {

    public static void main(String[] args) throws IOException {
        Server server = new Server(9001);
        server.run();
    }

}
