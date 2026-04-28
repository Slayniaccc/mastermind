# Mastermind (Java)

This is a Java implementation of the classic Mastermind game.

The goal is to guess a hidden sequence of colours. After each guess, you get feedback that tells you how close you are.

## How it works

- The game generates a random code using colours like R, G, B, Y, O, P
- You make guesses one by one
- After each guess:
  - `+` means the right colour in the right position
  - `-` means the right colour in the wrong position
- You win if you guess the full sequence correctly

## Features

- Random code generation with no repeats
- Feedback system using + and -
- Hint system (reveals one position)
- Score tracking between rounds
- Basic logging of results

## Running the program

1. Make sure you have Java installed
2. Compile the file: javac mastermind.java
3. Run the program: java mastermind


## Note

The original version of this project used SwiftBot hardware, including buttons, camera input, and lights.

This version has been simplified so it can run on any machine without extra hardware.
