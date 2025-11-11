package iotbigdata.shop.springbootdeveloper;

import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping
    public List<Member> getTest(){
        List<Member> members = testService.getAllMembers();
        return members;
    }
}
