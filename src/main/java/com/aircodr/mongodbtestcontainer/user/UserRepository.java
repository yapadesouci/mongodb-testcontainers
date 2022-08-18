package com.aircodr.mongodbtestcontainer.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    @Query(sort = "{rating: 1}")
    List<User> findAllByRatingBetween(int min, int max);
}
