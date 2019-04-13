package stock.walmart.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("stock.walmart.repo")
@EntityScan("stock.walmart.entity")
@ComponentScan("stock.walmart")
public class WalmartApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalmartApplication.class, args);
	}

}

