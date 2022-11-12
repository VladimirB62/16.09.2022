package CharCounter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharCounterByDoubleArrayTest {

    @Test
    void charCounter() {
        String str = "aaaaaabbbbssg   ";
        CharCounterByDoubleArray.charCounter(str);
    }
}