package pe.spring.project.security;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import pe.spring.project.security.entity.User;
import pe.spring.project.security.repository.IUserRepository;

@SpringBootTest
class SpringSecurityApplicationTests {

    @Autowired
    IUserRepository repository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Test
    void testUser() {
        User user = new User();
        user.username = "nicolas";
        user.password = encoder.encode("12345");
        User result = repository.save(user);
        Assertions.assertTrue(user.password.equalsIgnoreCase(result.password));
    }

}
