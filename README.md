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
>1. Farah Fuaad: Team leader, write project info, incharge in gamescreen class
>2. Aunullah Memon: incharge in BottomHalf class
>3. Teoh Lynn Yi: incharge in JPanel class
>4. Muhammad Hafizul Iman bin Mohd Fazni: incharge in JPanel class, write project info
>5. Ahmad Lutfi bin Ahmad Shaarizan: incharge in Character class
>6. Arham Tafhim bin Arnizzam: incharge in ActionListener, KeyListener (Main class)
>7. Nur Ainin Sofiya binti Tukiran: incharge in BottomHalf class , write project info
>8. Muhammad Harif bin Mohd Afendi: incharge in TopHalf class, compiling the video presentation
>9. Mohamad Aiman Syakir bin Anol Sazali: incharge in TopHalf class


**Technologies:**
> - Java 17  
> - A java based development environment (intellij, bluej)
> - Computer/Laptop which can run Java


**How to run:**  
> - Ensure user has the latest JDK (Java Development Kit)
> - Simply install and run the Main.java file 
> - Enjoy!


**The project "Flappy Bird":**

**1. The rules to play the game**
> - Using 'spacebar' to control the bird (fly up or down)
> - During the play, the player must maintain a safe distance between the bird and the pipe. It means that the bird must not fly too high (hit the upper pipe) nor should the bird fly too low (hit the lower pipe). 
> - If the bird follows the safe spots, the game will continue.
> - While, if the bird hits the pipe or ground, it will die and the game will be over.
> - To restart the game, click 'B'.
> - To exit the game, click 'esc'.

**2. Design:**
> - Background: Nothing fancy, just an ultramarine shade of blue with the floor having a olive green colour. This part will move.
> - Fading Background: BLack fades back into the original game background of blue sky and green floor.
> - Bird: Simple static blue bird
> - Tube: Simple green tube with some shading for depth effect for the top, green coloured. With the second tube having the exact same design just rotated 180 degrees using photoshop used for the bottom. Each tube's seperated length is the same and only their length relative to the ceiling and floor changes.

**What each class (basically) does :**
> - Action/KeyListener: reads the input of the user on the keyboard like Spacebar to hover, 'B' to restart and esc to quit the game

> - JPanel: this part works in conjunction with JFrame (creates the window of which the game runs in). JPanel groups all the other components to the JFrame window.

> - TopHalf and BottomHalf: These two work in conjunction with each other, as to maintain the same gap between them. Additionally, different images are needed for top and bottom half hence why they are also in 2 classes. Essentially they can be said as the behaving the same way according to the code

> - Character: This is basically the class for the bird or the player.

> - Gamescreen: This houses the start button, background fading, the background for the game and main menu, and the score.

**3. Other**
>   * Github project page:https://github.com/farahfuaad/OOProject-Jan23-Flappy-Bird
>   * Project Proposal [UPDATED]: [Java Application Project Proposal - Flappy Bird.pdf](https://github.com/farahfuaad/OOProject-Jan23-Flappy-Bird/files/11131667/Java.Application.Project.Proposal.-.Flappy.Bird.pdf)
>    * Team Commits in github: https://github.com/farahfuaad/OOProject-Jan23-Flappy-Bird/commits/master 
>   * Features:  
    Practically playable flappy bird game. Things to note:
    -collision detection using rectangles for hitbox
    -only one mode (endless mode)
    -Tubes are randomly generated, moves alongside the background.
    -Bird is a seperate entity from the background to accomodate collision detection methods.
  
> * Demo: 

https://user-images.githubusercontent.com/71580075/229385892-32f3e97d-458b-47c8-80e6-e8bf048b3243.mp4 

> * UML Diagram:

<img title="a title" alt="Alt text" src="https://user-images.githubusercontent.com/71580075/229369833-ea24b731-456d-49c5-8318-266a99c98222.png">

> * Video Presentation: 

https://youtu.be/03q9JagN4UA

* **Reference:**  
https://github.com/sunzhichao/FlappyBird



