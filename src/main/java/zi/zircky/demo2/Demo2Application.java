package zi.zircky.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zi.zircky.demo2.config.AppConfig;
import zi.zircky.demo2.model.AnimalsCage;

public class Demo2Application {
	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
		for (int i = 0; i < 5; i++) {
			AnimalsCage bean =
					applicationContext.getBean(AnimalsCage.class);
			bean.whatAnimalSay();
		}
	}
}
