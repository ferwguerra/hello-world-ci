package com.codurance.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerShould {

    @Mock
    UserService userService;

    @Test
    public void be_Fernando_when_get_name() {
        given(userService.findById(new Long(1L))).willReturn(new User(new Long(1L), "Fernando"));
        UserController userController = new UserController();
        userController.setUserService(userService);

        User user = userController.getUser(1L);

        assertNotNull(user);
        assertThat(user.getName(), is("Fernando"));
    }
}
