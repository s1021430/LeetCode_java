package ValidParentheses;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void Test() {
        var testData = new String[]{"{(([])[{}]{})}","}(({])[{}]{}){"};
        var testResults = new ArrayList<Boolean>();
        for (var t: testData) {
            testResults.add(ValidParentheses.isValid(t));
        }
        assertArrayEquals(new Boolean[]{true,false},testResults.toArray());
    }
}