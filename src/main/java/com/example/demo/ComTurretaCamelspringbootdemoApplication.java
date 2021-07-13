package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class ComTurretaCamelspringbootdemoApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ComTurretaCamelspringbootdemoApplication.class, args);
        System.out.println("Ok");
        runAsService();
    }

    private static synchronized void runAsService() {
        while (true) {
            try {
                TimeUnit.MINUTES.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}