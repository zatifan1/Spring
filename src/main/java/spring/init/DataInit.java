package spring.init;


import spring.model.Account;
import spring.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataInit implements ApplicationRunner {
    private AccountRepository accountRepository;

    @Autowired
    public DataInit(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Date date = df.parse("1995-11-08");
        Account account = new Account("zakir", "kuchukov", date, "zatifan@list.ru", "dasfsadf");
        Account account1 = new Account("timur", "nasyrov", date, "timur@list.ru", "aaaaaaaaa");

        accountRepository.save(account);
        accountRepository.save(account1);
        System.out.println();
        try(FileWriter writer = new FileWriter("test.txt", false))
        {
            String text = accountRepository.findById((long) 1).toString();
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
