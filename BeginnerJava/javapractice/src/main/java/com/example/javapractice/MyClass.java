package com.example.javapractice;

public class MyClass {

    public static void main(String[] args)
        {
        System.out.println("Hello World");
        //Comentario cort
        /*sadas*/

        String word = "Hello";
        System.out.println(word+" World!");
        final String AUTHOR_NAME = "Nelson Wang"; // Constante
        double doubleNumber = 23.2; // THe Java Float
       // float floatNumber = 2.3; // Throws error

        System.out.println(word+" World! "+AUTHOR_NAME);
        GetMilk();
        double bmiDouble = GetBMIByMassKgHeightMeters(71,1.81);
        System.out.println("My BMI is : "+bmiDouble);
        CommentUserByBMI(bmiDouble);

        }


    //Obligate our slaves to get milk
    public static void GetMilk()
        {
        System.out.println("Getting Milk");
        }

    //Function intended to return the BMI , Body mass Index
    public static double GetBMIByMassKgHeightMeters(double massKg, double heightMeters)
        {
        return massKg /( heightMeters * heightMeters);
        }

    //Indicates if the user is overweight or what based in his bmi
    public static void CommentUserByBMI(double BMI)
        {
        String commentMessage = "You are good";
        if(BMI<18.5)
            {
            commentMessage = "Eat more!";
            }
        if(BMI>25)
            {
            commentMessage = "Eat Less!";
            }
        System.out.println(commentMessage);
        }


}
