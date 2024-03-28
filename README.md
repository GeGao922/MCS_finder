# Most Common Start Letter Finder

This project contains classes for finding the most common start letter in a web page given by the url. The project also contains few tests for testing the functional correctness of wordProcessor class.

## Enviromental Settings
This program is written with Java, the SDK version used is 17. The test in this program uses JUnit 4.12. And this project is built using gradle.

## Running the project
This project can be run by compiling and running Main.java or by running build with gradle, the program does not require gradle to be installed on the machine as it already includes gradle wrapper in the project. The result will be output to the terminal.


## Intepretation of Ideas

This project is produced based on following assumptions besides the given requirements:
1. The tasks are splited into two parts: download part and word process part. This design makes adding new features in the future easier, allow easier maintaining.
2. the input url can be modified by changing the "url" variable in main.
3. The result of running the program will be output directly to the terminal.
4. The downloaded file will not be stored in to extra .txt file, the data from the page will be cleared after exiting the program.
5. The program will throw errors if the given url is invalid.
6. For an empty input stream, the most common start letter returned will be ' '.




