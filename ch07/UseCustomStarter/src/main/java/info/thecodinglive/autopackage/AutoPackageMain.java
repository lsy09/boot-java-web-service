package info.thecodinglive.autopackage;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@EnableAutoConfiguration
public class AutoPackageMain {
    public static void main(String ar[]) {
        SpringApplication app = new SpringApplication(AutoPackageMain.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.setLogStartupInfo(true);
        String[] args = {"--debug"};
        ConfigurableApplicationContext c = app.run(args);
        List<String> packages = AutoConfigurationPackages.get(c);
        System.out.println("packages : "+packages);
    }
}
