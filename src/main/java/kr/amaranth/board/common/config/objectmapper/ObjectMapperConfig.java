package kr.amaranth.board.common.config.objectmapper;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by KimKyungHo on 2024-01-09(009)
 */

@Configuration
public class ObjectMapperConfig {

    @Bean
    public ObjectMapper objectMapper() {
        var objectMapper = new ObjectMapper();

        objectMapper.registerModule(new Jdk8Module());      // jdk 8 버전 이후 클래스
        objectMapper.registerModule(new JavaTimeModule());  // local date time
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);   // 모르는 json field 무시
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);    // 비어있는 빈을 만들 때

        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);   // 날짜 관련 직렬화

        objectMapper.setPropertyNamingStrategy(new PropertyNamingStrategies.SnakeCaseStrategy());   // json 스네이크케이스 사용
        
        return objectMapper;
    }

}
