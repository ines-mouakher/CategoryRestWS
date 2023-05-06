package de.tekup.CategoryRestWS.service;

import de.tekup.CategoryRestWS.model.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> categoryList();
    public Category getOne(Long id);
    public Category save(Category category);
    public Category update(Category category, Long id);
    public void delete(Long id);

}
