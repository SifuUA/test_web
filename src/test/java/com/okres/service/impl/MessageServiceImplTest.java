package test.com.okres.service.impl;

import main.com.okres.service.MessageService;
import main.com.okres.service.impl.MessageServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alex on 31.05.2017.
 */
public class MessageServiceImplTest {

    MessageService service;

    @Before
    public void intit()
    {
        service = new MessageServiceImpl();
    }
    @Test
    public void getGreetings() throws Exception {
        String name = "Ivan";
        String expexted = "Hello, Ivan! How are you?";

        String actual = service.getGreetings(name);

        Assert.assertEquals(expexted, actual);
    }

}