package camt.se234.deployment.service;

import camt.se234.deployment.entity.Grade;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public String getGrade(double score) {
        // Stricter scoring criteria (v2)
        if (score > 84.5) {
            return "A";
        }
        else if (score > 69.5){
            return "B";
        }else if (score > 54.5){
            return "C";
        }else if (score > 39.5) {
            return "D";
        } else
            return "F";

    }
}
