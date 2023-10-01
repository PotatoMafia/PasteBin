package UserInformation;

import java.util.List;

/*There is the basic information about the User*/
public class User {
    private String userName;
    private String password;
    private String mail;
    private List<Paste> listOfPastes;


    private User(String userName, String password, String mail){
        this.userName = userName;
        this.password = password;
        this.mail = mail;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Paste> getListOfPastes() {
        return listOfPastes;
    }

    public void setListOfPastes(List<Paste> listOfPastes) {
        this.listOfPastes = listOfPastes;
    }
}
