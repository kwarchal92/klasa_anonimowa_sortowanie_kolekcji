package klasa_anonimowa;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<String> imiona = Arrays.asList("Adam", "Ewa", "Katarzyna", "Bartosz", "Jakub", "Sławomira", "Magdalena");

        Collections.sort(imiona, new Comparator<String>() //klasa anonimowa
        {
            @Override
            public int compareTo(String o1, String o2)
            {
                return o2.compareTo(o1);
            }
        }); //odwrocone sortowanie kolekcji

        System.out.println(imiona);
    }
}
