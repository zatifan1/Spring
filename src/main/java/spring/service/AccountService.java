package spring.service;

import spring.model.Account;

import java.util.List;

public interface AccountService {
    Account getById(Long id);

    void save(Account account);

    void delete(Long id);

    List<Account> getAll();
}
