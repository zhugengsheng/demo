import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {

        Apple apple = new Apple();
        apple.setColor("red");
        apple.setId(1);
        apple.setOrigin("sdf");
        apple.setWeight(2);
        List<Apple> appleList = new ArrayList<>();
        appleList.add(apple);
        appleList.add(apple);
        appleList.add(apple);
        List<Integer> appleid = appleList.stream().map(apple1 -> apple1.getWeight()).collect(Collectors.toList());
        System.out.println(appleid);
    }


    public static Integer getAge(Function<String,Integer> function, String args){
        return function.apply(args);
    }
}
