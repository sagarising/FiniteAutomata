import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sagarmaurya on 10/9/16.
 */
public class StateTest {
    @Test
    public void isFinal_should_return_true_if_it_is_final_state() throws Exception {

        State state = new State();
        state.makeFinalState();
        assertTrue(state.isFinal());
    }

    @Test
    public void isFinal_should_return_false_if_it_is_not_final_state() throws Exception {
        assertFalse(new State().isFinal());
    }

    @Test
    public void goToNextState_should_return_next_state() throws Exception {

        State state = new State();
        State otherState = new State();
        state.setTransition('0',otherState);
        assertEquals(otherState, state.goToNextState('0'));
    }
    @Test
    public void goToNextState_should_return_next_state_according_to_given_character() throws Exception {

        State state = new State();
        State StateFor0 = new State();
        State StateFor1 = new State();
        state.setTransition('0',StateFor0);
        state.setTransition('1',StateFor1);
        assertEquals(StateFor1, state.goToNextState('1'));
        assertEquals(StateFor0, state.goToNextState('0'));
    }
}