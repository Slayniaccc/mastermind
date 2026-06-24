# Mastermind (Java)

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white)

A Java implementation of the classic Mastermind colour-guessing game. Originally built for SwiftBot hardware, now simplified to run on any machine.

## How It Works

- The game generates a random 4-colour code using R, G, B, Y, O, P (no repeats)
- You make guesses one by one
- After each guess:
  - `+` = right colour, right position
  - `-` = right colour, wrong position
- Win by guessing the full sequence correctly

## Features

- Random code generation with no repeats
- Feedback system using `+` and `-`
- Hint system (reveals one correct position)
- Score tracking across multiple rounds
- File logging for game results

## Tech Stack

- **Language:** Java
- **Key Concepts:** OOP, File I/O, Input Validation, Exception Handling
- **Tools:** Terminal / Command Line

## Running the Program

1. Make sure you have Java installed (JDK 8 or higher)
2. Navigate to the project folder in your terminal
3. Compile the file:
   ```bash
   javac mastermind.java


## Run the program:
java mastermind


## Gameplay Example:
Welcome to Mastermind!
Guess the 4-colour sequence (R,G,B,Y,O,P):

Enter guess (e.g., R G B Y): R G B Y
Feedback: ++--

Enter guess: R B G Y
Feedback: ++++

Enter guess: R B G Y
Feedback: ++++

🎉 You win! Score: 3 guesses
Play again? (y/n): n
Thanks for playing!

##Note:
This is a simplified version of a project originally built for the SwiftBot hardware (Raspberry Pi with camera input, buttons, and LEDs). The hardware version featured camera-based colour detection and interactive button controls.

#Future Improvements:
Graphical user interface (GUI)

Difficulty levels (longer colour sequences)

Save high scores between sessions
