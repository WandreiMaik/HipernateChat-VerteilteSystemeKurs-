package chatdingsi;

import javax.persistence.*;

/**
 * Created by z003aknc on 17.03.2016.
 */
@Entity
public class Message
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private ChatClient owner;

    private String message;

    public Message(){}

    public Message(String message)
    {
        setMessage(message);
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public Long getId() {
        return id;
    }
}
