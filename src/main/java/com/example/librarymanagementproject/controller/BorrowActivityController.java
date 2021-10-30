package com.example.librarymanagementproject.controller;

import com.example.librarymanagementproject.model.BorrowActivity;
import com.example.librarymanagementproject.model.Category;
import com.example.librarymanagementproject.repository.BookRepository;
import com.example.librarymanagementproject.repository.ReaderRepository;
import com.example.librarymanagementproject.service.BookService;
import com.example.librarymanagementproject.service.BorrowActivityService;
import com.example.librarymanagementproject.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Date;
import java.util.List;

@Controller
public class BorrowActivityController {

    @Autowired
    private BorrowActivityService borrowActivityService;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private ReaderRepository readerRepository;

    @Autowired
    private BookService bookService;

    @Autowired
    private ReaderService readerService;

    @GetMapping(value = "/borrow/view")
    public String manageBorrow(Model model)
    {
        List<BorrowActivity> borrowActivityList = borrowActivityService.getAllBorrowActivity();
        model.addAttribute("list_object",borrowActivityList);
        return "borrow/manage";
    }

    @GetMapping(value = "/borrow/add")
    public ModelAndView addBorrowActivity(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/borrow/add");
        model.addAttribute("borrow", new BorrowActivity());
        return modelAndView;
    }

    @PostMapping(value = "/borrow/save")
    public RedirectView createBorrowActivity(@RequestParam(value = "id",defaultValue = "0") int id, @RequestParam("book") int book_id, @RequestParam("reader") int reader_id, @RequestParam("borrowFrom") Date borrowFrom, @RequestParam("borrowTo") Date borrowTo, @RequestParam("actualReturn") Date actualReturn, @RequestParam("deposit") String deposit )
    {
        BorrowActivity borrowActivity;
        if(id != 0){
            borrowActivity = borrowActivityService.getById(id);
        } else{
            borrowActivity = new BorrowActivity();
        }
        borrowActivity.setBorrowTo(borrowTo);
        borrowActivity.setBorrowFrom(borrowFrom);
        borrowActivity.setDeposit(deposit);

        borrowActivity.setActualReturn(actualReturn);

        borrowActivity.setBook(bookService.getById(book_id));
//        bookRepository.findById(book_id).map(book -> {
//            borrowActivity.setBook(book);
//
//            return borrowActivityService.createNewBorrowActivity(borrowActivity);
//        });

        readerRepository.findById(reader_id).map(reader -> {
            borrowActivity.setReader(reader);
            return borrowActivityService.createNewBorrowActivity(borrowActivity);
        });

        borrowActivityService.createNewBorrowActivity(borrowActivity);

        return new RedirectView("/borrow/view", true);
    }

    //api update
    @GetMapping("/borrow/update")
    public ModelAndView updateBorrowActivityById(@RequestParam("id")int id,Model model){
        BorrowActivity borrowActivity = borrowActivityService.getById(id);
        model.addAttribute("borrow",borrowActivity);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/borrow/add");
        return modelAndView;
    }

    @GetMapping("/borrow/delete")
    public RedirectView deleteCategoryById(@RequestParam("id")int id){
        borrowActivityService.deleteBorrowActivityById(id);
        return new RedirectView("/borrow/view", true);
    }

}
