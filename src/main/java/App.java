

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.woniuxy.controller", "com.woniuxy.service"})
@MapperScan("com.woniuxy.dao")  // 等价于以前的MapperScannerConfigurer
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
