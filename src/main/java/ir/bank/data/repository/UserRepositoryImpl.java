package ir.bank.data.repository;

import ir.bank.data.domains.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class UserRepositoryImpl implements UserRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public UserRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void create(User user) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(user);
        tx.commit();
        session.close();
    }
    @Override
    public Optional<User> get(String emailAddress) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        User user = session.find(User.class, emailAddress);

        tx.commit();
        session.close();
        return Optional.ofNullable(user);
    }
    @Override
    public void update(User user) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.update(user);
        tx.commit();
        session.close();
    }
}
