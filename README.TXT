# *Farkle Game*
Farkle is a dice-based game where players roll six dice to score points based on specific combinations. This implementation of Farkle includes a graphical user interface (GUI) for the dice, game logic for scoring, and the ability to manage a single player’s progress toward victory.

## Features
Interactive Dice Rolls:
Players can roll six dice and select specific dice for scoring.
Dice that are scored are visually distinguished from unscored ones.

## Customizable Graphics:
The dice are represented with interactive graphics, with dynamic color changes for selected and scored states.

## Scoring Logic:

Points are awarded based on various combinations, such as:
Straight (1, 2, 3, 4, 5, 6): 3000 points
Three Pairs: 1500 points
Three of a Kind: Variable points based on the number rolled
Additional points for specific dice values (e.g., ones and fives).
Tracks scored and unscored dice for accurate gameplay.
Winning Conditions:
A player wins when they reach or exceed 10,000 points.

## Animations:
Dice rolling animations simulate the randomness of physical dice rolls.

## Interactive Gameplay:
Players can click on dice to select/unselect them for scoring, and the game enforces valid selections.

## File Overview:
1. Farkle.java
Implements the main game logic, including scoring, dice selection, and turn management.
Key scoring combinations and their point values are predefined.
2. GVdie.java
Provides a graphical representation of a six-sided die with:
Rolling animations.
Selectable and scored states.
Mouse interaction for toggling selections.
3. Player.java (Assumed File)
Represents the player, including their name, score, and turn progress.
