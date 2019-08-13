import java.util.ArrayList;
import java.util.List;

public class test5 {
    public static void main(String[] args) {
   /*     Long num = 0L;
        System.out.println(num==0);*/
/*        int count =0;
        while (count<10){
            if(count == 5){
                return;
            }
            System.out.println(count++);
        }*/
     /*   System.out.println("============");
        for (int i=0;i<10;i++){
            soutaa(i);
            System.out.println(i);
        }*/
 /*       Apple apple = new Apple();

        try {
            soutaa(apple);
            System.out.println("mamama");
        }catch (Exception e){
            System.out.println("dadada");
        }*/
        List<Apple> appleList = new ArrayList<>();
        try {
            soutaaList(appleList);
            System.out.println("mamama");
        }catch (Exception e){
            System.out.println("dadada");
        }
    }
    private static void soutaa(Apple apple){
     /*   if(i==5){
            return;
        }   System.out.println("aaa"+i);
        */
        try {
            System.out.println(apple.getWeight());
        }catch (Exception e){
            System.out.println("xaxaxa");
            return;
        }

    }
    private static void soutaaList(List<Apple> appleList){
     /*   if(i==5){
            return;
        }   System.out.println("aaa"+i);
        */
        try {
            System.out.println(appleList.get(0));
        }catch (Exception e){
            System.out.println("xaxaxa");
            return;
        }

    }
}
