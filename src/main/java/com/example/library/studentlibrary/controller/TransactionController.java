package com.example.library.studentlibrary.controller;

import com.example.library.studentlibrary.models.Transaction;
import com.example.library.studentlibrary.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Add required annotations
@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;
    //Add required annotations
    @PostMapping("/transaction/issueBook")
    public ResponseEntity issueBook(@RequestParam("cardId") int cardId, @RequestParam("bookId") int bookId) throws Exception{
        transactionService.issueBook(cardId, bookId);
       return new ResponseEntity<>("transaction completed", HttpStatus.ACCEPTED);
    }

    //Add required annotations
    @PostMapping("/transaction/returnBook")
    public ResponseEntity returnBook(@RequestParam("cardId") int cardId, @RequestParam("bookId") int bookId) throws Exception{
        transactionService.returnBook(cardId, bookId);
        return new ResponseEntity<>("transaction completed", HttpStatus.ACCEPTED);
    }
}
