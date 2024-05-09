package org.example.server;

import jakarta.xml.ws.Endpoint;
import org.example.webservice.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
    }
}
