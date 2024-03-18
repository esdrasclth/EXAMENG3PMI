package com.example.EXAMENG3PMI;

public class APIConexion {
    private static final String BASE_ENDPOINT = "http://192.168.1.7/APIServerContactos/";

    public static String extraerEndpoint() {
        return BASE_ENDPOINT;
    }
}