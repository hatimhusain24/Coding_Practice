package Java8_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringUppercase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "spring", "boot");
        //Java8
        List<String> upperCase = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        for (String str : upperCase){
            System.out.println(str);
        }
    }
}
