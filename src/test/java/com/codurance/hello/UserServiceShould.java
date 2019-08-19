package com.codurance.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceShould {

    @Mock
    UserRepository userRepository;

    @Test
    public void be_Fernando_when_get_name() {
        UserService userService = new UserService();
        BDDMockito.given(userRepository.findById(1L)).willReturn(Optional.of(new User(new Long(1L), "Fernando")));
        userService.setUserRepository(userRepository);

        User user = userService.findById(1L);

        assertThat(user.getId(), is(1L));
        assertThat(user.getName(), is("Fernando"));
    }
}
