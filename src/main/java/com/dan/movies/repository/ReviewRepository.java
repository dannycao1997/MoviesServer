package com.dan.movies.repository;

import com.dan.movies.entity.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
