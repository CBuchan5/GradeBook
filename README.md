# Grade book
8kyu [Grasshopper - Grade Book](https://www.codewars.com/kata/55cbd4ba903825f7970000f5)
Complete the function so that it finds the average of the three scores passed to it and returns the letter value associated with that grade.

## Numerical Score	Letter Grade
- 90 <= score <= 100   'A'
- 80 <= score < 90	   'B'
- 70 <= score < 80	   'C'
- 60 <= score < 70	   'D'
- 0 <= score < 60	   'F'
Tested values are all between 0 and 100. There is no need to check for negative values or values greater than 100.

| Input int   | Output char |
|-------------|-------------|
| (100,100,1) | 'A'         |
| (70,70,100) | 'B'         |
| (70,70,70)  | 'C'         |
| (58,62,70)  | 'D'         |
| (44,55,52)  | 'F'         |
| (0,0,0)     | 'F'         |
| ----------- | ----------- |
| Other Tests |             |
| (95,90,93)  | 'A'         |
| (100,85,96  | 'A'         |
| (92,93,94)  | 'A'         |
| (82,85,87)  | 'B'         |
| (84,79,85)  | 'B'         |
| (75,70,79)  | 'C'         |
| (60,82,76)  | 'C'         |
| (65,70,59)  | 'D'         |
| (66,62,68)  | 'D'         |
| (48,55,52)  | 'F'         |
| (58,59,60)  | 'F'         |


