package org.example.rechercheville;

import java.util.List;

public class RechercheVille {
    private List<String> villes;

    public List<String> rechercher(String mot) throws NotFoundException {
        if (mot.length() < 2) {
            throw new NotFoundException("La recherche doit contenir au moins 2 caractères");
        }

        return villes;
    }
}



