package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {



    public static void main(String[] args) {

        /*
    prior java 8
     */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("The result of the comparator is :" + comparator.compare(3,2));

        Comparator<Integer> comparatorLamba = (Integer a, Integer b) -> a.compareTo(b);

        System.out.println("result using Lambas is: " + comparatorLamba.compare(3, 2));

        Comparator<Integer> comparatorLamba1 = (a, b) -> a.compareTo(b);
        System.out.println("Result using Lambas2 is: " + comparatorLamba1.compare(3, 2));
    }
}
