package com.internship.internshipdetails.dao;

import com.internship.internshipdetails.entities.InternDetails;
import org.springframework.data.repository.CrudRepository;

public interface InternDetailsRepo extends CrudRepository<InternDetails, Integer> {

}
