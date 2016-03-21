package chatdingsi;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by z003aknc on 17.03.2016.
 */
public class HibernateTutorial
{
    public static void main(/String[] args)
    {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("emf");

        EntityManager manager = factory.createEntityManager();

        ChatClient chatClient = new ChatClient();

        chatClient.setFirstName("Max");
        chatClient.setSurName("Mustermann");

        manager.getTransaction().begin();
        manager.persist(chatClient);
        manager.getTransaction().commit();

        manager.getTransaction().begin();

        List<ChatClient> clients = manager.createQuery(
                "select c.client from ChatClient c").getResultList();

        for (ChatClient c : clients)
        {
            System.out.println("Client " + c.getSurName() + " sent the following messages: ");

            Message message = new Message();
        }
    }
}
