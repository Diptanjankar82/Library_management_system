package com.management.LibraryManagementSystem.Services;

import com.management.LibraryManagementSystem.Enums.CardStatus;
import com.management.LibraryManagementSystem.Entities.LibraryCard;
import com.management.LibraryManagementSystem.Entities.Student;
import com.management.LibraryManagementSystem.Repositories.CardRepository;
import com.management.LibraryManagementSystem.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private StudentRepository studentRepository;
    public String generateCard(){
        //I want to save some cards to the Db

        LibraryCard card = new LibraryCard(); //The object will go to the DB and save it

        card.setCardStatus(CardStatus.NEW);
        card.setNoOfBookIssued(0);

        LocalDate expiryDate = LocalDate.of(2128, 6, 1);

        card.setValidity(expiryDate);

        card = cardRepository.save(card);

        return "The card has been generated with cardID " +card.getCardNo();
    }

    public String associateCardAndStudent(Integer cardId, Integer studentId){

        LibraryCard libraryCard = cardRepository.findById(cardId).get();
        Student student = studentRepository.findById(studentId).get();

          libraryCard.setCardStatus(CardStatus.ISSUED);

          libraryCard.setStudent(student); //indirectly setting the Foregin key in Library card table
          //but bcz we are playing with entities so we wwill have to set as per entity

        cardRepository.save(libraryCard);

        return "The card and student has been associated";
    }
}
