package com.example.testingboard.configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;


@Configuration
@PropertySource("classpath:/application.properties")
public class DBConfiguration {

    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public HikariConfig hikariConfig() {

        return new HikariConfig();
    }

    @Bean
    public DataSource dataSource() {
        DataSource dataSource = new HikariDataSource( hikariConfig() );
        System.out.println( dataSource.toString() );

        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource( dataSource() );
        factoryBean.setMapperLocations( applicationContext.getResources("classpath:/mapper/**/*Mapper.xml") );
        factoryBean.setConfigLocation( applicationContext.getResource("classpath:/config/config.xml"));

        /*
        매퍼에 대한 리소스는 어디에서 가져오지?
         - ApplicationContext 객체에서 가져올 수 있다.
         - ApplicationContext는 쉽게 말해 프레임워크 컨테이너라고 생각하면 됨.
         - ApplicationContext는 애플리케이션이 스타트해서 끝나는 순간까지 이 애플리케이션에서 모든 자원들을 모아놓고 관리
         
         */

        return factoryBean.getObject();
    }

/*
SqlSessionTemplate 객체 생성
넘겨받은 SqlSessionFactory를 통해서 SqlSessionTemplate 객체를 생성 및 리턴
SQL구문의 실행과 트랜잭션 등을 관리하는 가장 열일하는 애
MYBatis의 SqlSession객체가 SpringMyBatis연동 모듈에서는 SqlSessionTemplate이 대체
 */
    @Bean
    public SqlSessionTemplate sqlSessionTemplate() throws Exception {

        return new SqlSessionTemplate(sqlSessionFactory());
    }

}





















