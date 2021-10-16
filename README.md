# linkstation
Java program for linkstation.

A link station’s power can be calculated:
power = (reach - device's distance from linkstation)^2
if distance > reach, power = 0
Program should output following line:
“Best link station for point x,y is x,y with power z”
or:
“No link station within reach for point x,y”
Link stations are located at points (x, y) and have reach (r) ([x, y, r]):
[[0, 0, 10],
[20, 20, 5],
[10, 0, 12]]
Print out function output from points (x, y):
(0,0), (100, 100), (15,10) and (18, 18).

Points.java is for (x,y)two dimension points and powerstation.java is for the (x,y)location of the powerStations.
Output.java has all the parameters in the arraylist, so calculation make use of the point.java and powerstation.java and populate the array in the output.


