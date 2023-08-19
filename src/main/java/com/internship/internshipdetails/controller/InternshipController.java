package com.internship.internshipdetails.controller;

import com.internship.internshipdetails.entities.InternDetails;
import com.internship.internshipdetails.sevice.InternDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/internship")
public class InternshipController {
    @Autowired
    InternDetailsService internDetailsService;
    @GetMapping("/intern-details")
    public ResponseEntity<List<InternDetails>> getAllInternDetails() {
        try {
            List<InternDetails> allInternDetails = internDetailsService.getAllInternDetails();
            if (allInternDetails == null || allInternDetails.isEmpty()) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(allInternDetails);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }
    }
    @GetMapping("/intern-details/registration-no/{regNo}")
    public ResponseEntity<InternDetails> getInternDetailsByRegNo(@PathVariable("regNo") int regNo) {
        try {
            InternDetails internDetailsByRegNo = internDetailsService.getInternDetailsByRegNo(regNo);
            if (internDetailsByRegNo == null) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(internDetailsByRegNo);

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }
}
