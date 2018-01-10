# User Stories

### Draw the board
When the game starts, draw a board that looks like this:

    1|2|3
    -----
    4|5|6
    -----
    7|8|9

### Player One Move
When the game starts let player one make a move.
A player move consists of:
* Print a prompt asking the player to enter a number indicating where they want to mark the board
* Draw the board with the player’s symbol in that location

The player one’s mark is an “X”.
Don’t worry about handling the case where the player enters a number that is not between 1 and 9.

### Player Two Move
After player one moves, let player two make their move. Then draw the board with an ‘O’ in the location (and still draw player one’s ‘X’). You don’t need to check if that location is already taken.
    
### Location already taken
If either player moves into a location that is already used, display the message, “Location already taken” and prompt them to try again (repeat this until they make a valid move).

### Repeat until the board is filled
Alternate player turns until the board is filled. Draw the board once it is full and display the message, “Game is a draw”.

### Win by Filling a Row
After each move, if that player has three in a row horizontally, end the game and display the message, “Player <#> Wins!”.

### Win by Filling a Column
After each move, if that player has three in a row vertically, end the game and display the message, “Player <#> Wins!”.

### Win by Filling a Diagonal
After each move, if that player has three in a row diagonally, end the game and display the message, “Player <#> Wins!”.
