package com.ironhack.helloluke.repository;

import com.ironhack.helloluke.model.Jedi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JediRepository extends JpaRepository<Jedi, UUID>{
}
