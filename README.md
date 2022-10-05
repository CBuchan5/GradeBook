# Grade book
Complete the function so that it finds the average of the three scores passed to it and returns the letter value associated with that grade.

## Numerical Score	Letter Grade
90 <= score <= 100	'A'
80 <= score < 90	'B'
70 <= score < 80	'C'
60 <= score < 70	'D'
0 <= score < 60	    'F'
Tested values are all between 0 and 100. There is no need to check for negative values or values greater than 100.

| Input int   | Output char |
|-------------|-------------|
| (100,100,1) | 'A'         |
| (70,70,100) | 'B'         |
| (70,70,70)  | 'C'         |
| (58,62,70)  | 'D'         |
| (44,55,52)  | 'F'         |
| (0,0,0)     | 'F'         |

Other Tests
assertEquals('A', GrassHopper.getGrade(95,90,93));
assertEquals('A', GrassHopper.getGrade(100,85,96));
assertEquals('A', GrassHopper.getGrade(92,93,94));
assertEquals('B', GrassHopper.getGrade(82,85,87));
assertEquals('B', GrassHopper.getGrade(84,79,85));
assertEquals('C', GrassHopper.getGrade(75,70,79));
assertEquals('C', GrassHopper.getGrade(60,82,76));
assertEquals('D', GrassHopper.getGrade(65,70,59));
assertEquals('D', GrassHopper.getGrade(66,62,68));
assertEquals('D', GrassHopper.getGrade(58,62,70));
assertEquals('F', GrassHopper.getGrade(44,55,52));
assertEquals('F', GrassHopper.getGrade(48,55,52));
assertEquals('F', GrassHopper.getGrade(58,59,60));
assertEquals('F', GrassHopper.getGrade(0,0,0));
