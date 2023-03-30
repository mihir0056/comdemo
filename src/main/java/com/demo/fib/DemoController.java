package com.demo.fib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/demo")
public class DemoController {

    @Autowired
    private FibonaciService fibonaciService;

    // controller map the out put to web browser
    // autowire spring service : generate 20 numbers in fibonaci series.
    //1 , 1, 2, 3, 5, 8, 13

    @GetMapping(value="/fibseries/{n}",produces = "application/json")
    public List<Integer> getFibonaciSeries(@PathVariable int n){

        return fibonaciService.getFibSeries(n);
    }

}
