package com.ironhack.helloluke.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Jedi extends ForceUser{

    private String favouriteLightsaberColor;

    public Jedi(String name, String lightsaberColor) {
        super(name);
        this.favouriteLightsaberColor = lightsaberColor;
    }
}
