package com.phyokyaw.controllers;

import com.phyokyaw.domain.Category;
import com.phyokyaw.domain.UnitOfMeasure;
import com.phyokyaw.repositories.CategoryRepository;
import com.phyokyaw.repositories.UnitOfMeasureRepository;
import com.phyokyaw.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
