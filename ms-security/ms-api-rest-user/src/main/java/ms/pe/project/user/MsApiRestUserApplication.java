package ms.pe.project.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"ms.pe.project.commonuser.models.entity"})
@SpringBootApplication
public class MsApiRestUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsApiRestUserApplication.class, args);
	}

}
