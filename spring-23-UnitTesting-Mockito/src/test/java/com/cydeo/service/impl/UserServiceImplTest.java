package com.cydeo.service.impl;

import com.cydeo.mapper.UserMapper;
import com.cydeo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class) //basically enabling mockito into the testing framework
class UserServiceImplTest {

    @Mock
    UserRepository userRepository;

    @Mock
    UserMapper userMapper;

    @InjectMocks //cant work with interfaces needs the real class
    UserServiceImpl userService;

    @Test
    void findByUserName_Test(){

        //we are calling the real method inside of the main which is the method we want to test
        userService.findByUserName("harold@manager.com");

        //this checks if the method is able to run or not
        verify(userRepository).findByUserNameAndIsDeleted("harold@manager.com",false);

        verify(userRepository, times(1)).findByUserNameAndIsDeleted("harold@manager.com", false);
        verify(userRepository, atLeastOnce()).findByUserNameAndIsDeleted("harold@manager.com", false);
        //the below line will fail test as it wants to run two times
        // verify(userRepository, atLeast(2)).findByUserNameAndIsDeleted("harold@manager.com", false);
        verify(userRepository, atMostOnce()).findByUserNameAndIsDeleted("harold@manager.com", false);
        verify(userRepository, atMost(1)).findByUserNameAndIsDeleted("harold@manager.com", false);

        InOrder inOrder = inOrder(userRepository, userMapper);

        inOrder.verify(userRepository.findByUserNameAndIsDeleted("harold@manager.com",false));
        inOrder.verify(userMapper).convertToDto(null);
        //the above two lines check the order that it was run in



    }






}