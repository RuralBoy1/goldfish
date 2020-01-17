package com.goldfish.goldfish;

        import org.mybatis.spring.annotation.MapperScan;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.goldfish.goldfish.dao")
public class GoldfishApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoldfishApplication.class, args);
    }

}
