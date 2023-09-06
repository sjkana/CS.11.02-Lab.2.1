public class Main {

    public static void main(String[] args) {
        //1
        add(1,2);
        //2
        add(1,2,3,4);
        //3
        String morningName = "Toby Fox";
        System.out.println(morningGreeting(morningName));
        //4
        String afternoonName = "Mac Miller";
        System.out.println(afternoonGreeting(afternoonName));
        //5
        String tripleText = "oohbaby";
        System.out.println(triple(tripleText));
        //6
        double halfNumber = 2;
        System.out.println(half(halfNumber));
        //7
        double roundPos = 8.5;
        System.out.println(roundPositiveValueToNearestInteger(roundPos));
        //8
        double roundNeg = 8.5;
        System.out.println(roundNegativeValueToNearestInteger(roundNeg));
    }

    // 1. add
    public static int add(int a, int b)
    {
        return a+b;
    }
    // 2. add
    public static int add(int a, int b, int c, int d)
    {
        int e;
        int f;
        e = add(a,b);
        f = add(c,d);
        return add(e,f);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name)
    {
        return "早上好, " + name+ "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name)
    {
        return "下午好, " + name+ "!";
    }
    // 5. triple
    public static String triple(String text)
    {
        return text + text + text;
    }

    // 6. half
    public static double half(double number)
    {
        return(number/2);
    }
    // 7. roundPositiveValueToNearestInteger
    public static double roundPositiveValueToNearestInteger(double number)
    {
        return (int)(number + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double number)
    {
        return (int)(number - 0.5);
    }

}
