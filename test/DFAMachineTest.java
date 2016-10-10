import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by sagarmaurya on 10/9/16.
 */
public class DFAMachineTest {
    @Test
    public void run_should_return_true_if_string_is_recognised() throws Exception {
        State state = new State();
        state.makeFinalState();
        Set<State> stateSet = new HashSet<>();
        stateSet.add(state);
        Set<State> finalStateSet = new HashSet<>();
        finalStateSet.add(state);
        Set<Character> alphabetSet = new HashSet<>();
        alphabetSet.add('0');
        DFAMachine dfaMachine = new DFAMachine(stateSet,state,finalStateSet);
        assertTrue(dfaMachine.run("0"));
    }
    @Test
    public void run_should_return_false_if_string_did_not_recognised() throws Exception {
        State state = new State();
        State otherState = new State();
        otherState.makeFinalState();
        state.setTransition('0',otherState);
        otherState.setTransition('1',state);
        Set<State> stateSet = new HashSet<>();
        stateSet.add(state);
         stateSet.add(otherState);
        Set<State> finalStateSet = new HashSet<>();
        finalStateSet.add(state);
        Set<Character> alphabetSet = new HashSet<>();
        alphabetSet.add('0');
        alphabetSet.add('1');
        DFAMachine dfaMachine = new DFAMachine(stateSet,state,finalStateSet);
        assertFalse(dfaMachine.run("01"));
    }

}