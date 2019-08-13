import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AppleServer {
    private List<Apple> applestroe = new ArrayList<>();

    public List<Apple> getAppleByPredicate(Predicate<Apple> predicate){
        ArrayList result = new ArrayList();
        for(Apple apple:applestroe){
            if(predicate.test(apple)){
                result.add(apple);
            }
        };
        applestroe.stream().filter(predicate).collect(Collectors.toList());
        return result;
    }

    public static void main(String[] args) {
        AppleServer server = new AppleServer();
        server.getAppleByPredicate(a->a.getColor().equals("red"));
    }
}
