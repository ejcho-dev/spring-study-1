package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( // @Component 애노테이션이 붙어있는 모든 클래스를 Bean으로 등록해준다
        // @Configuration 애노테이션 안에 @Component가 포함되어 있으므로 이를 제외함
        // 실무에서는 굳이 @Configuration을 제외하지 않으나 기존 코드와의 충돌을 피하기 위한 것
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
    
}
