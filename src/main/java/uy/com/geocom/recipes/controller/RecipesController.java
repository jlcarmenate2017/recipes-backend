package uy.com.geocom.recipes.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uy.com.geocom.recipes.repository.RecipesRepository;
import uy.com.geocom.recipes.services.RecipesService;
@RequestMapping("/recipe")
@Controller
@RequiredArgsConstructor
public class RecipesController {
    private final RecipesService recipesService;
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity all() {
        return new ResponseEntity<>(recipesService.getAllRecipes(), HttpStatus.OK);
    }
}
