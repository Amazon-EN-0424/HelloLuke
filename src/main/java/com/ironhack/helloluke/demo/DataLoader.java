package com.ironhack.helloluke.demo;

import com.ironhack.helloluke.model.ForceUser;
import com.ironhack.helloluke.model.Jedi;
import com.ironhack.helloluke.model.Sith;
import com.ironhack.helloluke.repository.ForceUserRepository;
import com.ironhack.helloluke.repository.JediRepository;
import com.ironhack.helloluke.repository.SithRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private ForceUserRepository forceUserRepository;

    @Autowired
    private JediRepository jediRepository;

    @Autowired
    private SithRepository sithRepository;

    @Override
    public void run(String... args) throws Exception {

        var father = new ForceUser("Darth Vader");

        forceUserRepository.save(father);

        var luke = new Jedi("Luke Skywalker", "Green");
        jediRepository.save(luke);

        var darth = new Sith("Darth Maul",
                "Red",
                5L,
                10_000L,
                5L);

         sithRepository.save(darth);

    }
}
