import java.util.Set;

/**
 * Created by sagarmaurya on 10/9/16.
 */
public class DFAMachine {
    private final Set<State> stateSet;
    private final State initialState;
    private final Set<State> finalStateSet;

    public DFAMachine(Set<State> stateSet , State initial, Set<State> finalStateSet) {
        this.stateSet = stateSet;
        this.initialState = initial;
        this.finalStateSet = finalStateSet;
    }

    public boolean run(String string){
        State currentState = initialState;
        for (int index = 0; index < string.length(); index++) {
             currentState = currentState.goToNextState(string.charAt(index));
        }
        return currentState.isFinal();
    }

}
