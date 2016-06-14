package guru.springframework.services;

import guru.springframework.services.implementations.HelloWorldServiceEnglishImpl;
import guru.springframework.services.implementations.HelloWorldServiceFrenchImpl;
import guru.springframework.services.implementations.HelloWorldServiceGermanImpl;
import guru.springframework.services.implementations.HelloWorldServiceSpanishImpl;

/**
 * Created by Bipin on 6/6/2016.
 */
public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String language) {
        HelloWorldService service = null;

        switch(language) {

            case "en":
                service = new HelloWorldServiceEnglishImpl();
                break;

            case "fr":
                service = new HelloWorldServiceFrenchImpl();
                break;

            case "de":
                service = new HelloWorldServiceGermanImpl();
                break;

            case "es":
                service = new HelloWorldServiceSpanishImpl();
                break;

            default:
                service = new HelloWorldServiceEnglishImpl();

        }

        return service;
    }
}
