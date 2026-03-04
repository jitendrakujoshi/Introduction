package main.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

    public void regular() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("amit");
        names.add("pal");
        names.add("singh");
        names.add("poonia");

        int count = 0;

        for (int i = 0; i < names.size(); i++) {
            String actual = names.get(i);
            if (actual.startsWith("a")) {   // lowercase a
                count++;
            }
        }
        System.out.println(count);
        
        
        ArrayList<String> names1 = new ArrayList<String>();
        names1.add("amit");
        names1.add("pal");
        names1.add("singh");
        names1.add("poonia");

        long count1 = names1.stream()
                          .filter(s -> s.startsWith("p"))
                          .count();

        System.out.println("stream count "+count1);
        names.stream()
        .filter(s -> s.startsWith("p"))
        .forEach(s -> System.out.println(s));
        
        
        List<String> names11 = Arrays.asList("aram", "moham", "sandeep", "Amit", "Anil");
        
        names11.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s -> System.out.println(s));

        
        
        List<Integer> values = Arrays.asList(2,3,2,4,7,8,4,9);
        values.stream().distinct().forEach(s->System.out.println(s));

        
        
    }

    // ✅ main method
    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.regular();
    }
}
