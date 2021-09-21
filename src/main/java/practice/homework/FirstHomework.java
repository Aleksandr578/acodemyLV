package practice.homework;

public class FirstHomework {

    public static void main(String[] args) {

        // boolean types

        boolean isWarm = false;
        System.out.format("- Is it warm?%n- %b%n", isWarm);

        boolean isIAmeGrateQAspecialist = true;
        System.out.println(isIAmeGrateQAspecialist);

        boolean isAMonkeySittingOnABranch = false;
        System.out.println(isAMonkeySittingOnABranch);

        boolean isSummerOver = true;
        System.out.println(isSummerOver);

        boolean isNoFoodInTheRefrigerator = false;
        System.out.println(isNoFoodInTheRefrigerator);

        // int type

        int numberOfDaysPerYear = 365;
        System.out.format("Number of days per year: %d%n", numberOfDaysPerYear);

        int numberOfSeatsInTheBus = 45;
        System.out.println(numberOfSeatsInTheBus);

        int numberOfTeethInWhiteShark = 200;
        System.out.println(numberOfTeethInWhiteShark);

        int numberOfApartments = 129;
        System.out.println(numberOfApartments);

        int childrenInQuarantine = 38;
        System.out.format("Currently in quarantine: %d%n", childrenInQuarantine);

        // double type

        double freezingPointOfNitrogen = -210;
        System.out.format("Point of nitrogen: %.1f C %n", freezingPointOfNitrogen);

        double milkPrice = 1.25;
        System.out.format("Milk price is %.2f %n", milkPrice);

        double myNormalWeight = 190;
        System.out.format("My weight is %.2f kg. %n", myNormalWeight);

        double myNotNormalHeight = 1.79;
        System.out.format("My height is %.2f m. %n", myNotNormalHeight);

        double startTimeOfLesson = 18.30;
        System.out.format("Weight the start time of the lesson is %.2f %n", startTimeOfLesson);

        // float type

        float valueOfNumberPi = 3.141592653589793238462643f;
        System.out.format("π = %f%n",valueOfNumberPi);

        float normalBodyTemperature = 36.6f;
        System.out.println(normalBodyTemperature);

        float priceOfDiesel = 1.237f;
        System.out.format("The price of diesel fuel: %.3f € %n", priceOfDiesel);

        float accelerationTime = 8.5f;
        System.out.format("Acceleration time of the car to 100 km/h: %.1f sec %n", accelerationTime);

        float dollarEquals = 0.85f;
        System.out.format("Dollar price: %.2f Euro %n", dollarEquals);

        // long type

        long numberOfViews = 8_004_736_746_647L;
        System.out.format("Number of views of the Video is %d%n", numberOfViews);

        long accountNumber = 266378849576615528L;
        System.out.format("Swedbank account number: %d%n", accountNumber);

         long numberOfStars = 947520003717459847L;
         System.out.format("The number of stars in the sky is %d. %n", numberOfStars);

         long howManyAnts = 300000L;
         System.out.format("How many ants are there in the anthill? - %d individuals. %n", howManyAnts);

         long distanceToSun = 150000000L;
         System.out.format("Distance to the sun is %d km. %n", distanceToSun);

         //byte type

        byte numberOfStudents = 85;
        System.out.println(numberOfStudents);

        byte familyMember = 7;
        System.out.format("How many people are in your family? - %d%n", familyMember);

        byte mathematicalExample = -50;
        System.out.format("70-120=%d%n",mathematicalExample);

        byte startingPoint = 0;
        System.out.format("The starting point of all calculations is - %d%n", startingPoint);

        byte lowestTemperature = -98;
        byte highestTemperature = 57;
        System.out.format("The lowest temperature recorded on Earth is %d C, and the highest temperature is %d C. %n", lowestTemperature, highestTemperature);

        //short type

        short quadratureOfRoom = 1000;
        System.out.format("Total area of the room: %d m2.%n",quadratureOfRoom);

        short testerSalary = 1500;
        System.out.format("Average salary of a tester is %d €%n", testerSalary);

        short demographicsDecember = -2_329;
        System.out.format("Demographics of the country for December: %d%n",demographicsDecember);

        short schoolchildrenOfRiga = 32178;
        short kindergartensOfRiga = 25543;
        System.out.format("Number of students in the school of Riga: %d people. Number of kindergartens of Riga: %d people.%n",schoolchildrenOfRiga, kindergartensOfRiga);

        //char type

        char letterClass = 'B';
        System.out.format("Control work, 5%s%n",letterClass);

        char letteringOfHouse = 'D';
        System.out.println(letteringOfHouse);

        char invitationToBanquet = '1';
        System.out.format("Accompanying person + %c%n",invitationToBanquet);

        char thirdLetter = 'C';
        System.out.format("A, B, %c%n", thirdLetter);

        char numberOfTires = '4';
        System.out.println(numberOfTires);

        // String type

        String myName = "Aleksandr";
        String myLastname = "Ionov";
        String myCityOfBirth = "Liepaja";
        String myHobby = "travel";
        String myHobby1 = "to ski";

        System.out.format("My Name is %s %s. I was born in %s. My Hobby is %s, and %s.", myName, myLastname, myCityOfBirth, myHobby, myHobby1);
    }
}
