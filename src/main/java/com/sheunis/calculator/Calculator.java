package com.sheunis.calculator;
import org.springframework.stereotype.Service;

/**
 * Calculator service
 */
@Service
public class Calculator {
    int sum(int a, int b) {
        return a + b;
    }
}