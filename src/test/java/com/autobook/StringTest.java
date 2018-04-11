package com.autobook;

import com.autobook.core.PatternRegex;
import com.autobook.core.AutoBookBuilder;
import org.junit.Test;

import java.util.List;

/**
 * Created by jiabaowang on 2018/4/11.
 */
public class StringTest {

    @Test
    public void testSubstr(){
        String str = "613 6053092137 ".trim();

        System.out.println(str.substring(4,str.length()));
    }

 /*   @Test
    public void testParttern(){
        String content = "<AutoBookRequest>aaaaa</AutoBookRequest> ";
        PatternRegex regex = new PatternRegex();
        AutoBookBuilder bookBuilder = new AutoBookBuilder(regex);
        List<String> contents = bookBuilder.groupAutoBookRequestContent(content);

        for(String item : contents){
            System.out.println(item);
        }
    }


    @Test
    public void testPattern(){
        String str = "2018-04-11 09:24:01.613 6053092137";
        String reg = "\\d{4}(-\\d{2}){2} (\\d{2}:){2}\\d{2}\\.\\d{3} \\d{10}";
        //String reg = "\\d{4}(-\\d{2}){2}";
        List<String> contents = AutoBookBuilder.groupAutoBookContent(str,reg);
        for(String item : contents){
            System.out.println(item);
        }
    }*/
}
