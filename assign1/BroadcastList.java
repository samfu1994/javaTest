
import java.util.List;

/**
 * This is the broadcast list class which captures information of a broadcast
 * list
 *
 * @author jmishra
 */
public class BroadcastList
{
    //bcast,rdixon,"work people",rdixwp,preed,afisher,lday

    //TODO: Add class fields here
    List<String> Members;
//    String Username;
//    String Description;
    String Nickname;
    /**
     * Constructs a new instance of this class. nickname cannot be null or
     * empty. members cannot be null.
     *
     * @param nickname the nickname of the broadcast list
     * @param members the list of nicknames of all members of this list
     * @throws WhatsAppRuntimeException throw a new instance of this with
     * CANT_BE_EMPTY_OR_NULL message if the validation of nickname or members
     * fails
     *
     */
    public BroadcastList(String nickname, List<String> members) throws WhatsAppRuntimeException
    {
        if(nickname.equals(null) || nickname.isEmpty() || members == null){
            throw WhatsAppRuntimeException;
        }
        this.Nickname = nickname;
        this.Members = members;
        //TODO
    }

    /**
     * A getter of the nickname
     *
     * @return the nickname of the broadcast list
     */
    public String getNickname()
    {
        return Nickname;
    }

    /**
     * A setter of the nickname of this broadcast list
     *
     * @param nickname the nickname of this broadcast list
     */
    public void setNickname(String nickname)
    {
        this.Nickname = nickname;
        //TODO
    }

    /**
     * A getter of the list of members of this broadcast list
     *
     * @return the list of members of this broadcast list
     */
    public List<String> getMembers()
    {
        //TODO
        return Members;
    }

    /**
     * A setter of the list of members of this broadcast list
     *
     * @param members the list of members of this broadcast list
     */
    public void setMembers(List<String> members)
    {
        //TODO
        this.Members = members;
    }

}
