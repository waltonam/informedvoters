package client;

/**
 * Created by hoisi on 10/27/2016.
 */
public class Voter{
    int voterID;

    public Voter(){}

    public void openBallot(){
        Context.getInstance().currentBallot().setCandidates(Context.getInstance().currentTally().getCandidates());
    }

    public void vote(){
        //TODO: (Aaron) This is where we write the contents of the object on the next line to the DB
        // Ballot submit = Context.getInstance().currentBallot();
    }

    public int getVoterID() {
        return voterID;
    }

    public void setVoterID(int voterID) {
        this.voterID = voterID;
    }

    public Boolean authenticate(String input){
        String query = "test"; //TODO: Change this to query for registered and yet to vote user
        if(input.equals(query)){
            return true;
        }
        else{
            return false;
        }
    }
}