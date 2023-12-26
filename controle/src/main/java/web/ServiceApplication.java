package web;

import dao.entities.User;
import dao.repositories.UserManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;




@SpringBootApplication

public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(UserManager userManager) {
        return args -> {
            List<User> creators = List.of(User.builder().nom("x")
                    .email("x@gmail.com").build(), User.builder().nom("y")
                    .email("y@gmail.com").build(), User.builder().nom("z")
                    .email("e@gmail.com").build(), User.builder().nom("e")
                    .email("z@gmail.com").build());
            for (User user : users) {
                UserManager.save(user);
            }
}
