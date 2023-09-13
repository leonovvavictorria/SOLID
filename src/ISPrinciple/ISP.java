package ISPrinciple;

//принцип разделения интерфейса
/*Для того чтобы не происходило нарушения принципа, необходимо разделить наш исходный интерфейс Payments на несколько и,
создавая классы, имплементить в них только те интерфейсы с методами, которые им нужны.
* */

public class ISP {
    public interface WebMoneyPayment {
        void payWebMoney();
    }

    public interface CreditCardPayment {
        void payCreditCard();
    }

    public interface PhoneNumberPayment {
        void payPhoneNumber();
    }

    public class InternetPaymentService implements WebMoneyPayment,
            CreditCardPayment,
            PhoneNumberPayment{
        @Override
        public void payWebMoney() {
            //logic
        }
        @Override
        public void payCreditCard() {
            //logic
        }
        @Override
        public void payPhoneNumber() {
            //logic
        }
    }

    public class TerminalPaymentService implements WebMoneyPayment, CreditCardPayment{
        @Override
        public void payWebMoney() {
            //logic
        }
        @Override
        public void payCreditCard() {
            //logic
        }
    }
}
