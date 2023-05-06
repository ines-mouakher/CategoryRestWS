package de.tekup.CategoryRestWS.service;

import de.tekup.CategoryRestWS.model.Category;
import de.tekup.CategoryRestWS.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryServiceImp implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> categoryList(){
        return categoryRepository.findAll();
    }

    @Override
    public Category getOne(Long id){
        return categoryRepository.findById(id).get();}

    @Override
    public Category save(Category category){
        return categoryRepository.save(category);
    }

    @Override
    public Category update(Category category, Long id){
        category.setId(id);
        return categoryRepository.save(category);
    }

    @Override
    public void delete(Long id){
        categoryRepository.deleteById(id);
    }
}


