import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;




public class Main {
    public static void main(String[] args) {
         String str = "manish kumar panday";

        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c).filter(Character::isLetter)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("My name is Aniket");



    }
}