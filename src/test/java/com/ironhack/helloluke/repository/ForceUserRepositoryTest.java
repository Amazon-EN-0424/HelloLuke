package com.ironhack.helloluke.repository;

import com.ironhack.helloluke.model.ForceUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
class ForceUserRepositoryTest {

    @Autowired
    private ForceUserRepository forceUserRepository;

    ForceUser father;

    @BeforeEach
    void setup() {
        father = new ForceUser("Darth Vader");
        forceUserRepository.save(father);
    }

    @Test
    void test_addUser() {

        var beforeCount = forceUserRepository.count();
        var newUser = new ForceUser("Jean-Luc Picard");
        forceUserRepository.save(newUser);
        assertEquals(1, forceUserRepository.count() - beforeCount);
    }

    @Test
    void test_deleteUser() {
        var beforeCount = forceUserRepository.count();
        forceUserRepository.deleteById(father.getId());
        assertEquals( beforeCount - 1, forceUserRepository.count());
    }

}