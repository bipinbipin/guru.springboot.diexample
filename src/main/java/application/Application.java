package application;

import guru.springframework.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ComponentScan("guru.springframework")
@ImportResource("classpath:/spring/spring-config.xml")
public class Application {

	public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        GreetingController controller = (GreetingController) ctx.getBean("greetingController");

        controller.sayHello();
	}
}
