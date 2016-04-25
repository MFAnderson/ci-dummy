package com.errantschwa.cidummy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ButtTest {

    @Test
    public void shouldMathWhenTurd() {
        assertThat(Butt.turd(2, 4), is("8"));
    }

}
