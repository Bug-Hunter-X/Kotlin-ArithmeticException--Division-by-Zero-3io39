# Kotlin ArithmeticException: Division by Zero

This repository demonstrates a common error in Kotlin: the `ArithmeticException` caused by division by zero.

The `bug.kt` file contains the problematic code.  The `bugSolution.kt` file provides a solution to handle this exception.

## How to reproduce

1. Clone this repository.
2. Run `bug.kt` using a Kotlin compiler (like the one included in IntelliJ IDEA or via the command line). 
3. Observe the `ArithmeticException`.

## Solution

The solution involves checking for a zero divisor before performing the division.  See `bugSolution.kt` for the implementation.