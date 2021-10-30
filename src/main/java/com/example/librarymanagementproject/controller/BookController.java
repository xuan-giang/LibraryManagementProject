package com.example.librarymanagementproject.controller;

import com.example.librarymanagementproject.model.Book;
import com.example.librarymanagementproject.model.Category;
import com.example.librarymanagementproject.model.Reader;
import com.example.librarymanagementproject.repository.BookRepository;
import com.example.librarymanagementproject.repository.CategoryRepository;
import com.example.librarymanagementproject.service.BookService;
import com.example.librarymanagementproject.service.CategoryService;
import com.example.librarymanagementproject.validator.PhotoUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/login")
    public String viewLogin()
    {
        return "login";
    }

    @GetMapping("/thongke")
    public String viewChart()
    {
        return "charts/chart1";
    }

    @GetMapping("/home")
    public String viewHome()
    {
        return "home";
    }

    @GetMapping(value = "/book/view")
    public String manageReader(Model model)
    {
        List<Book> bookList = bookService.getAllBook();
        model.addAttribute("list_object",bookList);
        return "book/manage";
    }

    @GetMapping(value = "/book/add")
    public ModelAndView addBook(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/book/add");
        model.addAttribute("book", new Book());
        return modelAndView;
    }

    @PostMapping("/book/save")
    public RedirectView createBook(@RequestParam("imageUrl") MultipartFile multipartFile,@RequestParam(value = "id",defaultValue = "0") int id, @RequestParam("idBook") String idBook, @RequestParam(value = "name") String name,
                                 @RequestParam("publisher") String publisher, @RequestParam("author") String author, @RequestParam(value = "quantity") int quantity, @RequestParam(value = "category") int id_category) throws IOException {
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        Book book;
        if(id != 0)
        {
            book = bookService.getById(id);
        }else {
            book = new Book();
            categoryService.updateQuantityCategoryById(id_category);
        }


        book.setImageUrl(fileName);
        book.setIdBook(idBook);
        book.setAuthor(author);
        book.setName(name);
        book.setQuantity(quantity);
        book.setPublisher(publisher);

//        Category category = new Category();
//        category = categoryService.getById(id_category);
//        book.setCategory(category);


        categoryRepository.findById(id_category).map(category -> {
            book.setCategory(category);

            return bookService.createNewBook(book);
        });
        bookService.createNewBook(book);

        String uploadDir = "src/main/webapp/resources/dist/img/user-photos/";

        PhotoUploadUtil.savePhoto(uploadDir, fileName, multipartFile);

        return new RedirectView("/book/view", true);
    }

    @GetMapping(value = "/book/delete")
    public RedirectView deleteBookById(@RequestParam("id")int id){
        bookService.deleteBookById(id);
        return new RedirectView("/book/view", true);
    }

    //api update
    @GetMapping("/book/update")
    public ModelAndView updateBookById(@RequestParam("id")int id,Model model){
        Book book = bookService.getById(id);
        model.addAttribute("book",book);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/book/edit");
        return modelAndView;
    }
}
