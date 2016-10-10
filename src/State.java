import java.util.HashMap;

/**
 * Created by sagarmaurya on 10/9/16.
 */
public class State {

    private boolean finalState;
    private HashMap<Character,State> transitionTable = new HashMap<>();

    public boolean isFinal() {
        return finalState;
    }

    public void makeFinalState() {
        this.finalState = true;
    }

    public State goToNextState(char inputChar) {
        if(transitionTable.containsKey(inputChar))
            return transitionTable.get(inputChar);
        return this;
    }

    public void setTransition(char alphabet, State nextState) {
        transitionTable.put(alphabet,nextState);
    }
}
