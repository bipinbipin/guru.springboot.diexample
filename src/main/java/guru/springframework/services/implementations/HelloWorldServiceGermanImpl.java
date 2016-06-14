package guru.springframework.services.implementations;

import guru.springframework.services.HelloWorldService;

/**
 * Created by Bipin on 6/6/2016.
 */
public class HelloWorldServiceGermanImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hallo Welt";
    }
}
