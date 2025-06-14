package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;
import com.group.libraryapp.dto.calculator.request.SumListRequest;
import com.group.libraryapp.dto.calculator.response.DayOfTheWeekResponse;
import com.group.libraryapp.dto.calculator.response.MultiCalculateResponse;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@RestController
public class CalculatorController {

    @GetMapping("/add") // GET /add
    public int addTwoNumbers(CalculatorAddRequest request) {
        return request.getNumber1() + request.getNumber2();
    }

    @PostMapping("/multiply") // POST /multiply
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request) {
        return request.getNumber1() * request.getNumber2();
    }

    @GetMapping("/api/v1/calc")
    public MultiCalculateResponse multiCalculate(@RequestParam int num1, @RequestParam int num2) {
        int add = num1 + num2;
        int minus = num1 - num2;
        int multiply = num1 * num2;
        return new MultiCalculateResponse(add, minus, multiply);
    }

    @GetMapping("/api/v1/day-of-the-week")
    public DayOfTheWeekResponse dayOfTheWeek(@RequestParam String date) {
        try {
            LocalDate parsedDate = LocalDate.parse(date);
            String dayOfTheWeek = parsedDate.getDayOfWeek().toString().substring(0, 3);
            return new DayOfTheWeekResponse(dayOfTheWeek);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("날짜 형식이 잘못 되었습니다. 예: 2025-01-01");
        }
    }

    @PostMapping("/api/v1/sum-list")
    public int sumList(@RequestBody SumListRequest request) {
        return request.getNumbers()
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
