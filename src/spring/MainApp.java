package spring;

import java.sql.Timestamp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("config.xml");
		
		BeanFactory factory = new XmlBeanFactory(res);
		
		SpringJDBC jdbcTemplate = (SpringJDBC)factory.getBean("beanId3");
		
		
		
		//jdbcTemplate.insert();
		//jdbcTemplate.delete(3);
		
		User user = new User();
		user.setUserName("Oussama");
		
		  user.setEmail("oussama@gmail.com"); user.setUserPassword("oussama18");
		  user.setRole("Engineer");
		 
		jdbcTemplate.loadById(2);
		//jdbcTemplate.update(2, user);
		//jdbcTemplate.loadAll();

	}

}
