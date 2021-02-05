package uy.com.geocom.recipes.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uy.com.geocom.recipes.dto.Recipe;
import uy.com.geocom.recipes.repository.RecipesRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipesServiceImpl implements RecipesService {
    private final RecipesRepository recipesRepository;
    @Override
    public List<Recipe> getAllRecipes() {
        return recipesRepository.findAll();
    }
}
