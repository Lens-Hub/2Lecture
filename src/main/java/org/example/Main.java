package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //String fullName = "Lela Gabelaia";
        //  String fullName1 = "Lela AGabelaia";

        // boolean b = fullName == fullName1;          // შედარება 1
        //int result = fullName.compareTo(fullName1);    // შედარება 2
        //boolean result =  fullName.equals(fullName1);   // შედარება 3

        // System.out.println(result);
        //}


        // String firstName = "Lela";
        // String  lastName = "Gabelaia";

        // System.out.println(firstName + " " + lastName);   // კონკატენაცია (მიწებება)
        // System.out.println(firstName.concat(lastName));     // concat( აქ გამოტოვებას ვერ ჩავუმატებთ, მაშინ ზევით სტრინგში უნდა ჩავუწეროთ)
        // String concat = firstName.concat(lastName);
        //  System.out.println(concat);


        // }
        //System.out.println("i \"love\" testing");      // როცა მინდა ბრჭყალებში ჩავსვა
        //System.out.println("i love \ntesting");         // ახლა ხაზზე მინდა გადატანა
        //System.out.println("i love \\ testing");          // თუ მინდა სლეშის დაწერა


        // Math

        //int min =  Math.min(5, 7);
        //System.out.println(min);                        // ორი რიცხვის შედარება (min/max)

        //double max = Math.max(5.5, 6.3);
        //  System.out.println(max);                          // ორი რიცხვის შედარება (არამთელი რიცხვები)


        //double sqrt =  Math.sqrt(9);
        //System.out.println(sqrt);                         // ფესვიდან ამოღება თუ არამთელია)

        // System.out.println(Math.abs(-100));                // მინუსიდან გაპლიუსება(შეგვიძლია პირდაპირ დავპრინტოთ)

        // double random =  Math.random();
        // System.out.println(random * 100);                  // რენდომ რიცხვი 0-1მდე (თუ 100 ჩათვლით გვინდა გავამრავლოთ 100)

        //System.out.println((int) (Math.random() * 100));    // თუ მინდა რომ მთელ რიცხვებში ჩავწერო დავიყვან ინტზე

        //კომენტარი მიწერა -> //   და თუ ბევრის გაყინვა მინდა */ და სადაც დასრულება მინდა გაყინვის იქ დავუწერ  */


        // If / Else
        // თუ მომხმარებლის ასაკი <25 ვერ დაგერისტრირდები
        //  თუ მეტია 25ზე დარეგისტრირდება

      /*  int minAge = 25;
        int currentAge = 24;

        if (currentAge < minAge) {
            System.out.println("ვერ დარეგისტრირდები");
        }
        else {
            System.out.println("შეგიძლია რეგისტრაცია");
        } */

        /* ამოცანა:

თუ მომხარებლის ასაკი არის 6 - 18 ჩათვლით, შეუძლია აიღოს სკოლის
მოსწავლის ბარათი
თუ მომხარებლის ასაკი არის 19 - 24 ჩათვლით, შეუძლია აიღოს
სტუდენტის ბარათი
თუ მომხარებლის ასაკი არის 25 - 64 ჩათვლით, შეუძლია აიღოს ბიზნეს
ბარათი
თუ მომხარებლის ასაკი არის > 64 შეუძლია აიღოს საპენსიო ბარათი
თუ მომხმარებელი არის 6 წლამდე ასაკის, მაშინ ვერ გახსნის ბარათს

         */
      /* int currentAge = 18;

       if (currentAge >= 6 && currentAge <= 18){
           System.out.println("school card");
       }
       else if (currentAge > 18 && currentAge <= 24) {
           System.out.println("student card");
       }
       else if (currentAge > 24 && currentAge <= 64) {
           System.out.println("business card");
       }
       else if (currentAge > 64) {
           System.out.println("retire card");
       }
       else {
           System.out.println("no card");
       } */

        /* ამოცანა:

თუ სტუდენტი აიღებს 70 ქულაზე ნაკლებს, მას არ გადაეცემა
სერთიფიკატი
თუ სტუდენტი აიღებს მინიმუმ 70 ქულას, მას გადაეცემა C დონის
სერთიფიკატი
თუ სტუდენტი აიღებს მინიმუმ 80 ქულას, მას გადაეცემა B დონის
სერთიფიკატი
თუ სტუდენტი აიღებს მინიმუმ 90 ქულას, მას გადაეცემა A დონის
სერთიფიკატი */

       /* int currentScore = 80;
        int minScore = 70;

        if (currentScore >= 90){
            System.out.println("A certification");
        }
        else if (currentScore >= 80) {
            System.out.println("B certification");
        }
        else if (currentScore >= 70) {
            System.out.println("C certification");
        }
        else {
            System.out.println("No certification");
        } */


        //  ტერნალური ოპერატორი - Ternary Operator გამოიყენება მარტივი ლოგიკებისთვის(string) (შედგება სამი ნაწილისაგან :
        //  variable =  (condition) ?  expressionTrue : expressionFalse;
        //  გაშიფვრა : if-ს პირობა მუშაობს ? თუ მუშაობს შესრულდება True თუ არადა False


       /* int currentAge = 24;
        int minAge = 25;

        String s =(currentAge< minAge) ?  "no" : "yes";
        System.out.println(s);

        */

        // Switch (რაც გვინდა რომ შევამოწმოთ უნდა ჩაიწეროს switch- ში )

       /* int finalScore = 67;
        switch (finalScore){
            case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 :
                System.out.println("A");
                break;
            case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89 :
                System.out.println("B");
                break;
            default:
                System.out.println("No certification");   // თუ default-ს არ დავიწერ მაშინ არაფერს დაბეჭდავს
                */





    }
}

    }