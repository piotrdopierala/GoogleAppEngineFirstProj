package pl.dopierala.GoogleAppEngineFirstProj.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        StringBuilder message = new StringBuilder("Hello Google App Engine!");
        try {
            InetAddress ip = InetAddress.getLocalHost();
            message.append(" From host: ").append(ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return message.toString();
    }
}
