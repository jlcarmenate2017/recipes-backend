package uy.com.geocom.recipes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uy.com.geocom.recipes.dto.Recipe;

@Repository
public interface RecipesRepository extends JpaRepository<Recipe,Long> {
}
