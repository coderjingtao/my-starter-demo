package com.github.coderjingtao;

import com.github.coderjingtao.core.MyService;
import com.github.coderjingtao.utils.MyStringUtils;
import com.github.coderjingtao.utils.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest{

    @Autowired
    private MyService myService;

    @Test
    public void testBean(){
        myService.printMessage();
        String message = myService.getMessage();
        System.out.println(message);
    }

    @Test
    public void testUtils(){
        String string = StringUtils.toLowerCase("ABCDEFG");
        System.out.println(string);
    }

    @Test void testMyUtilsWithConfig(){
        String str = MyStringUtils.convert("abcdefg");
        System.out.println(str);
    }
}
