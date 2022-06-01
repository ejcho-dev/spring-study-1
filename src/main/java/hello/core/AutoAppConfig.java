package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( // @Component 애노테이션이 붙어있는 모든 클래스를 Bean으로 등록해준다
        // 탐색할 패키지 시작 위치 지정
        // basePackages = "hello.core"
        
        // 기본적으로 @ComponentScan 애노테이션이 붙은 설정 정보 클래스의 패키지를 시작 위치로 지정하게 됨
        // ex) AutoAppConfig --> hello.core 하위의 모든 클래스 조회
        
        // !! 권장하는 방법 !! 설정 정보 클래스의 위치를 프로젝트 최상단에 두자 스프링 부트도 동일하다
        // 스프링 부트의 @SpringBootApplication 내에 @ComponentScan이 포함되어 있음
        
        // @Configuration 애노테이션 안에 @Component가 포함되어 있으므로 이를 제외함
        // 실무에서는 굳이 @Configuration을 제외하지 않으나 기존 코드와의 충돌을 피하기 위한 것
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
    
}
