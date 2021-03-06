package guru.springframework.config;

import guru.springframework.services.HelloWorldFactory;
import guru.springframework.services.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * Created by Bipin on 6/7/2016.
 */
@Configuration
public class HelloConfig {

//    @Bean
//    public HelloWorldFactory helloWorldFactory() {
//        return new HelloWorldFactory();
//    }

//    @Bean
//    @Profile("english")
//    @Primary
//    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory) {
//        return factory.createHelloWorldService("en");
//    }

//    @Bean
//    @Profile("french")
//    @Primary
//    public HelloWorldService helloWorldServiceFrench(HelloWorldFactory factory) {
//        return factory.createHelloWorldService("fr");
//    }

//    @Bean
//    public HelloWorldService helloWorldServiceGerman(HelloWorldFactory factory) {
//        return factory.createHelloWorldService("de");
//    }

//    @Bean(name = "spanish")
//    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory) {
//        return factory.createHelloWorldService("es");
//    }
}
