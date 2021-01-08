package com.phyokyaw.services;

import com.phyokyaw.commands.IngredientCommand;

public interface IngredientService {


    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

}
