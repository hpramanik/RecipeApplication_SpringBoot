package io.hspx.recipe.services;

import io.hspx.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Recipe findById(Long id);

    Set<Recipe> getRecipes();
}
