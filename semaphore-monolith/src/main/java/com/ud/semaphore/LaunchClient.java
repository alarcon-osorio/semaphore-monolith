package com.ud.semaphore;

import com.ud.semaphore.logic.Client;

public class LaunchClient {
    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }
}