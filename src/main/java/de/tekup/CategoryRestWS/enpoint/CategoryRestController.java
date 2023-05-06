package de.tekup.CategoryRestWS.enpoint;

import de.tekup.CategoryRestWS.model.Category;
import de.tekup.CategoryRestWS.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/apiv1/categories")// specifier un path pour le web service
public class CategoryRestController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping
    public List<Category> categoryList() {

        return categoryService.categoryList();
    }


    @GetMapping(path = "/{id}")
    public Category getOne(@PathVariable Long id) {
        return categoryService.getOne(id);
    }

    @PostMapping
    public Category save(@RequestBody Category product) {

        return categoryService.save(product);
    }

    @PutMapping(path = "/{id}")
    public Category update(@RequestBody Category category, @PathVariable Long id) {
        return categoryService.update(category,id);
    }


    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        categoryService.delete(id);
    }

}

