package SRPrinciple;

import java.util.Objects;

public class SRP {
    //этот принцип говорит о том, что каждое действие описывает свой класс
    //например, существует класс, который описывает день кота

    public class CatSayMeow {
        public String catSay = "Meow";
        public void meow() {
            if (Objects.equals(catSay, "Meow")) System.out.println("Good cat!");
        }
    }

    public class CatSleep {
        public boolean sleepCat = false; // по умолчанию у меня кот спит
        public void wakeUp() {
            if (!sleepCat) sleepCat = true; // если кот спит, то он просыпается
        }
    }
}
