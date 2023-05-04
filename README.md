# Whitebox Testing

This is a Java program that counts the number of occurrences of a character in an array of characters. The program uses a function countOccurrences() that takes two arguments: an array of characters and the character to be counted. The function returns the count of the number of occurrences of the character in the array. A sample code is also provided that demonstrates the use of the function by counting the number of occurrences of the character 'a' in an array.

## White box testing
The program has been tested using white box testing techniques to ensure that all possible paths through the code are executed and tested. The Control Flow Graph (CFG) of the code has been constructed to identify all the paths required for 100% node coverage, 100% edge coverage, and 100% edge-pair coverage. All prime paths of the code have also been identified.

A test case table has been created with each path corresponding to a testing case. JUnit test scripts have been written to test each path identified above. The JUnit test scripts have been included in the project code to verify that the function works as expected.

#### Test Case Table:

| Test Case | Path Array | Target | Output |
|-----------|------------|--------|--------|
| 100% Node Coverage, Test Path 1 | {1,2,3,4,5,3,4,6,7,8} | a,b,c,d | a=1 |
| 100% Edge Coverage, Test Path 1 | {1,2,3,7,8} | a | 0 |
| 100% Edge Coverage, Test Path 2 | {1,2,3,4,6,3,7,8} | a,a | 1 |
| 100% Edge Coverage, Test Path 3 | {1,2,3,4,5,3,4,6,3,4,6,3,7,8} | a,b,b,a | 1 |
| 100% Edge-Pair Coverage, Test Path 1 | {1,2,3,4,5,3,7,8} | a,a | 1 |
| 100% Edge-Pair Coverage, Test Path 2 | {1,2,3,4,5,3,4,6,3,7,8} | c,d,c | 1 |
| 100% Edge-Pair Coverage, Test Path 3 | {1,2,3,4,6,3,4,5,3,7,8} | d,c,c | 1 |
| 100% Edge-Pair Coverage, Test Path 4 | {1,2,3,7,8} | a | 0 |
| Prime Paths, Test Path 1 | [1,2,3,7,8] | a | 0 |
| Prime Paths, Test Path 2 | [1,2,3,4,6,3,4,5,3,4,6,3,7,8] | a,b,a,b | 1 |
| Prime Paths, Test Path 3 | [1,2,3,4,5,3,4,5,3,7,8] | a,a | 2 |
| Prime Paths, Test Path 4 | [1,2,3,4,6,3,4,6,7,8] | b,b,a | 0 |
| Prime Paths, Test Path 5 | [1,2,3,4,5,3,7,8] | c | c | 1 |
## Usage
To use the program, you can clone the repository and run the Java program. The program uses JUnit for testing. The program can be run from the command line or an IDE. To run the tests, simply execute the test class in the test package. The output of the tests will be displayed in the console.
