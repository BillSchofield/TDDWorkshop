# Tic Tac Toe User Stories

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

# Workshop
We implement these stories, in-order, one at a time, using London School TDD. The facilitator codes, while the attendees act in the navigator pair programming role. The facilator guides the process and calls out important concepts.

# Activities

### Explore the Domain
* For each story, list all of the nouns. Put them in a column on the left side of your writing area.
* For each story, list all of the verbs. Put them in a culumn on the right.
* Draw lines from the nouns to the verbs that sound like a sentence (in the context of the this domain). For instance, if we we in the domain of a farm, you might draw an arrow from the noun 'cow' to the verb 'moos', because saying, "The cow moos." sounds right in the farm domain.

These nouns are candidate class names and the verbs are candidate method names. The lines indicate that the class (noun) might eventually contain the method (verb). This diagram contains clues about what our classes might look like. Remember that they are just clues and also remember that they are probably great clues.

### Implement the Domain too early
Write a unit test that reads just like the story and is about the interaction of two domain concepts and one is a new class.

### Implement the Domain too late
Write a unit test that inteprets the verb directly. Just do the work without creating a new class. We'll eventually discover the domain concept represented by the verb and will extract a method and then class to capture that domain concept.
