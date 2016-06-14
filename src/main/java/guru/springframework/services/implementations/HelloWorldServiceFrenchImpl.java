package guru.springframework.services.implementations;

import guru.springframework.services.HelloWorldService;

/**
 * Created by Bipin on 6/6/2016.
 */
public class HelloWorldServiceFrenchImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Bonjour le Monde";
    }
}
