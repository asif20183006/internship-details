package com.internship.internshipdetails.sevice;

import com.internship.internshipdetails.dao.InternDetailsRepo;
import com.internship.internshipdetails.entities.InternDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternDetailsService {
    @Autowired
    InternDetailsRepo internDetailsRepo;
    public List<InternDetails> getAllInternDetails() {
        try {
            return (List<InternDetails>) internDetailsRepo.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public InternDetails getInternDetailsByRegNo(int regNo){
        try {
            return internDetailsRepo.findById(regNo).orElse(null);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
