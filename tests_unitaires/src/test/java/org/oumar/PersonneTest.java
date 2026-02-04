package org.oumar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonneTest {

    @Test
    @DisplayName("Vérification sur la personne")
    void CheckPerson() {
        Personne personne = new Personne("ABAKAR", "Oumar Abdallah", 27, "2 Rue Saint Theodore App 15, 13001 Marseille");
        assertAll(
                "Person",
                () -> assertEquals("ABAKAR", personne.getName(), "Nom doit être ABAKAR."),
                () -> assertEquals("Oumar Abdallah", personne.getFirstname(), "Prénom doit être Oumar Abdallah."),
                () -> assertEquals(27, personne.getOld(), "Oumar doit avoir 27 ans."),
                () -> assertEquals("2 Rue Saint Theodore App 15, 13001 Marseille", personne.getAdresse(), "Adresse doit être 2 Rue Saint Theodore App 15, 13001 Marseille.")
        );
    }

    @Test
    void getFirstname() {
    }

    @Test
    void getOld() {
    }

    @Test
    void getAdresse() {
    }
}