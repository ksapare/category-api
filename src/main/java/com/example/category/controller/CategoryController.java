package com.example.category.controller;

import com.example.category.entity.Category;
import com.example.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/v1/category/")
    public List<Category> getListOfCategoriesWithItems(){
        return categoryService.getListOfCategoriesWithItems();
    }
}
