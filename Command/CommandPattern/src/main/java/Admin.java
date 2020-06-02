import java.util.ArrayList;
import java.util.List;

public class Admin {

    private List<Commands> commendsList = new ArrayList<Commands>();
    public void Commander(Commands commands){
        commendsList.add(commands);
    }

    public void giveACommand(){

        for (Commands commands : commendsList) {
            commands.apply();
        }
        commendsList.clear();
    }
}
