# Quiz 1
You have two hours to complete this quiz. Make sure your code compile when you submit the PR!

### **Git Instructions**

1. Fork this Repository
    * [fork](https://help.github.com/articles/fork-a-repo/) this repository to your personal github account
    * [clone](https://help.github.com/articles/cloning-a-repository/) **your** `forked` repository to your local machine
    * Write the code to make all the tests pass. See below for instructions.
      * MAKE SURE YOUR CODE COMPILES
      * Run the tests to verify your code
    * `git add .` to add files you want to commit
    * `git commit -m "commit message"` to commit your changes
    * `git push` your staged files to your remote repository
    * submit a `pull request` which compares Zipcoder `master` to your `master`


### **Project Instructions**
* In this project there are 3 Classes to be completed
  * `MathUtilities`
  * `StringUtilities`
  * `LoopFun`
* Within each class are several methods which must be defined to pass test cases.
* Each method has a respective Test class.
* For example:
  * `MathUtilities.add` can be tested by running the `MathUtilitiesAddTest` class.
  * `MathUtilities.half` can be tested by running the `MathUtilitiesHalfTest` class.
  * `StringUtilities.reverse` can be tested by running the `StringUtilsReverseTest` class.

## Section 1 - MathUtilities
* Ensure all tests in the `MathUtilitiesTest` class pass.
* All the methods have been stubbed out for you in the `MathUtilities` class.
* Each of the method has a comment above it to describe the expected behavior.
* Look at the test case to see example of input and expected output.
  - `int add(int num1, int num2)`
  - `double add(double num1, double num2)`
  - `double half(int number)`
  - `boolean isOdd(int number)`
  - `int square(int number)`

## Section 2 - StringUtilities
Make all the tests in the `StringUtilitiesTest` class pass. All the methods have been stubbed out for you in the `StringUtilities` class. Each of the method has a comment above it to describe the expected behavior. Look at the test case to see example of input and expected output.

  - `Character getMiddleCharacter(String word)`
  - `String removeCharacter(String value, char charToRemove)`
  - `String getLastWord(String value)`
  - `String concatenate(String baseValue, String valueToBeAdded)`
  - `String reverse(String valueToBeReversed)`

## Section 3 - LoopFun
Make all the tests in the `LoopFunTest` class pass. All the methods have been stubbed
out for you in the `LoopFun` class.
Each of the method has a comment above it to describe the expected behavior.
Look at the test case to see example of input and expected output.

  - `int factorial(int number)`
  - `String acronym(String phrase)`
  - `String encrypt(String word)`
