package com.baszczyk.intentiospring;

import com.baszczyk.intentiospring.data.data.user.Parish;
import com.baszczyk.intentiospring.data.data.user.User;
import com.baszczyk.intentiospring.repositories.ParishRepository;
import com.baszczyk.intentiospring.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDataBase {

    private static final Logger log = LoggerFactory.getLogger(LoadDataBase.class);

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository, ParishRepository parishRepository) {

      Parish parish = new Parish();

      User admin = new User();
      admin.setName("Monika");
      admin.setPassword("12345");


        return args -> {
          log.info("Parish " + parishRepository.save(parish));
          log.info("Preloading " + userRepository.save(admin));
        };
    }
}
