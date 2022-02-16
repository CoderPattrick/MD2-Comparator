import Circle.*;

import java.util.Arrays;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        Circle[] circles=new Circle[3];
        circles[0]=new Circle(3.6);
        circles[1]=new Circle();
        circles[2]=new Circle(3.5,"indigo",true);
        System.out.println("Pre-sorted: ");
        for (Circle c:circles
             ) {
            System.out.println(c);
        }
        Comparator circleCom = new CircleComparator();
        Arrays.sort(circles,circleCom);
        System.out.println("After-sorted: ");
        for (Circle c:circles
        ) {
            System.out.println(c);
        }
    }
}
