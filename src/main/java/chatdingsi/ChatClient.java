package chatdingsi;


import javax.persistence.*;
import java.util.ArrayList;

/**
 * Created by z003aknc on 17.03.2016.
 */
@Entity
public class ChatClient
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String surName;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.PERSIST)
    private List<Message> messages = new ArrayList<Message>();

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }
}
