package com.ironhack.helloluke.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Sith extends ForceUser{

    private String favouriteSithLord;

    private Long numberOfKittensSaved;

    private Long hoursSpentOnSithTraining;

    private Long explodingKittensSurvived;

    public Sith(String name,
                String favouriteSithLord,
                Long numberOfKittensSaved,
                Long hoursSpentOnSithTraining,
                Long explodingKittensSurvived) {
        super(name);
        this.favouriteSithLord = favouriteSithLord;
        this.numberOfKittensSaved = numberOfKittensSaved;
        this.hoursSpentOnSithTraining = hoursSpentOnSithTraining;
        this.explodingKittensSurvived = explodingKittensSurvived;
    }
}
