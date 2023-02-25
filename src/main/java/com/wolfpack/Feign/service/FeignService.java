package com.wolfpack.Feign.service;

import com.wolfpack.Feign.feignClient.WPFeignClient;
import com.wolfpack.Feign.model.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeignService {
    //PARAMETERS
    @Autowired
    private WPFeignClient wpfc;

    //METHODS
    public List getAllExercises() {
        return this.wpfc.allExercises();
    }
    public List getExercisesByMuscle(String muscle) {
        return this.wpfc.getExercisesByMuscle(muscle);
    }
    public Exercise newExercise(Exercise exercise) {
        return this.wpfc.newExercise(exercise);
    }
    public List makeAWorkout() {
        return this.wpfc.newWorkout();
    }
}
