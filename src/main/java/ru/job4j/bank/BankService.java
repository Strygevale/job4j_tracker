package ru.job4j.bank;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Класс BankService реализует систему управления данными о пользователях банка и их счетах
 */
public class BankService {
    /**
     * В коллекции Hashmap хранятся данные о юзерах и их счете
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового пользователя
     * @param user пользователь, которого необходимо добавить
     */
    public void addUser(User user) {
        ArrayList<Account> accounts = new ArrayList<>();
            users.putIfAbsent(user, accounts);
    }

    /**
     * Метод добавляет данные о паспорте
     * @param passport пасспорт пользователя
     * @param account счет в банке, который необходимо добавить пользователю
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по данным пасспорта
     * @param passport пасспорт пользователя
     * @return возвращает пользователя. Если такого нет, возвращает null
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет пользователя по данным счета
     * @param passport значение пасспорта пользователя
     * @param requisite значение реквизитов счета
     * @return возвращает null, если счет не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account acc : accounts) {
                if (acc.getRequisite().equals(requisite)) {
                    return acc;
                }
            }
        }
        return null;
    }

    /**
     * Метод переводит денежные средства с одного счета на другой.
     * @param srcPassport пользователь, со счета которого нужно списать средства
     * @param srcRequisite счет, с которого нужно списать средства
     * @param destPassport пользователь, на счет которого нужно зачислить средства
     * @param destRequisite счет, на который нужно зачислить средства
     * @param amount сумма перевода
     * @return возвраащет true, если перевод удался
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account outCome = findByRequisite(srcPassport, srcRequisite);
        Account inCome = findByRequisite(destPassport, destRequisite);
        if (outCome != null && inCome != null && outCome.getBalance() >= amount) {
            outCome.setBalance(outCome.getBalance() - amount);
            inCome.setBalance(inCome.getBalance() + amount);
            return true;
        }
        return false;
    }
}
