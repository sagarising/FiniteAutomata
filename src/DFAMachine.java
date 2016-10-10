import java.util.Set;

/**
 * Created by sagarmaurya on 10/9/16.
 */
public class DFAMachine {
    private final State initialState;

    public DFAMachine(State initial) {
        this.initialState = initial;

    }

    public boolean run(String string){
        State currentState = initialState;
        for (int index = 0; index < string.length(); index++) {
             currentState = currentState.goToNextState(string.charAt(index));
        }
        return currentState.isFinal();
    }

}
