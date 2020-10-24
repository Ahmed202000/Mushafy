package com.hegazy.mushafy;

import java.io.Serializable;

public class AuthorClass implements Serializable {
    public String name;
    public String servername;
    public String server;

    public AuthorClass(String servername, String name, String server) {
        this.name = name;
        this.servername = servername;
        this.server = server;
    }
}
