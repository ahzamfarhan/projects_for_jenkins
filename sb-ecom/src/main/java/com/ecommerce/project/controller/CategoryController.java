package com.ecommerce.project.controller;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {
    final private CategoryService categoryService;
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping("/api/public/categories")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategory();
    }
    @PostMapping("/api/public/categories")
    public String createCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
        return "Category has been added successfully";
    }

    /*
    @DeleteMapping("/api/admin/categories/{categoryId}")
    public List<Category> deleteCategory(@PathVariable(name = "categoryId") Long categoryId) {
        return categoryService.deleteCategory(categoryId);
    }

     */
}