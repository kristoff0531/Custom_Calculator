package com.company;
import java.util.*;

class MaxInputException extends Exception{
    public String getMessage(String string) {
        return string;
    }

}
class MaxMultiplierReachException extends Exception{
    public String getMessage(String string) {
        return string;
    }

}
class InvalidChoiceException extends Exception{

    public String getMessage(String string) {
        return string;
    }

}
class DivideByZeroException extends Exception{

    public String getMessage(String string) {
        return string;
    }

}
public class Calculator1 {

    public static void main(String[] args)throws MaxMultiplierReachException {

        Scanner sc = new Scanner(System.in);
        System.out.println("* 1. (Addition) \n* 2. (Subtraction) \n* 3. (Multiplication) \n* 4. (Division) ");
        System.out.print("Enter Here a number :- ");
        int num1;
        int num2;
        int var = sc.nextInt();
        if(var>4){
            try{
                throw new InvalidChoiceException();
            }
            catch(InvalidChoiceException e){
                System.out.println(e.getMessage("Error - "+e));
            }
        }

        //Calculator
        while(var<5){
            System.out.print("Enter Num1 : ");
            num1 = sc.nextInt();
            System.out.print("Enter Num2 : ");
            num2 = sc.nextInt();

            //Max Input Exception
            if(num1 > 5000 || num2 > 5000){
                try{
                    throw new MaxInputException();
                }
                catch(MaxInputException e){
                    System.out.println(e.getMessage("Error - " +e));
                }
            }
            else{

                if(var==1){
                    System.out.println("Your Answer is "+num1+num2);
                    break;
                }
                else if(var==2){
                    System.out.println("Your Answer is "+(num1-num2));
                    break;
                }
                else if(var==3){
                    if(num1>500 || num2>500){
                        try{
                            throw new MaxMultiplierReachException();
                        }
                        catch(MaxMultiplierReachException e){
                            System.out.println(e.getMessage("Error - "+e));
                        }
                    }
                    else{
                        System.out.println("Your Answer is "+(num1*num2));
                        break;
                    }
                }
                else{
                    if(num2 ==0){
                        try{
                            throw new DivideByZeroException();
                        }
                        catch(DivideByZeroException e){
                            System.out.println(e.getMessage("Error - "+e));
                            break;
                        }
                        catch(Exception e){
                            System.out.println("Error "+e);
                        }
                    }
                    System.out.println("Your Answer is "+(num1/num2));
                    break;
                }
            }
        }
    }


}

