# OOP-Project-Jan23-Flappy-Bird
### Team: Flappy Bird

**List of members:**  

|      Name      |      ID       |
| -------------- | ------------- |
|   Farah Fuaad  |    22009174   |
| Aunullah Memon |    20001779   |
|  Teoh Lynn Yi  |    21000417   |
|Muhammad Hafizul Iman bin Mohd Fazni  |    21000307   |
|   Ahmad Lutfi bin Ahmad Shaarizan  |    22009343   |
|  Arham Tafhim bin Arnizzam |    22008778   |
|  Nur Ainin Sofiya binti Tukiran  |    22008550   |
| Muhammad Harif bin Mohd Afendi |    22007165   |
|  Mohamad Aiman Syakir bin Anol Sazali   | 21001337 |



**Introduction:**
* Flappy Bird is a popular game that involves guiding a bird through a series of pipes by tapping the screen to make it fly. 
* In an OOP Flappy Bird game, the game would be designed using classes to represent the bird, the pipes, the background, and other game elements. Each class would have its own set of properties and behaviors, such as the bird's speed and position, the pipe's position and size, and the background's color. 
* The game logic would be implemented through methods that would update the properties of these objects based on user input and game rules, such as collision detection and score calculation. 
* OOP principles can make the design and maintenance of the game easier and more organized by encapsulating data and behaviors within classes, and by allowing for inheritance and polymorphism to create more complex game elements. 



**Task allocation:**
>1. Farah Fuaad: Team leader, write report, gamescreen
>2. Aunullah Memon: BottomHalf
>3. Teoh Lynn Yi: JPanel
>4. Muhammad Hafizul Iman bin Mohd Fazni: JPanel, write report
>5. Ahmad Lutfi bin Ahmad Shaarizan: Character
>6. Arham Tafhim bin Arnizzam: ActionListener, KeyListener
>7. Nur Ainin Sofiya binti Tukiran: BottomHalf
>8. Muhammad Harif bin Mohd Afendi: TopHalf
>9. Mohamad Aiman Syakir bin Anol Sazali: TopHalf


**Technologies:**
> Java 17  
> A java based development environment (intellij, bluej)
> Computer/Laptop which can run Java

**How to run:**  
- Ensure user has the latest JDK (Java Development Kit)
- Simply install the .jar file given in demo section
- Enjoy!

**The project "Flappy Bird":**
> 1. The rules:
- About the rules of the button and the arrow flashes
  > a) The button:
    + ...
    + ...

  > b) The signal to move:
    + ...
    + ...
- About the rules to play the game
    + ...
    + ...
> 2. Design:
- Background: Nothing fancy, just an ultramarine shade of blue with the floor having a olive green colour. This part will move.
- Fading Background: BLack fades back into the original game background of blue sky and green floor.
- Bird: Simple static blue bird
- Tube: Simple green tube with some shading for depth effect for the top, green coloured. With the second tube having the exact same design just rotated 180 degrees using photoshop used for the bottom. Each tube's seperated length is the same and only their length relative to the ceiling and floor changes.

What each class (basically) does :
- Action/KeyListener: reads the input of the user on the keyboard like Spacbar to hover, B to restart and esc to quit the game

- JPanel: this part works in conjunction with JFrame (creates the window of which the game runs in). JPanel groups all the other components to the JFrame window.

- TopHalf and BottomHalf: These two work in conjunction with each other, as to maintain the same gap between them. Additionally, different images are needed for top and bottom half hence why they are also in 2 classes. Essentially they can be said as the behaving the same way according to the code

- Character: This is basically the class for the bird or the player.

- Gamescreen: This houses the start button, background fading, the background for the game and main menu, and the score.

3. Other
* Show the github project page:  https://github.com/farahfuaad/OOProject-Jan23-Flappy-Bird/blob/master/README.md
Report: (Link)  
Team Commits in github: (Link)  
* Features:  
  Practically playable flappy bird game. Things to note:
  -collision detection using rectangles for hitbox
  -only one mode (endless mode)
  -Tubes are randomly generated, moves alongside the background.
  -Bird is a seperate entity from the background to accomodate collision detection methods.
* Presentation: (Slide link)

* Demo:
https://content.instructables.com/FW4/BUEG/IM9E2D3Z/FW4BUEGIM9E2D3Z.jar


* UML Diagram:  
<img title="a title" alt="Alt text" src="https://user-images.githubusercontent.com/71580075/223759005-2a61f2bf-4b4c-4520-864d-01aebbe97447.png">

* **Reference:**  
https://github.com/sunzhichao/FlappyBird



