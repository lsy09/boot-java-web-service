package info.thecodinglive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import info.thecodinglive.service.*;

@SpringBootApplication
@ComponentScan(basePackages = "info.thecodinglive.service", basePackageClasses = HelloService.class)
public class UseCustomStarterApp {
    public static void main(String ar[]) {
        SpringApplication.run(UseCustomStarterApp.class, ar).getBean(HelloService.class).hi();
    }
}
