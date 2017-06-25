# Paint
A simple simple console version of a drawing program for Springer Nature.
 This application should create a canvas, draw lines inside the canvas and be able to fill the area simulating the " bucket fill" feature in paint programs. 


##### Command Description
* **C w h** Should create a new canvas of width w and height h.

* **L x1 y1 x2 y2** Should create a new line from (x1,y1) to (x2,y2) . Currently only
horizontal or vertical lines are supported. Horizontal and vertical lines will be
drawn using the x character.

* **R x1 y1 x2 y2** Should create a new rectangle, whose upper left corner is (x1,y1) and
lower right corner is (x2,y2) . Horizontal and vertical lines will be drawn
using the x character.

* **B x y c** Should fill the entire area connected to (x,y) with colour 'c' . The
behaviour of this is the same as that of the "bucket fill" tool in paint programs.

* **Q** Should quit the program.

##### Choice of Libraries

Complying with the requirements of this application, the least possible libraries were used. 

* Junit
	* Used for testing.
	* On the application build, asserts for good working code.

##### Design 

This application was designed to be possibly changed to use other libraries as well. The logic could easily return calls to other services. 	