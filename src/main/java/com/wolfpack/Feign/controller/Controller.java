package com.wolfpack.Feign.controller;

import com.wolfpack.Feign.model.Exercise;
import com.wolfpack.Feign.service.FeignService;
import feign.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/feign")
public class Controller {
    //PARAMETERS
    @Autowired
    private final FeignService feignService;

    //CONSTRUCTOR
    public Controller(FeignService feignService) {
        this.feignService = feignService;
    }

    //METHODS
    @GetMapping("allExercises")
    public ResponseEntity<List> getAllExercises() {
        List exercises = this.feignService.getAllExercises();
        return new ResponseEntity<>(exercises, HttpStatus.OK);
    }
    @GetMapping("exercises/{muscles}")
    public ResponseEntity<List> getExerciseByMuscle(@PathVariable String muscle) {
        List exercises = this.feignService.getExercisesByMuscle(muscle);
        return new ResponseEntity<>(exercises, HttpStatus.OK);
    }
    @PostMapping("newExercise")
    public ResponseEntity<Exercise> newExercise(@RequestBody String name, @RequestBody String muscles,
                                                @RequestBody String tutorial) {
        Exercise exercise = new Exercise(name, muscles, tutorial);
        this.feignService.newExercise(exercise);
        return new ResponseEntity<>(exercise, HttpStatus.CREATED);
    }
    @GetMapping("newWorkout")
    public ResponseEntity<List<Exercise>> makeAWorkout() {
        List workout = this.feignService.makeAWorkout();
        return new ResponseEntity<>(workout, HttpStatus.OK);
    }
}
