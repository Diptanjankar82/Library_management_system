package com.management.LibraryManagementSystem.Controller;

import com.management.LibraryManagementSystem.Services.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("transactions")
public class TransactionsController {
    @Autowired
    private TransactionsService transactionsService;
    @PutMapping("issueBook")
    public String issueBook(@RequestParam("cardId") Integer cardId,
                            @RequestParam("bookId") Integer bookId){

        try {
            String result = transactionsService.issueBook(bookId,cardId);
            return result;
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @PutMapping("/returnBook")
    public String returnBook(@RequestParam("cardId")Integer cardId,
                             @RequestParam("bookId")Integer bookID){

        String result = transactionsService.returnBook(bookID,cardId);
        return result;
    }
}
