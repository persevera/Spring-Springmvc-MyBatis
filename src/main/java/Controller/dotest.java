package Controller;

import Myclass.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.serviceimpl.daoserviceImpl;


import java.util.List;

@Controller
public class dotest {
    //从容器中获取service对象
    String config= "spring.xml";
    ApplicationContext ac=new ClassPathXmlApplicationContext(config);
    daoserviceImpl  myservice= (daoserviceImpl) ac.getBean("studentService");

    //处理some.do请求，通过service调用Dao,查询
    @RequestMapping(value = "/some.do",method = RequestMethod.POST)
    public String doth(Model mo){
        List<People> selectallpeople = myservice.selectallpeople();
        mo.addAttribute("allpeople",selectallpeople);
        return  "show";
    }

}
