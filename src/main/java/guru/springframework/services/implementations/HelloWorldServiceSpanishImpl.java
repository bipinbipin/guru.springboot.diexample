package guru.springframework.services.implementations;

import guru.springframework.services.HelloWorldService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by Bipin on 6/6/2016.
 */
//@Component
//@Profile("spanish")
public class HelloWorldServiceSpanishImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Hola Mundo!";
    }
}
