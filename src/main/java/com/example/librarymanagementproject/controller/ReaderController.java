package com.example.librarymanagementproject.controller;

import com.example.librarymanagementproject.model.Category;
import com.example.librarymanagementproject.model.Reader;
import com.example.librarymanagementproject.service.ReaderService;
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
public class ReaderController {

    @Autowired
    private ReaderService readerService;

    @GetMapping(value = "/reader/view")
    public String manageReader(Model model)
    {
        List<Reader> readerList = readerService.getAllReader();
        model.addAttribute("list_object",readerList);
        return "reader/manage";
    }

    @GetMapping(value = "/reader/add")
    public ModelAndView addReader(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/reader/add");
        model.addAttribute("reader", new Reader());
        return modelAndView;
    }

    @PostMapping(value = "/reader/save")
    public RedirectView createCategory(@RequestParam(value = "id",defaultValue = "0") int id,@RequestParam("idReader") String idReader, @RequestParam("name") String name, @RequestParam("gender") String gender, @RequestParam("phone") String phone, @RequestParam("email") String email, @RequestParam("address") String address)
    {
        Reader reader;
        if(id != 0){
            reader = readerService.getById(id);
        } else{
            reader = new Reader();
        }
        reader.setIdReader(idReader);
        reader.setName(name);
        reader.setAddress(address);
        reader.setEmail(email);
        reader.setPhone(phone);
        reader.setGender(gender);
        readerService.createNewReader(reader);

        return new RedirectView("/reader/view", true);
    }

    @GetMapping(value = "/reader/delete")
    public RedirectView deleteById(@RequestParam("id")int id){
        readerService.deleteReaderById(id);
        return new RedirectView("/reader/view", true);
    }

    //api update
    @GetMapping("/reader/update")
    public ModelAndView updateById(@RequestParam("id")int id,Model model){
        Reader reader = readerService.getById(id);
        model.addAttribute("reader",reader);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/reader/edit");
        return modelAndView;
    }

}
