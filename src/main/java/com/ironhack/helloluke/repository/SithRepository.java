package com.ironhack.helloluke.repository;

import com.ironhack.helloluke.model.Sith;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SithRepository extends JpaRepository<Sith, UUID> {
}
