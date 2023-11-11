package com.baszczyk.intentiospring;

import com.baszczyk.intentiospring.repositories.UserRepository;
import com.baszczyk.intentiospring.data.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDataBase {

    private static final Logger log = LoggerFactory.getLogger(LoadDataBase.class);

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository) {

        User user = new User();
        user.setName("Monika");
        user.setPassword("12345");

        User user2 = new User();
        user.setName("Jakub");
        user.setPassword("12345");

        return args -> {
            log.info("Preloading " + userRepository.save(user));
            log.info("Preloading " + userRepository.save(user2));
        };
    }
}
