package com.example.category.service;

import com.example.category.entity.Category;
import com.example.category.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getListOfCategoriesWithItems() {
        return categoryRepository.findAll();
    }
}
