// Utility Class: We are maintaing these class for utility
// Main goal: To implement different helpers, that will be helpful for my carrier
// - Without using instance variable in Utility class, i want to learn.

public class Utility {

// createReverse(): used to reverse a string
// example: string - "Sun rises in the East"
// expected result: tsae ni sesir nus
// here we are using all lowercase
  public String createReverse(String string) {
    String reverse = "";

    for(int i = string.length()-1; i >= 0; i--) {
        reverse = reverse + string.charAt(i);
      }

      return reverse.toLowerCase();
  }

// createReverse(_): is used to reverse a number
// example: Number is 9713008323
// expected output is 3238003179
  public long createReverse(long number) {
    String reverseNumberString = "";
    String stringNumber = Long.toString(number);
    System.out.println("print length of long " + findLength(number));

    for(int i = stringNumber.length()-1; i >= 0; i--) {
      reverseNumberString = reverseNumberString + stringNumber.charAt(i);
    }

    return Long.valueOf(reverseNumberString).longValue();
  }

// insert(_ ): adding string to base string
// There will be always a inbuilt method for appending string, but for learning we are creating these method.
  public String insert(String string, String baseString) {
    String insertedString = baseString + string;
   return insertedString;
  }

  // task2:
//private String convertNumberToString(long number) {
//}

// task 1 - implement it to recurvise function
  private int findLength(long number) {
    // you need to know maximum long supported number - 10 digits
    // case 1: number should be divided by max supported number, if we got 10, then we are not supporting these number. So we will return -1
    // case 2: If we got number divided is less than 10, then add nested if conditions for remaining digits

    if(number > 10000000000l) {
      return -1;
    }

    else {
      if(number > 1000000000l) {
        return 10;
      }

      else {
        if(number > 100000000l) {
          return 9;
        }

        else {
          if(number > 10000000l) {
            return 8;
          }

          else {
            if(number > 1000000l) {
              return 7;
            }

            else {
              if(number > 100000l) {
                return 6;
              }

              else {
                if(number > 10000) {
                  return 5;
                }

                else {
                  if(number > 1000){
                    return 4;
                  }

                  else {
                    if(number > 100) {
                      return 3;
                    }

                    else {
                      if(number >10) {
                        return 2;
                      }

                      else {
                        return 1;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public void doRecursive(int counter) {
  //  int count = 0;
    if(counter <= 5){
      System.out.println("Print count " + counter);
      counter++;
      doRecursive(counter);
    }
  }

  public boolean isVowel(String name) {
    String lowerCaseName = name.toLowerCase();
    if((lowerCaseName.charAt(0) == 'a') ||
       (lowerCaseName.charAt(0) == 'e') ||
       (lowerCaseName.charAt(0) == 'i') ||
       (lowerCaseName.charAt(0) == 'o') ||
       (lowerCaseName.charAt(0) == 'u')) {
      return true;
    }

    return false;
  }

  public boolean isLegalToDrink(int age, boolean isValidId) {
    if((age >= 21) && (isValidId == true)) {
      return true;
    }

    return false;
  }

  public boolean isNameMatching(String nameOne, String nameTwo) {
    String lowerCaseNameOne = nameOne.toLowerCase();
    String lowerCaseNameTwo = nameTwo.toLowerCase();
    if(lowerCaseNameOne.equals(lowerCaseNameTwo)) {
      return true;
    }
    /*System.out.println("Name One: " + lowerCaseNameOne);
    System.out.println("Name Two: " + lowerCaseNameTwo);*/
    return false;
  }

/*  public String countVowelAndConsonants(String passage) {
    System.out.println("isVowel :" + isVowelFor(passage));

    return "" ;
  }*/

  public int isVowelFor(String passage) {
    // String passage = "Sun rises in the east";
    int count = 0;
    for(int i = 0; i < passage.length(); i++) {
      if((passage.charAt(i) == 'a') ||
         (passage.charAt(i) == 'e') ||
         (passage.charAt(i) == 'i') ||
         (passage.charAt(i) == 'o') ||
         (passage.charAt(i) == 'u')) {
           count++;
         }
       }

       return count;
     }

     public int isConsonantFor(String passage) {
       int count = 0;

       for(int i = 0; i < passage.length(); i++) {
         if((passage.charAt(i) >= 'a' && passage.charAt(i) <= 'z') ||
            (passage.charAt(i) >= 'A' && passage.charAt(i) <= 'Z')) {
              count++;
            }
        }

       int noOfVowels = isVowelFor(passage);
       return count - noOfVowels;
     }
   }
