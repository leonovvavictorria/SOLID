package DIPrinciple;

import java.math.BigDecimal;

//принцип инверсий зависимости
/* Модули верхних уровней не должны зависеть от модулей нижних уровней.
* */
public class DIP {
    public interface Payments {
        void doTransaction(BigDecimal amount);
    }

    public class Cash implements Payments{
        @Override
        public void doTransaction(BigDecimal amount) {
            //logic
        }
    }

    public class BankCard implements Payments{
        @Override
        public void doTransaction(BigDecimal amount) {
            //logic
        }
    }

    public class PayByPhone implements Payments {
        @Override
        public void doTransaction(BigDecimal amount) {
            //logic
        }
    }

    public class Shop {
        private Payments payments;

        public Shop(Payments payments) {
            this.payments = payments;
        }

        public void doPayment(Object order, BigDecimal amount){
            payments.doTransaction(amount);
        }
    }
}
