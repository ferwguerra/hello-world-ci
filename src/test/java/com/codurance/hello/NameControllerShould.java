package com.codurance.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class NameControllerShould {

    @Mock
    NameService nameService;

    @Test
    public void be_Fernando_when_get_name() {
        given(nameService.getName()).willReturn("Fernando");
        NameController nameController = new NameController();
        nameController.setNameService(nameService);

        assertThat(nameController.getName(), is("Fernando"));
    }
}
