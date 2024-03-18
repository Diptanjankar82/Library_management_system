package com.management.LibraryManagementSystem.Repositories;

import com.management.LibraryManagementSystem.Entities.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;

//public interface CardRepository extends JpaRepository<Entities , DataType>
public interface CardRepository extends JpaRepository<LibraryCard,Integer> {


    // Why interface ? : due to abstraction point of view , because we should not about the internal implementation
    // here CardRepository is connected to CARD TABLE, when i write (CardRepository.save) it saves in LibraryCard Table



}
