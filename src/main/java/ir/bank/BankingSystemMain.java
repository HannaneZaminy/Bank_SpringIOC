package ir.bank;

import ir.bank.configuration.Config;
import ir.bank.web.ManagerController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankingSystemMain {
    public static void main(String[] args) throws Exception {

        ApplicationContext iocContainer = new AnnotationConfigApplicationContext(Config.class);

        ManagerController managerController = iocContainer.getBean(ManagerController.class);
        managerController.ManagerLogin();

    }

}
