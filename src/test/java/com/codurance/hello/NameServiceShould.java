package com.codurance.hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NameServiceShould {

    @Test
    public void be_Fernando_when_get_name() {
        NameService nameService = new NameService();
        assertThat(nameService.getName(), is("Fernando"));
    }
}
