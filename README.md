#User Stories

### Draw the board
When the game starts, draw a board that looks like this:

    1|2|3
    -----
    4|5|6
    -----
    7|8|9

### First Player Moves
When the game starts (and after the board is drawn) the first player should make a move.
A player move consists of:
* Prompting the user to enter a number indicating where they want to place their mark
* Redrawing the board with the player’s symbol in that location

The first player’s mark is an “X”.
Don’t worry about handling the case where the player enters a number that is not between 1 and 9.

### Second Player Moves
After the first player makes a move, tell a second player to make their move. Redraw the board with an ‘O’ in that location (and still draw player 1’s ‘X’). You don’t need to check if that location is already taken.
    
### Location already taken
If either player moves into a cell that is already used, display the message, “Location already taken” and prompt them to try again (repeat this until they make a valid move).

### Repeat until the board is filled
Alternate player turns until the board is filled. Draw the board once it is full and display the message, “Game is a draw”.

### Win by Filling a Row
After each move, if that player has three in a row horizontally, end the game and display the message, “Player <#> Wins!”.

### Win by Filling a Column
After each move, if that player has three in a row vertically, end the game and display the message, “Player <#> Wins!”.

### Win by Filling a Diagonal
After each move, if that player has three in a row diagonally, end the game and display the message, “Player <#> Wins!”.
