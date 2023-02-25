package com.wolfpack.Feign.feignClient;

import com.wolfpack.Feign.model.Exercise;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@org.springframework.cloud.openfeign.FeignClient(name = "WPFeign", url = "${client.exercise.baseUrl}")
public interface WPFeignClient {
    @GetMapping("/all")
    List<Exercise> allExercises();
    @GetMapping("/exercises/{muscles}")
    List<Exercise> getExercisesByMuscle(@PathVariable String muscle);
    @PutMapping("/newExercise")
    Exercise newExercise(Exercise exercise);
    @GetMapping("/newWorkout")
    List<Exercise> newWorkout();
}
