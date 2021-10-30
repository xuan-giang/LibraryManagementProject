package com.example.librarymanagementproject.controller;

import com.example.librarymanagementproject.model.Category;
import com.example.librarymanagementproject.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/category/view")
    public String manageCategory(Model model)
    {
        List<Category> categoryList = categoryService.getAllCategory();
        model.addAttribute("list_object",categoryList);
        return "category/manage";
    }

    @GetMapping(value = "/category/add")
    public ModelAndView addCategory(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/category/add");
        model.addAttribute("category", new Category());
        return modelAndView;
    }

    @PostMapping(value = "/category/save")
    public RedirectView createCategory(@RequestParam(value = "id",defaultValue = "0") int id,@RequestParam("idSach") String idSach, @RequestParam("name") String name)
    {
        Category category;
        if(id != 0){
            category = categoryService.getById(id);
        } else{
            category = new Category();
        }
        category.setName(name);
        category.setIdSach(idSach);
        category.setQuantity(0);
        categoryService.createNewCategory(category);

        return new RedirectView("/category/view", true);
    }

    //api update
    @GetMapping("/category/update")
    public ModelAndView updateCategoryById(@RequestParam("id")int id,Model model){
        Category category = categoryService.getById(id);
        model.addAttribute("category",category);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/category/add");
        return modelAndView;
    }

    @GetMapping("/category/delete")
    public RedirectView deleteCategoryById(@RequestParam("id")int id){
        categoryService.deleteCategoryById(id);
        return new RedirectView("/category/view", true);
    }
}
