package com.ecommerce.project.service.impls;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private static long CATEGORY_ID = 1;
    final private List<Category> categories = new ArrayList<>();
    @Override
    public List<Category> getAllCategory() {
        return categories;
    }
    @Override
    public void createCategory(Category category) {
        category.setCategoryId(CATEGORY_ID++);
        categories.add(category);
    }
}