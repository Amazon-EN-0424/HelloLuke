package com.ironhack.helloluke.repository;

import com.ironhack.helloluke.model.ForceUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ForceUserRepository extends JpaRepository<ForceUser, UUID> {
}
