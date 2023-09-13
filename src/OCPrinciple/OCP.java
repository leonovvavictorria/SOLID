package OCPrinciple;

import SRPrinciple.SRP;

public class OCP {
    //здесь принцип открытости-закрытости
    // то есть можно использовать методы/поля и тд. другого класса, добавляя свои, но не изменяя методы/поля и др. класса родителя
    public class Time {
        public int watch = '0';
    }
        public class Moscow extends Time {
            //...
        }
    }
