package D_JavaAdvancedOOP.Lecture4_InterfaceAndAbstraction.ExProblem_5;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> urls = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        Smartphone smartphone = new Smartphone(numbers, urls);

        Pattern urlPattern = Pattern.compile("[http]+:[\\/][\\/][a-zA-z]+.[a-zA-z]+");
        Pattern numberPattern = Pattern.compile("\\d*");


        for (String number : smartphone.getNumbers()) {
            Matcher numberMatcher = numberPattern.matcher(number);
            if (numberMatcher.find()) {
                System.out.printf(smartphone.call() + "%s%n", number);
            } else {
                System.out.println("Invalid number!");
            }
       }

        for (String url : smartphone.getUrls()) {
            Matcher urlMatcher = urlPattern.matcher(url);
            if (urlMatcher.find()) {
                System.out.printf(smartphone.browse() + "%s!%n", url);
            } else {
                System.out.println("Invalid URL!");
            }
        }



    }
}
