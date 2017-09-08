package pl.cbl.app;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "pl.cbl.*")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "pl.cbl.repository")
public class AppConfig extends WebMvcConfigurerAdapter {

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver vRes = new InternalResourceViewResolver();

		vRes.setViewClass(JstlView.class);
		vRes.setPrefix("/WEB-INF/view/");
		vRes.setSuffix(".jsp");

		return vRes;
	}

	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory() {

		LocalEntityManagerFactoryBean emfb = new LocalEntityManagerFactoryBean();
		emfb.setPersistenceUnitName("persUnit");
		return emfb;
	}

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager tm = new JpaTransactionManager(emf);
		return tm;
	}

	/*
	 * @Override public void addFormatters(FormatterRegistry registry) {
	 * registry.addConverter(getPublisherConverter());
	 * 
	 * 
	 * }
	 * 
	 * @Bean public pl.cbl.converter.PublisherConverter getPublisherConverter() {
	 * 
	 * return new pl.cbl.converter.PublisherConverter();
	 * 
	 * }
	 * 
	 * 
	 * @Bean public Validator validator() {
	 * 
	 * return new LocalValidatorFactoryBean();
	 * 
	 * }
	 */

}
