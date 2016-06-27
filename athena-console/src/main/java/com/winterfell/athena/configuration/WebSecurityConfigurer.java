package com.winterfell.athena.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.ExceptionMappingAuthenticationFailureHandler;

@Configuration
@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/css/**", "/js/**"); // #3
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// 设置拦截规则
		http.authorizeRequests().antMatchers("/").permitAll().anyRequest().authenticated();
		// 自定义登录
		http.formLogin().loginPage("/login").permitAll()
				.failureHandler(new ExceptionMappingAuthenticationFailureHandler());
		// 自定义注销
		http.logout().logoutUrl("/logout").logoutSuccessUrl("/");
		// 禁用 csrf
		http.csrf().disable();
		// session管理
		http.sessionManagement().sessionFixation().changeSessionId().maximumSessions(1).expiredUrl("/");
		// 添加验证码
		// http.addFilterBefore(, UsernamePasswordAuthenticationFilter.class);
	}
}
