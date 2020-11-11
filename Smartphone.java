package D_JavaAdvancedOOP.Lecture4_InterfaceAndAbstraction.ExProblem_5;
import java.util.List;
public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.setNumbers(numbers);
        this.setUrls(urls);
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getUrls() {
        return urls;
    }

    @Override
    public String browse() {
        return String.format("Browsing: ");
    }

    @Override
    public String call() {
        return String.format("Calling... ");
    }
}
