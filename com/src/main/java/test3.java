import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class test3 {
    public static void main(String[] args) {
      /*  int count = Stream.of(1,2,3)
                .reduce(0,(acc,ele)->acc+ele);
        System.out.println(count);


        new test3().overloadedMethod((x, y) -> x + y);*/

        Arrays.asList(1,2,3,4,5,6).forEach(a->{
            System.out.println(a);
            if(a==2){
                return;
            }
            System.out.println(a+"=====");
        });


    }


    private interface IntegerBiFunction extends BinaryOperator<Integer> {
    }
    private void overloadedMethod(BinaryOperator<Integer> Lambda) {
        System.out.print("BinaryOperator");
    }
 /*   private void overloadedMethod(IntegerBiFunction Lambda) {
        System.out.print("IntegerBinaryOperator");
    }*/
}
