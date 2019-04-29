# Processing Assignment
[Processing Assignment Demonstration Video Link](https://www.youtube.com/watch?v=joz3u3jzfrE&feature=youtu.be)
![Screenshot_4](https://user-images.githubusercontent.com/42293856/56791502-1e0cfd80-67ff-11e9-8401-903f89d6ca96.png)
# Instructions
![instructions](https://user-images.githubusercontent.com/42293856/56882221-e601f680-6a5a-11e9-837a-0929842bbfcb.jpg)

# How It Works
My program is split into many classes, each class represents a feature in this program.

The main class is called the Galaxy Class, this incorporates setup, settings and draw function. The Galaxy class also controls the mousePressed function which controls what weapon/buttons have been pressed. Finally, the Galaxy class contains the functions which start the animated part of the program, such as the radar and hand scanner. 

Following the Galaxy class i added the Spaceship class, i used this class to build the main parts of the Spaceship such as the windshield, turrets on either side and dashboard, each of these features were created in separate classes too and drawn by created a draw function in each class.

I then created the Planet class which takes an custom dimentions and creates a planet in the background, the draw planet function creates an ellipse with the custom dimentions passed.

I created separate classes for the radar, handscanner and lever and included a draw function in each.

I added the Circle class which made drawing circles very easy, the class contains functions to set color, alpha and the constructor takes the custom size of the circle.

# How It Works - Animated Features

To animate the Hand Scanner I created an array of y coordinates and the program drew a new line at the new y coordinate for 9 times and then it repeats.

To animate the radar i created 2 arrays for y and x coordinates which had to be calculated precisely. At each iteration the right vertex of the line is updated.

To shoot the lasers i first created a Weapons class which has the function animateLaser. The function takes in a boolean, if true the loop will iterate through the y and x coordinates for each laser and draw the laser image at each given coordinate. 






