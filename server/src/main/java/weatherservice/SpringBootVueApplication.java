package weatherservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import weatherservice.service.ThirdPartyDataService;
import weatherservice.service.ThirdPartyDataServiceImpl;

/**
 * @author Todd Kofford
 *
 */

@SpringBootApplication(scanBasePackages = "weatherservice")
@EnableCaching
public class SpringBootVueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootVueApplication.class, args);
	}

    @Bean
    public ThirdPartyDataService weatherService() {
        return new ThirdPartyDataServiceImpl();
    }

}

