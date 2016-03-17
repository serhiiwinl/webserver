package main;

import org.eclipse.jetty.server.Server;

/**
 * Created by Sergii on 02.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Server server = new Server(8080);
        System.out.println("Server started");
    }
}
