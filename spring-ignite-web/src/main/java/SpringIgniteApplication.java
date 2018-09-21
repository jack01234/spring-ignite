import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * spring boot 启动入口
 *
 * @author: yingmuhuadao
 * @date: Created in 16:41 2018/9/21
 */
@EnableAutoConfiguration
public class SpringIgniteApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringIgniteApplication.class,args);
    }
}
