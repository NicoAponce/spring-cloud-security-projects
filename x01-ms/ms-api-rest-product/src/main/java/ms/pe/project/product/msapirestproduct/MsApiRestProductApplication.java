package ms.pe.project.product.msapirestproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsApiRestProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsApiRestProductApplication.class, args);
	}

}
