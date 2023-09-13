package LSPrinciple;

import java.math.BigDecimal;

//принцип Барбары Лисков
/* Замена класса PaymentAccount на его класс-наследник SalaryAccount не "поломает" нашу программу,
так как класс SalaryAccount имеет доступ ко всем методам, что и PaymentAccount.
Также все будет хорошо при замене класса Account на его класс-наследник PaymentAccount.
Принцип подстановки Барбары Лисков заключается в правильном использовании отношения наследования.
Мы должны создавать наследников какого-либо базового класса тогда и только тогда,
когда они собираются правильно реализовать его логику, не вызывая проблем при замене родителей на наследников.
* */
public class LSP {
    public class Account {
        public BigDecimal balance(String numberAccount){
            //logic
            BigDecimal bigDecimal = null;
            return null;
        };
        public void refill(String numberAccount, BigDecimal sum){
            //logic
        }
    }

    public class DepositAccount extends Account{
        @Override
        public BigDecimal balance(String numberAccount){
            //logic
            BigDecimal bigDecimal = null;
            return null;
        };
        @Override
        public void refill(String numberAccount, BigDecimal sum){
            //logic
        }
    }

    public class PaymentAccount extends Account{
        public void payment(String numberAccount, BigDecimal sum){
            //logic
        }
    }

    public class SalaryAccount extends PaymentAccount{
        @Override
        public BigDecimal balance(String numberAccount){
            //logic
            BigDecimal bigDecimal = null;
            return null;
        };
        @Override
        public void refill(String numberAccount, BigDecimal sum){
            //logic
        }
        @Override
        public void payment(String numberAccount, BigDecimal sum){
            //logic
        }
    }
}
