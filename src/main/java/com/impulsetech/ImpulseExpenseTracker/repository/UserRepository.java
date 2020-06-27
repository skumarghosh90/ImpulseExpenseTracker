package com.impulsetech.ImpulseExpenseTracker.repository;

import java.util.Optional;

import com.impulsetech.ImpulseExpenseTracker.domain.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByEmailAddressIgnoreCase(String emailAddress);
}