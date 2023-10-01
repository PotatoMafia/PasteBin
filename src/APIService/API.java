package APIService;

import UserInformation.Paste;
import UserInformation.User;

public class API {

    private User activeUser;


    public Paste getPaste(){
       return activeUser.getLastOfPastes();
    }

    /*Here we are adding a new paste to:
    1)the list of user's pastes
    2)the GoogleCloudStore
    3) BD
     */

    public void addPaste(Paste paste){
        activeUser.addPaste(paste, activeUser.getListOfPastes());
    }
}
