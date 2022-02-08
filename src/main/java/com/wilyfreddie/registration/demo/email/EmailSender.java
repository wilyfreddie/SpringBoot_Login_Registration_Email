package com.wilyfreddie.registration.demo.email;

public interface EmailSender {
    void send(String to, String body);
}
