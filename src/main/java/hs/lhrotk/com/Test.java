package hs.lhrotk.com;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("CollectionIncompatibleType")
public class Test {
    public static void main(String[] args) {
        System.out.println("test");
        Set<Short> s = new HashSet<Short>();
        for (Short i=0; i<100; i++) {
            System.out.println(i.hashCode());
            s.add(i);
            s.remove(i-1);
        }
        Integer k1 = 1;
        Short k2 = 1;
        System.out.println(k1.equals(k2));
    }
}
