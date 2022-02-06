package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {
    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void sentDel() {
        List<Account> accounts = new ArrayList<>(Arrays.asList(
                new Account("2010 353", "Anna", "200"),
                new Account("2014 597", "Andrey", "300"),
                new Account("2010 353", "Gleb", "400"),
                new Account("2010 353", "", ""),
                new Account("2007 345", "Eva", "65")
        ));
        Set<Account> expected = new HashSet<>(Arrays.asList(
                new Account("2010 353", "Anna", "200"),
                new Account("2014 597", "Andrey", "300"),
                new Account("2007 345", "Eva", "65")
        ));
        assertThat(NotifyAccount.sent(accounts), is(expected));
    }
}