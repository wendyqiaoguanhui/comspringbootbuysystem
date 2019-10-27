import com.springboot.buy.Application;
import com.springboot.buy.system.entity.User;
import com.springboot.buy.system.service.serviceImpl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author QiaoGuanHui
 * @date 2019/10/19-8:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class TestEasyBuy {

    @Autowired
    private UserServiceImpl userService;
    @Test
    public void testGetuser(){
        User admin = userService.login("zhangsan", "123123");
        System.out.println(admin);

    }
}
